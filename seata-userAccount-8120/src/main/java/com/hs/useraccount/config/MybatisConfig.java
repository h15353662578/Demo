package com.hs.useraccount.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/09/9:12
 * @Description:
 */

@Configuration
@MapperScan({"com.hs.useraccount.mapper"})
public class MybatisConfig {
}
