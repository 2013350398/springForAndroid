package com.example.entity;

import lombok.Data;

@Data
public class UserInfo {
    public Integer userid;
    public String username;
    public String password;
    public String phone;
    public String emil;
    public Integer uploadFlag;
    public Integer login;//是否有设备已经登录


    public UserInfo(){}
    //更新数据
    public UserInfo(Integer userid, String username, String password, String phone, String emil, Integer uploadFlag, Integer login) {
        this.userid=userid;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.emil = emil;
        this.uploadFlag=uploadFlag;
        this.login=login;
    }
}

