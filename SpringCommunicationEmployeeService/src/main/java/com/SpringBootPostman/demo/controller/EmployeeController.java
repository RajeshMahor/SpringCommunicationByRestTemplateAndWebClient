package com.SpringBootPostman.demo.controller;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private WebClient webClient;



	@GetMapping("/{id}") // http://localhost:8182/employee/1
	public String getEmployee(@PathVariable("id") Integer id) {

		String dept = restTemplate.getForObject("http://localhost:8181/department/" + id, String.class);

		return "Employee having department : " + dept;

	}

	@GetMapping("/hello")
	public String sayHello() {
		String webreturn = webClient.get().uri("/department/welcome").retrieve().bodyToMono(String.class).block();
		return "Hello All From Service : " + webreturn;
	}


}
