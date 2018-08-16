package com.microservices.demo.app.microservicesdemoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceDemoRestController {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping("/services")
	private String getDemoServices() {
		StringBuilder b = new StringBuilder();
		for(String app : this.discoveryClient.getServices()) {
			b.append(app);b.append(";");b.append("</br>");
			for(ServiceInstance instance :this.discoveryClient.getInstances(app)) {
				b.append("url ->");b.append(instance.getUri());b.append("</br>");
			}
		}
		return b.toString(); 
		
	}
	
	

}
