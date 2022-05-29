package com.sairam.SpringJersey.service;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public interface HelloService {

    @Retryable(value = RuntimeException.class, maxAttempts = 5, backoff = @Backoff(delay = 100))
    void retryService(String sql);



}
