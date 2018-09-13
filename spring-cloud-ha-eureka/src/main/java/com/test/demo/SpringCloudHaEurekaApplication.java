package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudHaEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHaEurekaApplication.class, args);
	}
}
