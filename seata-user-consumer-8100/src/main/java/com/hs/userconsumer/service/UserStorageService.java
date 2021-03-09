package com.hs.userconsumer.service;

import com.hs.userconsumer.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/08/15:47
 * @Description:
 */

@FeignClient(value = "user-storage-service")
public interface UserStorageService {
    /**
     * 减库存
     * @param productId
     * @param count
     * @return
     */
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}