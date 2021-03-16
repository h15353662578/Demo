package com.hs.mqconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/12/15:08
 * @Description:
 */

@EnableDiscoveryClient
@SpringBootApplication
public class MqConsumer {
    public static void main(String[] args) {
        SpringApplication.run(MqConsumer.class,args);
    }
}