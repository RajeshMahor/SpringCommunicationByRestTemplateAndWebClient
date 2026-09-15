package com.SpringBootPostman.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

// @FeignClient(name = "Provider-Service", url = "${provider.service.url} ")
@FeignClient(name = "Provider-Service", url = "http://localhost:6060")
public interface ProviderClient {
	
	@GetMapping("/provider/service")
	String getProviderService();
}
