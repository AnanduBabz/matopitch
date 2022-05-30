package com.hradvanced.advanced.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hradvanced.advanced.entity.EmployeeEntity;
import com.hradvanced.advanced.repository.EmployeeRepository;
import com.hradvanced.advanced.responseDTO.EmployeeResponseDTO;
import com.hradvanced.advanced.service.LoginService;

@Service
public class LoginServivceImpl implements LoginService{

	@Autowired
	EmployeeRepository employeeRepo;
	
	@Override
	public EmployeeResponseDTO login(String username, String password) {
		EmployeeEntity employee = employeeRepo.findByEmailId(username);
		EmployeeResponseDTO response = new EmployeeResponseDTO();
		if(employee!=null) {
			if(employee.getPassword().equals(password)) {
				response = employee.toDTO();
			}
		}
		return response;
	}

}
