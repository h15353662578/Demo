package com.hs.useraccount.controller;

import com.hs.useraccount.entity.CommonResult;
import com.hs.useraccount.service.UserAccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/09/8:30
 * @Description:
 */
@RestController
public class UserAccountController {

    @Resource
    private UserAccountService userAccountService;

    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
        userAccountService.decrease(userId, money);
        return new CommonResult(200, "扣减库存成功!");
    }

}
