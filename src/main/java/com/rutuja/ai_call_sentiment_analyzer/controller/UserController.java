package com.rutuja.ai_call_sentiment_analyzer.controller;

import org.springframework.web.bind.annotation.*;
import com.rutuja.ai_call_sentiment_analyzer.entity.User;
import com.rutuja.ai_call_sentiment_analyzer.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return repo.save(user);
    }
}