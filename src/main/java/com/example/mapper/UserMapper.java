package com.example.mapper;

import com.example.entity.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Insert("insert into user(userid, username, password, phone, emil, login) values(#{userid}, #{username}, #{password}, #{phone}, #{emil}, #{login})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    Integer insert(UserInfo userInfo);

    @Select("select * from user")
    List<UserInfo> select();

    @Select("select * from user where userid = #{userid}")
    UserInfo selectById(Integer userid);

    @Delete("delete from user where userid = #{userid}")
    Integer delete(Integer userid);

    @Update("update user set password = #{password}, phone = #{phone}, emil = #{emil}, login = #{login} where userid = #{userid}")
    Integer update(UserInfo userInfo);


}
