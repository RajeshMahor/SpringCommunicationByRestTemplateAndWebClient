package com.SpringBootPostman.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

	@GetMapping("/provider/service")
	public String getProviderService() {
		return "Hello from Provider Service";
	}

}
