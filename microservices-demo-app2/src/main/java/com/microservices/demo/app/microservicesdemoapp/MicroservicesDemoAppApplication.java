package com.microservices.demo.app.microservicesdemoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicesDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesDemoAppApplication.class, args);
	}
}
