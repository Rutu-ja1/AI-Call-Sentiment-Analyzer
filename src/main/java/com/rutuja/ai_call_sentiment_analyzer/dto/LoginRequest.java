package com.rutuja.ai_call_sentiment_analyzer.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}