package com.fleetflow.service;

import com.fleetflow.entity.FleetflowDriver;
import com.fleetflow.repository.FleetflowDriverRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DriverService {

    private final FleetflowDriverRepository repository;

    public List<FleetflowDriver> getAll() {
        return repository.findAll();
    }

    public Optional<FleetflowDriver> getById(Integer id) {
        return repository.findById(id);
    }

    public FleetflowDriver save(FleetflowDriver driver) {
        return repository.save(driver);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}