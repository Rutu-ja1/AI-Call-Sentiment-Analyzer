package com.rutuja.ai_call_sentiment_analyzer.controller;

import com.rutuja.ai_call_sentiment_analyzer.entity.CallRecord;
import com.rutuja.ai_call_sentiment_analyzer.repository.CallRecordRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/calls")
@CrossOrigin(origins = "http://localhost:3000")
public class CallController {

    private final CallRecordRepository repository;

    public CallController(CallRecordRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/upload")
    public ResponseEntity<?> uploadCall(
            @RequestParam("file") MultipartFile file,
            @RequestParam("agentName") String agentName) {

        try {

            CallRecord record = new CallRecord();
            record.setAgentName(agentName);
            record.setFileName(file.getOriginalFilename());
            record.setTranscript("Sample transcript for now");
            record.setSentiment("POSITIVE");
            record.setScore(0.95);
            record.setCreatedAt(LocalDateTime.now());

            repository.save(record);

            return ResponseEntity.ok("File uploaded successfully");

        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Upload failed");
        }
    }
}