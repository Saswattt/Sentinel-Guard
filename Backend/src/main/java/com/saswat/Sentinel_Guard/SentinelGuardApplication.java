package com.saswat.Sentinel_Guard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling; // Add this

@SpringBootApplication
@EnableScheduling // Add this
public class SentinelGuardApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentinelGuardApplication.class, args);
    }
}