package com.example.controller;


import com.example.entity.*;
import com.example.service.*;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class DataController {
    @Autowired
    private DetectionHistoryService detectionHistoryService;
    @Autowired
    private UserService userService;
    //获取定时传送的数据
    @PostMapping("/receiveData")
    public String receiveData(@RequestBody UploadData requestData) {
        try{

//            // 将JSON数据中的信息提取到Pair对象中
//            Pair<List<UserInfo>, List<HistoryInfo>> dataPair = Pair.of(requestData.getKey(), requestData.getValue());
            // 获取存储的两个列表
            List<UserInfo> userList = requestData.getUserInfoList();
            List<HistoryInfo> historyList = requestData.getHistoryInfoList();

            // 处理数据 更新数据库
            updateUser(userList);
            updateHistory(historyList);
//            System.out.println("userList: " + userList.size());
//            System.out.println("historyList: " + historyList.size());
        }catch(Exception e){
            System.out.println(e.toString());
        }

        // 返回响应
        return "Data received successfully!";
    }
    //发送user表
    @GetMapping("/sendUser")
    public List<UserInfo> sendUser() {
        List<UserInfo> userList = userService.select();
//        List<HistoryInfo> historyList = detectionHistoryService.select();
//        UploadData sendData=new UploadData(userList,historyList);
        return userList;
    }
    //发送对应user的history记录
    @GetMapping("/sendHistory")
    public List<HistoryInfo> sendHistory() {
//        List<UserInfo> userList = userService.select();
        List<HistoryInfo> historyList = detectionHistoryService.selectHistory();
//        UploadData sendData=new UploadData(userList,historyList);
        return historyList;
    }
    @GetMapping("/test")
    public void hello() {
        System.out.println("hello");
    }

//insert-0
//没变化-1
//update-2
//delete-3
    public void updateUser(List<UserInfo> userList) {
        for (UserInfo u:userList) {
            if(u.getUploadFlag()==0){
                System.out.println("insertUser"+u.toString());
                userService.insertUser(u);}
            else if(u.getUploadFlag()==2){
                System.out.println("updateUser"+u.toString());
                userService.updateUser(u);}
            else if(u.getUploadFlag()==3){
                System.out.println("deletetUser"+u.toString());
                userService.deletetUser(u.getUserid());}
        }
//        System.out.println("updateUser");
    }
    public void updateHistory( List<HistoryInfo> historyList) {
        for (HistoryInfo h:historyList) {
            if(h.getUploadFlag()==0){
                System.out.println("insertDetectionHistory"+h.toString());
                detectionHistoryService.insertDetectionHistory(h);}
            else if(h.getUploadFlag()==3){
                System.out.println("deletetDetectionHistory"+h.toString());
                detectionHistoryService.deletetDetectionHistory(h.getId());}
        }
//        System.out.println("updateHistory");
    }
}
