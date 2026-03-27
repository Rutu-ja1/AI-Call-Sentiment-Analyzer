package com.rutuja.ai_call_sentiment_analyzer.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class CallRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;

    private String agentName;

    private String transcript; // AI will fill later

    private String sentiment; // Positive/Negative

    private Double score; // Sentiment score

    private LocalDateTime createdAt;
}