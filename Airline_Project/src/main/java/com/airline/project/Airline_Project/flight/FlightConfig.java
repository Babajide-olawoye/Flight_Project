package com.airline.project.Airline_Project.flight;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class FlightConfig {

	@Bean
	CommandLineRunner commandLineRunner(FlightRepository repository) {
		return args -> {
			Flight sevdub1 = new Flight("FR5581", "Seville", "Dublin", "Ryanair", 150.00, "10:20", "2H 55M");
			Flight sevdub2 = new Flight("VLG1367", "Seville", "Dublin", "Vueling", 173.00, "16:45", "2H 55M");
			Flight sevdub3 = new Flight("EI122", "Seville", "Dublin", "Aer Lingus", 165.00, "07:15", "2H 55M");
			Flight sevlon1 = new Flight("IBE2605", "Seville", "London", "Iberia", 146.00, "17:35", "2H 45M");
			Flight sevlon2 = new Flight("BAW114", "Seville", "London", "British Airlines", 177.00, "06:40", "2H 45M");
			Flight sevlon3 = new Flight("FR5582", "Seville", "London", "Ryanair", 120.00, "19:15", "2H 45M");
			Flight sevber1 = new Flight("IBE2606", "Seville", "Berlin", "Iberia", 122.00, "15:05", "2H 35M");
			Flight sevber2 = new Flight("FR5583", "Seville", "Berlin", "Ryanair", 109.00, "12:00", "2H 35M");
			Flight sevber3 = new Flight("DLH1069", "Seville", "Berlin", "Lufthansa", 136.00, "10:20", "2H 35M");
			Flight dubvil1 = new Flight("FR5584", "Dublin", "Vilnius", "Ryanair", 187.00, "16:45", "3H 10M");
			Flight dubvil2 = new Flight("W61616", "Dublin", "Vilnius", "Wizz Air", 176.00, "07:15", "3H 10M");
			Flight dubvil3 = new Flight("BT772", "Dublin", "Vilnius", "Airbaltic", 201.00, "17:35", "3H 10M");
			Flight dublon1 = new Flight("FR5585", "Dublin", "London", "Ryanair", 30.00, "06:40", "1H 20M");
			Flight dublon2 = new Flight("BAW115", "Dublin", "London", "British Airlines", 55.00, "19:15", "1H 20M");
			Flight dublon3 = new Flight("EI123", "Dublin", "London", "Aer Lingus", 46.00, "15:05", "1H 20M");
			Flight lonber1 = new Flight("BAW116", "London", "Berlin", "Ryanair", 134.00, "12:00", "1H 55M");
			Flight lonber2 = new Flight("DLH1070", "London", "Berlin", "British Airlines", 99.00, "10:20", "1H 55M");
			Flight lonber3 = new Flight("FR5586", "London", "Berlin", "Aer Lingus", 101.00, "16:45", "1H 55M");
			Flight lonvil1 = new Flight("FR5587", "London", "Vilnius", "Ryanair", 154.00, "07:15", "2H 40M");
			Flight lonvil2 = new Flight("BT773", "London", "Vilnius", "Airbaltic", 178.00, "17:35", "2H 40M");
			Flight lonvil3 = new Flight("EI124", "London", "Vilnius", "Aer Lingus", 210.00, "06:40", "2H 40M");
			Flight vilber1 = new Flight("FR5587", "Vilnius", "Berlin", "Ryanair", 168.00, "19:15", "1H 35M");
			Flight vilber2 = new Flight("DLH1071", "Vilnius", "Berlin", "Lufthansa", 165.00, "15:05", "1H 35M");
			Flight vilber3 = new Flight("W61617", "Vilnius", "Berlin", "Wizz Air", 187.00, "12:00", "1H 35M");
			Flight dubsev1 = new Flight("FR5581", "Dublin", "Seville", "Ryanair", 150.00, "14:00", "2H 55M");
			Flight dubsev2 = new Flight("VLG1367", "Dublin", "Seville", "Vueling", 173.00, "19:55", "2H 55M");
			Flight dubsev3 = new Flight("EI122", "Dublin", "Seville", "Aer Lingus", 165.00, "11:00", "2H 55M");
			Flight lonsev1 = new Flight("IBE2605", "London", "Seville", "Iberia", 146.00, "20:50", "2H 45M");
			Flight lonsev2 = new Flight("BAW114", "London", "Seville", "British Airlines", 177.00, "11:20", "2H 45M");
			Flight lonsev3 = new Flight("FR5582", "London", "Seville", "Ryanair", 120.00, "21:00", "2H 45M");
			Flight bersev1 = new Flight("IBE2606", "Berlin", "Seville", "Iberia", 122.00, "19:15", "2H 35M");
			Flight bersev2 = new Flight("FR5583", "Berlin", "Seville", "Ryanair", 109.00, "14:55", "2H 35M");
			Flight bersev3 = new Flight("DLH1069", "Berlin", "Seville", "Lufthansa", 136.00, "14:00", "2H 35M");
			Flight vildub1 = new Flight("FR5584", "Vilnius", "Dublin", "Ryanair", 187.00, "19:55", "3H 10M");
			Flight vildub2 = new Flight("W61616", "Vilnius", "Dublin", "Wizz Air", 176.00, "11:10", "3H 10M");
			Flight vildub3 = new Flight("BT772", "Vilnius", "Dublin", "Airbaltic", 201.00, "20:50", "3H 10M");
			Flight londub1 = new Flight("FR5585", "London", "Dublin", "Ryanair", 30.00, "11:20", "1H 20M");
			Flight londub2 = new Flight("BAW115", "London", "Dublin", "British Airlines", 55.00, "21:00", "1H 20M");
			Flight londub3 = new Flight("EI123", "London", "Dublin", "Aer Lingus", 46.00, "19:15", "1H 20M");
			Flight berlon1 = new Flight("BAW116", "Berlin", "London", "British Airlines", 134.00, "14:55", "1H 55M");
			Flight berlon2 = new Flight("DLH1070", "Berlin", "London", "Lufthansa", 99.00, "14:00", "1H 55M");
			Flight berlon3 = new Flight("FR5586", "Berlin", "London", "Ryanair", 101.00, "19:55", "1H 55M");
			Flight villon1 = new Flight("FR5587", "Vilnius", "London", "Ryanair", 154.00, "11:10", "2H 40M");
			Flight villon2 = new Flight("BT773", "Vilnius", "London", "Airbaltic", 178.00, "20:50", "2H 40M");
			Flight villon3 = new Flight("EI124", "Vilnius", "London", "Aer Lingus", 210.00, "11:20", "2H 40M");
			Flight bervil1 = new Flight("FR5587", "Berlin", "Vilnius", "Ryanair", 168.00, "21:00", "1H 35M");
			Flight bervil2 = new Flight("DLH1071", "Berlin", "Vilnius", "Lufthansa", 165.00, "19:15", "1H 35M");
			Flight bervil3 = new Flight("W61617", "Berlin", "Vilnius", "Wizz Air", 187.00, "14:55", "1H 35M");

			repository.saveAll(List.of(sevdub1, sevdub2, sevdub3, sevlon1, sevlon2, sevlon3, sevber1, sevber2, sevber3,
					dubvil1, dubvil2, dubvil3, dublon1, dublon2, dublon3, lonber1, lonber2, lonber3, lonvil1, lonvil2,
					lonvil3, vilber1, vilber2, vilber3, dubsev1, dubsev2, dubsev3, lonsev1, lonsev2, lonsev3, bersev1,
					bersev2, bersev3, vildub1, vildub2, vildub3, londub1, londub2, londub3, berlon1, berlon2, berlon3,
					villon1, villon2, villon3, bervil1, bervil2, bervil3));
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
