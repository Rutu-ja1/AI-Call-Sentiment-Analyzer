package com.rutuja.ai_call_sentiment_analyzer.repository;

import com.rutuja.ai_call_sentiment_analyzer.entity.CallRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CallRecordRepository extends JpaRepository<CallRecord, Long> {

    // ✅ Sentiment summary
    @Query("SELECT c.sentiment, COUNT(c) FROM CallRecord c GROUP BY c.sentiment")
    List<Object[]> getSentimentSummary();

    // ✅ Agent performance
    @Query("SELECT c.agentName, AVG(c.score) FROM CallRecord c GROUP BY c.agentName")
    List<Object[]> getAgentPerformance();

}