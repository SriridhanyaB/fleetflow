package com.fleetflow.controller;

import com.fleetflow.entity.FleetflowDriver;
import com.fleetflow.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drivers")
@RequiredArgsConstructor
public class DriverController {

    private final DriverService service;

    @GetMapping
    public List<FleetflowDriver> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public FleetflowDriver getById(@PathVariable Integer id) {
        return service.getById(id)
                .orElseThrow(() -> new RuntimeException("Driver not found"));
    }

    @PostMapping
    public FleetflowDriver create(@RequestBody FleetflowDriver driver) {
        return service.save(driver);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}