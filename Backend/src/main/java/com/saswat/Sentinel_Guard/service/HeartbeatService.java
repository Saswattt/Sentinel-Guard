package com.saswat.Sentinel_Guard.service;

import com.saswat.Sentinel_Guard.entity.SystemCheck;
import com.saswat.Sentinel_Guard.repository.SystemCheckRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j // This allows us to see logs in the terminal
public class HeartbeatService {

    private final SystemCheckRepository repository;

    // Runs every 60,000 milliseconds (1 minute)
    @Scheduled(fixedRate = 60000)
    public void monitorSystem() {
        SystemCheck heartbeat = SystemCheck.builder()
                .serviceName("Sentinel-Automatic-Monitor")
                .status("HEALTHY")
                .timestamp(LocalDateTime.now())
                .build();

        repository.save(heartbeat);
        
        log.info("Sentinel Heartbeat: System health logged at {}", heartbeat.getTimestamp());
    }
}