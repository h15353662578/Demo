package com.hs.entity;

import lombok.Data;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/15/16:22
 * @Description:
 */

@Data
public class UserOrder {

    private Integer id;

    private String userId;

    private String productId;

    private String count;

    private Integer money;

    private String status;

}
