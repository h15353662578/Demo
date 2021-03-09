package com.hs.useraccount.service.impl;

import com.hs.useraccount.mapper.UserAccountMapper;
import com.hs.useraccount.service.UserAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/09/8:29
 * @Description:
 */

@Slf4j
@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Resource
    private UserAccountMapper userAccountMapper;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("---> AccountService中扣减账户余额");
        userAccountMapper.decrease(userId, money);
        log.info("---> AccountService中扣减账户余额完成");
    }

}
