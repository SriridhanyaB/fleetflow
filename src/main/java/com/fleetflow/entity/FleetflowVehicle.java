package com.fleetflow.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "fleetflow_vehicle")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FleetflowVehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(unique = true)
    private String licensePlate;

    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType;

    private String region;

    private Double maxCapacityKg;

    private Double odometer;

    private Double acquisitionCost;

    @Enumerated(EnumType.STRING)
    private VehicleStatus status;

    private Boolean outOfService;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}