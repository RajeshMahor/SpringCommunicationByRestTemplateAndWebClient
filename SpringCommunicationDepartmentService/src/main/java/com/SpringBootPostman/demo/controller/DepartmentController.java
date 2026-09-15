package com.SpringBootPostman.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@GetMapping("/{id}") // http://localhost:8181/department/1
	public String getDepartment(@PathVariable("id") Integer id) {
		return "IT Department";

	}

	@GetMapping("/welcome")
	public String sayWelcome() {
		return "WelCome All Of You";
	}

}
