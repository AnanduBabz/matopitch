package com.hradvanced.advanced.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hradvanced.advanced.service.AttendanceService;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {
	
	@Autowired
	AttendanceService attendanceService;
	
	@GetMapping("/punch/{employeeId}")
	public String punch(@PathVariable long employeeId) {
		return attendanceService.punch(employeeId);
	}

}
