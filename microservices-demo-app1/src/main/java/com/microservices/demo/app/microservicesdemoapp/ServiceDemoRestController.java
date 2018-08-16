package com.microservices.demo.app.microservicesdemoapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceDemoRestController {
	
	@RequestMapping("/hello")
	private String getDemoServices() {
		return "Hello World !!!"; 
		
	}
	
	

}
