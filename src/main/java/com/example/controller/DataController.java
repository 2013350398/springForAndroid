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
    @PostMapping("/receiveData")
    public String receiveData(@RequestBody UploadData  requestData) {
        try{

//            // 将JSON数据中的信息提取到Pair对象中
//            Pair<List<UserInfo>, List<HistoryInfo>> dataPair = Pair.of(requestData.getKey(), requestData.getValue());
            // 获取存储的两个列表
            List<UserInfo> userList = requestData.getUserInfoList();
            List<HistoryInfo> historyList = requestData.getHistoryInfoList();

            // 处理数据，例如打印日志
            System.out.println("userList: " + userList.size());
            System.out.println("historyList: " + historyList.size());
        }catch(Exception e){
            System.out.println(e.toString());
        }

        // 返回响应
        return "Data received successfully!";
    }
    @GetMapping("/getData")
    public Map.Entry<List<UserInfo>, List<HistoryInfo>> getData() {
        List<UserInfo> userList = userService.select();
        List<HistoryInfo> historyList = detectionHistoryService.select();
        Map.Entry<List<UserInfo>, List<HistoryInfo>> pair = new AbstractMap.SimpleEntry<>(userList, historyList);
        return pair;
    }
    @GetMapping("/test")
    public void hello() {
        System.out.println("hello");
    }
}
