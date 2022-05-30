package com.hradvanced.advanced.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hradvanced.advanced.responseDTO.EmployeeResponseDTO;
import com.hradvanced.advanced.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@GetMapping
	public EmployeeResponseDTO login(@RequestParam String username,@RequestParam String password) {
		EmployeeResponseDTO response = new EmployeeResponseDTO();
		response = loginService.login(username,password);
		return response;
	}
	

}
