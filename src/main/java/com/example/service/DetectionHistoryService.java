package com.example.service;

import com.example.entity.HistoryInfo;
import com.example.mapper.DetectionHistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetectionHistoryService {
    @Autowired
    private DetectionHistoryMapper detectionHistoryMapper;
    public Integer insertDetectionHistory(HistoryInfo historyInfo) {return detectionHistoryMapper.insert(historyInfo);}

    public Integer deletetDetectionHistory(Integer detectionHistoryid) {return detectionHistoryMapper.delete(detectionHistoryid);}
    public List<HistoryInfo> select() {
        List<HistoryInfo>historyInfoList=detectionHistoryMapper.select();
        for (HistoryInfo h:historyInfoList) {
            System.out.println("historyInfoList:"+h.toString());
        }
        return detectionHistoryMapper.select();}
    public HistoryInfo selectById(Integer id) {return detectionHistoryMapper.selectById(id);}
    public List<HistoryInfo> selectByUserId(Integer user_id) {return detectionHistoryMapper.selectByUserId(user_id);}

}
