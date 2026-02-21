package com.fleetflow.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Vehicle name is required")
    private String name;

    @NotBlank(message = "Vehicle number is required")
    @Column(unique = true)
    private String vehicleNumber;

    private String type;

    private String status;
}