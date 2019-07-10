package com.iamsumeet.security.httpsecuritydemo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnsecuredClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(UnsecuredClientApplication.class, args);
    }

}
