package com.fleetflow.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "fleetflow_driver")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FleetflowDriver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String phone;
    private String email;

    @Column(unique = true)
    private String licenseNumber;

    @Enumerated(EnumType.STRING)
    private VehicleType licenseCategory;

    private LocalDate licenseExpiry;

    @Enumerated(EnumType.STRING)
    private DriverStatus status;

    private Double safetyScore;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}