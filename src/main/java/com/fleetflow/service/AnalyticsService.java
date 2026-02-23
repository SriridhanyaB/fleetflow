package com.fleetflow.service;

import com.fleetflow.entity.FleetKpiView;
import com.fleetflow.repository.FleetKpiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnalyticsService {

    private final FleetKpiRepository repository;

    public FleetKpiView getKpis() {
        FleetKpiView data = repository.fetchKpis();

        if (data == null) {
            throw new RuntimeException("KPI view returned no data");
        }

        return data;
    }
}