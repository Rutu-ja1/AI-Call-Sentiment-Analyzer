package com.rutuja.ai_call_sentiment_analyzer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rutuja.ai_call_sentiment_analyzer.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}