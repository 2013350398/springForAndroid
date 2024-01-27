package com.example.mapper;

import com.example.entity.HistoryInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DetectionHistoryMapper {

    @Insert("insert into history(id, photo_url, type_name, purity_value, create_time, user_id) values(#{id}, #{photo_url}, #{type_name}, #{purity_value}, #{create_time}, #{user_id})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    Integer insert(HistoryInfo historyInfo);

    @Select("select * from history")
    List<HistoryInfo> select();

    @Select("select * from history where id = #{id}")
    HistoryInfo selectById(Integer id);
    @Select("select * from history where user_id = #{user_id}")
    List<HistoryInfo> selectByUserId(Integer user_id);

    @Delete("delete from history where id = #{id}")
    Integer delete(Integer id);

//    @Update("update history set password = #{password}, phone = #{phone}, emil = #{emil} where userid = #{userid}")
//    Integer update(DetectionHistory history);

}
