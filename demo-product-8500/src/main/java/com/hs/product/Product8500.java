package com.hs.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/10/15:32
 * @Description:
 */

@EnableDiscoveryClient
@SpringBootApplication
public class Product8500 {
    public static void main(String[] args) {
        SpringApplication.run(Product8500.class,args);
    }
}
