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
    public Integer insertDetectionHistory(HistoryInfo historyInfo) {return detectionHistoryMapper.insertHistory(historyInfo);}

    public Integer deletetDetectionHistory(Integer detectionHistoryid) {return detectionHistoryMapper.deleteHistory(detectionHistoryid);}
    public Integer deletetDetectionHistoryByUserId(Integer userId) {return detectionHistoryMapper.deletetDetectionHistoryByUserId(userId);}
    public List<HistoryInfo> selectHistory() {return detectionHistoryMapper.selectHistory();}
    public HistoryInfo selectById(Integer id) {return detectionHistoryMapper.selectHistoryById(id);}
    public List<HistoryInfo> selectByUserId(Integer user_id) {return detectionHistoryMapper.selectHistoryByUserId(user_id);}

}
