package com.rutuja.ai_call_sentiment_analyzer.entity;

import lombok.Data;

@Data
public class AIResponse {

    private String transcript;
    private String sentiment;
    private Double score;
}