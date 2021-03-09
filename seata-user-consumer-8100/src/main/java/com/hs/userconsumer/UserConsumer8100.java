package com.hs.userconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/08/15:35
 * @Description:
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UserConsumer8100 {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumer8100.class,args);
    }
}
