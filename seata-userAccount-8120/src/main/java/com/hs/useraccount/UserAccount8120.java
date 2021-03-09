package com.hs.useraccount;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/09/8:17
 * @Description:
 */

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class UserAccount8120 {
    public static void main(String[] args) {
        SpringApplication.run(UserAccount8120.class,args);
    }
}
