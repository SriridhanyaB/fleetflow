package com.fleetflow.repository;

import com.fleetflow.entity.FleetKpiView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FleetKpiRepository extends JpaRepository<FleetKpiView, Long> {

    @Query(value = "SELECT * FROM vw_fleet_kpis LIMIT 1", nativeQuery = true)
    FleetKpiView fetchKpis();
}