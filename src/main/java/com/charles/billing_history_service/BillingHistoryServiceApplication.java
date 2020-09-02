package com.charles.billing_history_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BillingHistoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingHistoryServiceApplication.class, args);
	}

}
