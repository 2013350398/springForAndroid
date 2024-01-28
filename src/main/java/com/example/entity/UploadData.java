package com.example.entity;

import lombok.Data;

import java.util.List;

@Data
public class UploadData {
    public List<UserInfo> userInfoList;
    public List<HistoryInfo> historyInfoList;
    public List<Integer> deleteHistory;
    public Integer deleteUser;
    public List<Photo> photoList;

    public UploadData(List<UserInfo> userInfoList, List<HistoryInfo> historyInfoList, List<Integer> deleteHistory, Integer deleteUser, List<Photo> photoList){
        this.userInfoList=userInfoList;
        this.historyInfoList=historyInfoList;
        this.deleteHistory= deleteHistory;
        this.deleteUser=deleteUser;
        this.photoList=photoList;
    }
    public UploadData(){}
}
