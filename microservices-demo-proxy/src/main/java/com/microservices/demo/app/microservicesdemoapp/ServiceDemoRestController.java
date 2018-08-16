package com.microservices.demo.app.microservicesdemoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients
public class ServiceDemoRestController {
	
	@Autowired
	DemoServiceClient client;
	
	@Autowired
	DemoHelloClient hello;

	@RequestMapping("/services")
	public String services() {
		return client.services();
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return hello.hello();
	}
	
	

}
