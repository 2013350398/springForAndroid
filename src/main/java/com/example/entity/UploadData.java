package com.example.entity;

import lombok.Data;

import java.util.List;

@Data
public class UploadData {
    public List<UserInfo> userInfoList;
    public List<HistoryInfo> historyInfoList;

    public UploadData(List<UserInfo> userInfoList, List<HistoryInfo> historyInfoList){
        this.userInfoList=userInfoList;
        this.historyInfoList=historyInfoList;
    }
    public UploadData(){}
}
