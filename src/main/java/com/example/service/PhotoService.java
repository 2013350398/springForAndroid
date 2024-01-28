package com.example.service;

import com.example.entity.Photo;
import com.example.mapper.PhotoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PhotoService {
    @Autowired
    private PhotoMapper photoMapper;
    public Integer insertPhoto(Photo photo) {return photoMapper.insert(photo);}
    public Integer deletetPhoto(Integer id) {return photoMapper.delete(id);}
    public List<Photo> selectAllPhoto() {return photoMapper.select();}
    public Photo selectById(Integer history_id) {return photoMapper.selectById(history_id);}
}
