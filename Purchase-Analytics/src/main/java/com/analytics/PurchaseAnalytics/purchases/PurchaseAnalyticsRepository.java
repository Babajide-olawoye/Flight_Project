package com.analytics.PurchaseAnalytics.purchases;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseAnalyticsRepository extends JpaRepository<PurchaseAnalytics, Long> {
}


