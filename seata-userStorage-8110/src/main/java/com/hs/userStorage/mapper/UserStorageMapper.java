package com.hs.userStorage.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/08/20:03
 * @Description:
 */

@Mapper
public interface UserStorageMapper {

    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
