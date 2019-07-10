package com.iamsumeet.security.httpsecuritydemo.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/sayHelloSecurely")
    public String sayHelloSecurely(){
        return "Hello there, I am a secured response";
    }
}
