package com.example.ollamaai.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestClient {
    private RestTemplate restTemplate;

    @Autowired
    RestClient(RestTemplateBuilder builder) {
        restTemplate = builder.build();
    }

}
