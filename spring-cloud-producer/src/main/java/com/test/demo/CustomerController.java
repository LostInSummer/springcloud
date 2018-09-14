package com.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Value("${server.port}")
	String port;

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping(value = "/producer", method = RequestMethod.GET)
	public String product(@RequestParam String name) {
		return "Service: " + discoveryClient.getServices() + " hi " + name + ", i am from port:" + port;
	}

}
