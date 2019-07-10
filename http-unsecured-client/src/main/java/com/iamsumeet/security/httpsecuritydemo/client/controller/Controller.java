package com.iamsumeet.security.httpsecuritydemo.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    private RestTemplate restTemplate;

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/relaySecuredResponse")
    public String relaySecuredResponse(){
        return "Message from server is : "+ restTemplate.getForObject("https://localhost:8764/sayHelloSecurely", String.class);
    }
}
