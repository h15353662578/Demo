package com.hs.userconsumer.service;

import com.hs.userconsumer.entity.UserOrder;
import org.springframework.cloud.openfeign.FeignClient;


/**
 * @author Huasheng9
 * @Auther: 华生
 * @Date: 2021/03/08/15:38
 * @Description:
 */

public interface UserOrderService {

    /**
     * 创建订单
     * @param userOrder
     */
    void create(UserOrder userOrder);
}