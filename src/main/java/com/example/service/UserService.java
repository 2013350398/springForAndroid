package com.example.service;

import com.example.entity.UserInfo;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public Integer insertUser(UserInfo user) {
        return userMapper.insert(user);
    }
    public Integer deletetUser(Integer userid) {return userMapper.delete(userid);}
    public Integer updateUser(UserInfo user) {return userMapper.update(user);}
    public List<UserInfo> select() {return userMapper.select();}
    public UserInfo selectById(Integer userid) {return userMapper.selectById(userid);}

}
