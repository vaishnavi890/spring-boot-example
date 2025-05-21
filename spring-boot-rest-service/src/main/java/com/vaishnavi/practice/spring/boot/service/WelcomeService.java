package com.vaishnavi.practice.spring.boot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    @Value("${welcome.message}")
    private String welcomeMessage;

    public String retrieveWelcomeMessage() {
        return welcomeMessage;
    }
}

