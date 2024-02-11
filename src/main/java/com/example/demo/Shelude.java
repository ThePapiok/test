package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Shelude{

    @Scheduled(fixedRate = 840000)
    public void callEndpoint() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject("https://test-en.onrender.com/hello", String.class);
    }
}