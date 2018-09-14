package com.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
	@Autowired
	private FeignService feignService;

	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String test(@RequestParam("name") String name) {
		return this.feignService.product(name);
	}

}
