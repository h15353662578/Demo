package com.hs.useraccount.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/09/8:25
 * @Description:
 */
@Mapper
public interface UserAccountMapper {

    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}
