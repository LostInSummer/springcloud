package com.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerController {

	@Autowired
	private LoadBalancerClient loadBalancerClient;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/consumer")
	public String consumer() {
		ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-producer");
		String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort()
				+ "/producer?name=chenjianlong";
		System.out.println(url);
		return new RestTemplate().getForObject(url, String.class);
	}

	@GetMapping("/ribbon")
	public String ribbon() {
		return restTemplate.getForObject("http://eureka-producer/producer?name=chenjianlong", String.class);
	}

}
