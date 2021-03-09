package com.hs.userconsumer.controller;

import com.hs.userconsumer.entity.CommonResult;
import com.hs.userconsumer.entity.UserOrder;
import com.hs.userconsumer.service.UserOrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/08/19:11
 * @Description:
 */

@RestController
public class UserOrderController {

    @Resource
    private UserOrderService userOrderService;

    /**
     * 创建订单
     * http://localhost:8100/order/create?userId=用户ID&productId=商品ID&count=消费件数&money=花费余额
     * @param userOrder
     * @return
     */
    @GetMapping("/order/create")
    public CommonResult create(UserOrder userOrder) {
        userOrderService.create(userOrder);
        return new CommonResult(200, "订单创建成功");
    }
}
