package com.saswat.Sentinel_Guard.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "system_checks")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SystemCheck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serviceName;
    private String status;
    private LocalDateTime timestamp;
}