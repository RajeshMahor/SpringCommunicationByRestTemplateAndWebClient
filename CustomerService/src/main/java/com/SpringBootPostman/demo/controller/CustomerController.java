package com.SpringBootPostman.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootPostman.demo.service.ProviderClient;

@RestController
public class CustomerController {

	private ProviderClient providerClient;

	public CustomerController(ProviderClient providerClient) {
		super();
		this.providerClient = providerClient;
	}

	@GetMapping("/customer/service")
	public String getServiceFromProvider() {
		return "Hi all this "+providerClient.getProviderService();
	}

}
