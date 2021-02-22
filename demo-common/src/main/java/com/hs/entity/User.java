package com.hs.entity;

import lombok.Data;

/***
 *用户表
 */

@Data
public class User {

    private Integer id;

    private String name;

    private String userName;

    private String password;

    private Integer age;

    private String phone;

    private Integer sex;
}
