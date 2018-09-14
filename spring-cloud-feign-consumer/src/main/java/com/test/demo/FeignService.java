package com.test.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-client-producer", fallback = FeignServiceFallback.class)
public interface FeignService {

	@RequestMapping(value = "/producer", method = RequestMethod.GET)
	public String product(@RequestParam("name") String name);

}
