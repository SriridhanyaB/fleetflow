package com.fleetflow.repository;

import com.fleetflow.entity.FleetflowTrip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FleetflowTripRepository extends JpaRepository<FleetflowTrip, Integer> {
}