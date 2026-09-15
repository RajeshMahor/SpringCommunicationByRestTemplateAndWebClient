package com.SpringBootPostman.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class SpringCommunicationEmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCommunicationEmployeeServiceApplication.class, args);
	}

	@Bean
	// @Profile("dev")
	public RestTemplate restTemplate() {
		return new RestTemplate();

	}

	@Bean
	public WebClient webClient(WebClient.Builder builder) {
		return builder.baseUrl("http://localhost:8181").build();
	}

}
