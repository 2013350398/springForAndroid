package com.example.entity;

import lombok.Data;

@Data
public class HistoryInfo {
    public Integer id;
    public String photo_url;//uri
    public String type_name;
    public String purity_value;
    public String create_time;
    public String user_id;
    public Integer uploadFlag;

    public HistoryInfo(Integer id, String photo_url, String type_name, String purity_value, String create_time, String user_id, Integer uploadFlag){
        this.id=id;
        this.photo_url=photo_url;
        this.type_name=type_name;
        this.purity_value=purity_value;
        this.create_time=create_time;
        this.user_id=user_id;
        this.uploadFlag=uploadFlag;

    }
}
