package com.fleetflow.service;

import com.fleetflow.entity.FleetflowVehicle;
import com.fleetflow.repository.FleetflowVehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleService {

    private final FleetflowVehicleRepository repository;

    public List<FleetflowVehicle> getAll() {
        return repository.findAll();
    }

    public FleetflowVehicle save(FleetflowVehicle vehicle) {
        return repository.save(vehicle);
    }
}