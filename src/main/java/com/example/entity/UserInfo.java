package com.example.entity;

import lombok.Data;

@Data
public class UserInfo {
    public Integer userid;
    public String username;
    public String password;
    public String phone;
    public String emil;

    public UserInfo(){}
    public UserInfo(Integer userid, String username, String password, String phone, String emil) {
        this.userid=userid;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.emil = emil;
    }
}

