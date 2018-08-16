package com.microservices.demo.app.microservicesdemoapp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("DemoEurekaApp2")
public interface DemoServiceClient {
	
	@RequestMapping(value = "/services", method = RequestMethod.GET)
	String services();
	
}
