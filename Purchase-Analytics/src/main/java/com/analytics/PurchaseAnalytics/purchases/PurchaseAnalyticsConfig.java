package com.analytics.PurchaseAnalytics.purchases;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class PurchaseAnalyticsConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(PurchaseAnalyticsRepository repository) {
		return args -> {
			PurchaseAnalytics p1 = new PurchaseAnalytics("Tim Murphy", "Seville", "LT155366", 120.00 , "20-Nov-2022"); //Sample data
			
			repository.saveAll(
					List.of(p1)
					
					);
			
		};
	}
	
	@Bean
	@SuppressWarnings("deprecation")
	public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH");
            }
        };
    }

}
