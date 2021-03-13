package com.hs.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/12/14:40
 * @Description:
 */

@EnableDiscoveryClient
@SpringBootApplication
public class MqProvider {
    public static void main(String[] args) {
        SpringApplication.run(MqProvider.class,args);
    }
}
