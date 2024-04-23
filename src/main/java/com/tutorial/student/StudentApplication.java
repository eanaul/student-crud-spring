package com.tutorial.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

//	@Bean
//	public CorsFilter corsFilter(){
//		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
//		CorsConfiguration corsConfiguration = new CorsConfiguration();
//		corsConfiguration.setAllowCredentials(false);
//		corsConfiguration.setAllowedOrigins(List.of("http://localhost:4200"));
////        corsConfiguration.setAllowCredentials(true);
////        corsConfiguration.setAllowedOrigins(Arrays.asList("https://ad3b-114-124-204-235.ngrok-free.app"));
//		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Content-Type",
//				"Accept", "Jwt-Token", "Authorization", "Origin, Accept", "X-Requested-With",
//				"Access-Control-Request-Method", "Access-Control-Request-Headers"));
//		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Jwt-Token", "Refresh-Token", "Authorization",
//				"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials", "ngrok-skip-browser-warning"));
//		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
//		urlBasedCorsConfigurationSource.registerCorsConfiguration("/", corsConfiguration);
//		return new CorsFilter(urlBasedCorsConfigurationSource);
//	}

}
