package com.fleetflow.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "fleetflow_trip")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FleetflowTrip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String origin;
    private String destination;
    private LocalDateTime scheduledDate;
    private LocalDateTime completionDate;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private FleetflowVehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private FleetflowDriver driver;

    private String cargoDescription;
    private Double cargoWeightKg;
    private Double revenue;
    private Double odometerStart;
    private Double odometerEnd;

    @Enumerated(EnumType.STRING)
    private TripState state;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}