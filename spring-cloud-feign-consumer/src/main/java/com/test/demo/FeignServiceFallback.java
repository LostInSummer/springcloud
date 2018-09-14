package com.test.demo;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceFallback implements FeignService {

	@Override
	public String product(String name) {
		return "product fail";
	}

}
