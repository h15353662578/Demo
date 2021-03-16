package com.hs.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hs.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/***
 * UserMapper
 * @author Huasheng
 */

@Mapper
public interface UserMapper extends BaseMapper {

    /***
     * 查询
     * @return
     */
    @Select("select * from user")
    public List<User> findAll();

    /***
     * 添加
     * @param user
     */
    @Insert("insert into user (name = #{name},password+#{password},sex=#{sex},age=#{age},phone=#{phone})")
    int create(User user);

    /***
     * 更新
     * @param user
     */
    @Update("update `user` SET  name = #{name}, username = #{userName}, password = #{password},sex = #{sex}, age = #{age}, phone = #{phone} where username = #{userName}")
    void update(User user);

    /***
     * 根据用户名删除
     * @param userName
     */
    @Delete("delete from `user` where username=#{userName}")
    void delete(Integer userName);
}
