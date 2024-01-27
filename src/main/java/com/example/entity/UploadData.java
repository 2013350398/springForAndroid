package com.example.entity;

import lombok.Data;

import java.util.List;

@Data
public class UploadData {
    public List<UserInfo> userInfoList;
    public List<HistoryInfo> historyInfoList;
    public List<Integer> deleteHistory;

    public UploadData(List<UserInfo> userInfoList, List<HistoryInfo> historyInfoList, List<Integer> deleteHistory){
        this.userInfoList=userInfoList;
        this.historyInfoList=historyInfoList;
        this.deleteHistory= deleteHistory;
    }
    public UploadData(){}
}
