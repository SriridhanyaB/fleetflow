package com.fleetflow.repository;

import com.fleetflow.entity.FleetflowVehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FleetflowVehicleRepository extends JpaRepository<FleetflowVehicle, Integer> {
}