package com.microservices.demo.app.microservicesdemoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicesDiscoveryDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesDiscoveryDemoAppApplication.class, args);
	}
}
