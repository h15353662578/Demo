package com.hs.userconsumer.service.impl;

import com.hs.userconsumer.entity.UserOrder;
import com.hs.userconsumer.mapper.UserOrderMapper;
import com.hs.userconsumer.service.UserAccountService;
import com.hs.userconsumer.service.UserOrderService;
import com.hs.userconsumer.service.UserStorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/08/19:06
 * @Description:
 */

@Service
@Slf4j
public class UserOrderServiceImpl implements UserOrderService {

    @Resource
    private UserOrderMapper userOrderMapper;

    @Resource
    private UserAccountService userAccountService;

    @Resource
    private UserStorageService userStorageService;

    /**
     * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
     * 简单说:
     * 下订单->减库存->减余额->改状态
     * GlobalTransactional seata开启分布式事务,异常时回滚,name保证唯一即可
     *
     * @param userOrder 订单对象
     */

    @Override
    @GlobalTransactional(name = "seata-user-order-service", rollbackFor = Exception.class)
    public void create(UserOrder userOrder) {
        // 1 新建订单
        log.info("----->开始新建订单");
        userOrderMapper.create(userOrder);

        // 2 扣减库存
        log.info("----->订单微服务开始调用库存,做扣减Count");
        userStorageService.decrease(userOrder.getProductId(), userOrder.getCount());
        log.info("----->订单微服务开始调用库存,做扣减End");

        // 3 扣减账户
        log.info("----->订单微服务开始调用账户,做扣减Money");
        userAccountService.decrease(userOrder.getUserId(), userOrder.getMoney());
        log.info("----->订单微服务开始调用账户,做扣减End");

        // 4 修改订单状态,从0到1,1代表已完成
        log.info("----->修改订单状态开始");

        userOrderMapper.update(userOrder.getUserId(), 0);

        log.info("----->下订单结束");
    }
}
