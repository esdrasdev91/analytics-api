package com.analytics.analyticsapi.repository;

import com.analytics.analyticsapi.entity.BrandAnalyticsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BrandAnalyticsRepository extends JpaRepository<BrandAnalyticsEntity, Long> {
    Optional<BrandAnalyticsEntity> findByBrand(String brand);
}
