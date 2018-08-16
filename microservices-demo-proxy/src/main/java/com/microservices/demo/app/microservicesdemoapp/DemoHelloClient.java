package com.microservices.demo.app.microservicesdemoapp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("DemoEurekaApp1")
public interface DemoHelloClient {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	String hello();
	
}

