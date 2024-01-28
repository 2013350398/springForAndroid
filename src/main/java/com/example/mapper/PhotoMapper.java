package com.example.mapper;
import com.example.entity.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PhotoMapper {
    @Insert("insert into photo(id, history_id, base64Image) values(#{id}, #{history_id}, #{base64Image})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    Integer insert(Photo photoInfo);

    @Select("select * from photo")
    List<Photo> select();

    @Select("select * from photo where history_id = #{history_id}")
    Photo selectById(Integer history_id);

    @Delete("delete from photo where id = #{id}")
    Integer delete(Integer id);
}
