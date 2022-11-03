package com.analytics.PurchaseAnalytics.purchases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseAnalyticsService {
	
	private final PurchaseAnalyticsRepository purchaseAnalyticsRepository; 

	@Autowired
	public PurchaseAnalyticsService(PurchaseAnalyticsRepository purchaseAnalyticsRepository) {
		this.purchaseAnalyticsRepository = purchaseAnalyticsRepository;
	}
	
	//Fetching users from database
	public List <PurchaseAnalytics> getPurchaseAnalytics() {
		return purchaseAnalyticsRepository.findAll();
	}
}
