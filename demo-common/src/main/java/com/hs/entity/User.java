package com.hs.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/***
 *用户表
 */

@ToString
@Data
public class User implements Serializable {

    private Integer id;

    private String name;

    private String userName;

    private String password;

    private Integer age;

    private String phone;

    private Integer sex;

    private String sexStr;

    public String getSexStr() {
        if (sex!=null){
            if (sex == 1){
                sexStr = "男";
            }else if (sex == 0){
                sexStr = "女";
            }
        }
        return sexStr;
    }

    public void setSexStr(String sexStr) {
        this.sexStr = sexStr;
    }
}
