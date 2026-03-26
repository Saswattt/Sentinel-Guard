package com.saswat.Sentinel_Guard.controller;

import com.saswat.Sentinel_Guard.entity.SystemCheck;
import com.saswat.Sentinel_Guard.repository.SystemCheckRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sentinel")
@RequiredArgsConstructor
@CrossOrigin(
    origins = "http://localhost:4200", 
    methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS}
)
public class HealthCheckController {

    private final SystemCheckRepository repository;

    @GetMapping("/logs")
    public List<SystemCheck> getLogs() {
        return repository.findAll();
    }

    @DeleteMapping("/logs/{id}")
    public void deleteLog(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping("/logs/{id}/resolve")
    public SystemCheck resolveLog(@PathVariable Long id) {
        SystemCheck log = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Log entry not found"));
        
        // Note: Ensure your SystemCheck entity has @Data or @Setter from Lombok 
        // for this setStatus method to work!
        log.setStatus("RESOLVED"); 
        return repository.save(log);
    }
}