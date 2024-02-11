package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Test {

    private final RestTemplate restTemplate;

    public Test(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Scheduled(fixedRate = 840000) // 14 minut = 840000 milisekund
    public void keepAlive() {
        String response = restTemplate.getForObject("http://twoja-aplikacja/endpoint", String.class);
    }
}
