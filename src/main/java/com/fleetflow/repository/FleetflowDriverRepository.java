package com.fleetflow.repository;

import com.fleetflow.entity.FleetflowDriver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FleetflowDriverRepository extends JpaRepository<FleetflowDriver, Integer> {
}