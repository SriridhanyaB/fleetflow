package com.fleetflow.controller;

import com.fleetflow.entity.FleetflowTrip;
import com.fleetflow.service.TripService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trips")
@RequiredArgsConstructor
public class TripController {

    private final TripService service;

    @GetMapping
    public List<FleetflowTrip> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public FleetflowTrip getById(@PathVariable Integer id) {
        return service.getById(id)
                .orElseThrow(() -> new RuntimeException("Trip not found"));
    }

    @PostMapping
    public FleetflowTrip create(@RequestBody FleetflowTrip trip) {
        return service.save(trip);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    // 🔥 Update trip state (dispatched / completed / cancelled)
    @PutMapping("/{id}/state")
    public FleetflowTrip updateState(
            @PathVariable Integer id,
            @RequestParam String value
    ) {
        return service.updateState(id, value);
    }
}