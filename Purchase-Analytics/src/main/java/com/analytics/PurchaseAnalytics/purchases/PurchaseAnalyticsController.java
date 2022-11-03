package com.analytics.PurchaseAnalytics.purchases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/analytics")
public class PurchaseAnalyticsController {
	
	private final PurchaseAnalyticsService purchaseAnalyticsService;
	
	@Autowired
	public PurchaseAnalyticsController(PurchaseAnalyticsService purchaseAnalyticsService) {
		this.purchaseAnalyticsService = purchaseAnalyticsService;
	}
	
	@GetMapping
	public List <PurchaseAnalytics> getPurchaseAnalytics (){
		return purchaseAnalyticsService.getPurchaseAnalytics();
	}

}
