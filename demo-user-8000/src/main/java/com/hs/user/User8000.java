package com.hs.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/***
 * @author 华生
 * 用户操作
 * UserApplication
 */
@EnableDiscoveryClient
@SpringBootApplication
public class User8000 {

    public static void main(String[] args) {
        SpringApplication.run(User8000.class,args);
    }
}
