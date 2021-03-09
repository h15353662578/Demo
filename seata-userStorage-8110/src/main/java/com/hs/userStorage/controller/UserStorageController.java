package com.hs.userStorage.controller;

import com.hs.userStorage.entity.CommonResult;
import com.hs.userStorage.service.UserStorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/08/20:23
 * @Description:
 */

@RestController
@Slf4j
public class UserStorageController {
    @Resource
    private UserStorageService userStorageService;

    @RequestMapping("/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count){
        userStorageService.decrease(productId, count);
        log.info("扣减库存成功!");
        return new CommonResult(200, "扣减库存成功!");
    }

}
