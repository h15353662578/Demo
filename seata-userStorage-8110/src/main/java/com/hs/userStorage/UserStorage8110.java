package com.hs.userStorage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/08/20:00
 * @Description:
 */

@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class UserStorage8110 {
    public static void main(String[] args) {
        SpringApplication.run(UserStorage8110.class,args);
    }
}
