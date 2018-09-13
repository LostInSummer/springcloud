package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudHaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHaProducerApplication.class, args);
	}
}
