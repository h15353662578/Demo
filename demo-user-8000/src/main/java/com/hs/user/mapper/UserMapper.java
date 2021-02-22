package com.hs.user.mapper;

import com.hs.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/***
 * UserMapper
 * @author Huasheng
 */

@Mapper
public interface UserMapper {

    @Select("select * from user")
    public List<User> findAll();
}
