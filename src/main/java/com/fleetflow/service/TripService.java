package com.fleetflow.service;

import com.fleetflow.entity.FleetflowTrip;
import com.fleetflow.repository.FleetflowTripRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TripService {

    private final FleetflowTripRepository repository;

    public List<FleetflowTrip> getAll() {
        return repository.findAll();
    }

    public Optional<FleetflowTrip> getById(Integer id) {
        return repository.findById(id);
    }

    public FleetflowTrip save(FleetflowTrip trip) {
        return repository.save(trip);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    // Update trip state (dispatch / complete / cancel)
    public FleetflowTrip updateState(Integer id, String state) {
        FleetflowTrip trip = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Trip not found"));

        trip.setState(Enum.valueOf(
                com.fleetflow.entity.TripState.class,
                state
        ));

        return repository.save(trip);
    }
}