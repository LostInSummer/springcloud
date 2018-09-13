package com.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Value("${server.port}")
	public String port;

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("/hello")
	public String product(@RequestParam String name) {
		return "Service: " + discoveryClient.getServices() + " hi " + name + ", this is from port:" + port;
	}

}
