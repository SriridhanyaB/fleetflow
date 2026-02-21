package com.fleetflow.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "vw_fleet_kpis")
@Data
public class FleetKpiView {

    @Id
    private Long activeFleet;

    private Long maintenanceAlerts;
    private Long idleFleet;
    private Double utilizationRatePct;
    private Long pendingCargo;
}