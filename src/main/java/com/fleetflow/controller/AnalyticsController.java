package com.fleetflow.controller;

import com.fleetflow.entity.FleetKpiView;
import com.fleetflow.service.AnalyticsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/analytics")
@RequiredArgsConstructor
public class AnalyticsController {

    private final AnalyticsService service;

    @GetMapping("/kpis")
    public FleetKpiView getKpis() {
        return service.getKpis();
    }
}