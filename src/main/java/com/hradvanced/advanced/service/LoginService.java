package com.hradvanced.advanced.service;

import org.springframework.stereotype.Service;

import com.hradvanced.advanced.responseDTO.EmployeeResponseDTO;

@Service
public interface LoginService {

	EmployeeResponseDTO login(String username, String password);
	
	

}
