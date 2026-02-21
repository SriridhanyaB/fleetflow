package com.fleetflow.controller;

import com.fleetflow.entity.FleetflowVehicle;
import com.fleetflow.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/vehicles")
@RequiredArgsConstructor
public class VehicleController {

    private final VehicleService service;

    @GetMapping
    public List<FleetflowVehicle> getAll() {
        return service.getAll();
    }

    @PostMapping
    public FleetflowVehicle create(@RequestBody FleetflowVehicle vehicle) {
        return service.save(vehicle);
    }
}