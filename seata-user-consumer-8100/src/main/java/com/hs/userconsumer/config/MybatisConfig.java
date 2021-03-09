package com.hs.userconsumer.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/08/20:16
 * @Description:
 */

@Configuration
@MapperScan({"com.hs.userconsumer.mapper"})
public class MybatisConfig {
}
