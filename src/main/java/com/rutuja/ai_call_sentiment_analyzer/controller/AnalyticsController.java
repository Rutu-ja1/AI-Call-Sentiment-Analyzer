package com.rutuja.ai_call_sentiment_analyzer.controller;

import com.rutuja.ai_call_sentiment_analyzer.repository.CallRecordRepository;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/analytics")
public class AnalyticsController {

    private final CallRecordRepository repository;

    public AnalyticsController(CallRecordRepository repository) {
        this.repository = repository;
    }

    // ===============================
    // SENTIMENT SUMMARY
    // ===============================
    @GetMapping("/sentiment")
    public List<Map<String, Object>> getSentimentSummary() {

        List<Object[]> data = repository.getSentimentSummary();

        List<Map<String, Object>> result = new ArrayList<>();

        for (Object[] row : data) {
            Map<String, Object> map = new HashMap<>();
            map.put("sentiment", row[0]);
            map.put("count", row[1]);
            result.add(map);
        }

        return result;
    }

    // ===============================
    // AGENT PERFORMANCE
    // ===============================
    @GetMapping("/agent")
    public List<Map<String, Object>> getAgentPerformance() {

        List<Object[]> data = repository.getAgentPerformance();

        List<Map<String, Object>> result = new ArrayList<>();

        for (Object[] row : data) {
            Map<String, Object> map = new HashMap<>();
            map.put("agent", row[0]);
            map.put("score", row[1]);
            result.add(map);
        }

        return result;
    }
}