package com.hs.userconsumer.mapper;

import com.hs.userconsumer.entity.UserOrder;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/08/15:41
 * @Description:
 */

@Mapper
public interface UserOrderMapper {

    /***
     * 新建订单
     * @param userOrder
     * @return
     */
    int create(UserOrder userOrder);

    /**
     * 2 修改订单状态,从0改为1
     *
     * @param userId
     * @param status
     * @return
     */
    int update(@Param("userId") Long userId, @Param("status") Integer status);
}
