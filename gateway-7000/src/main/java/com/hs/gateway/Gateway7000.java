package com.hs.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/02/15:38
 * @Description:
 */

@SpringBootApplication
@EnableDiscoveryClient
public class Gateway7000 {
    public static void main(String[] args) {
        SpringApplication.run(Gateway7000.class,args);
    }
}
