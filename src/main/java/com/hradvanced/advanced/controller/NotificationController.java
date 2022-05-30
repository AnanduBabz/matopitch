package com.hradvanced.advanced.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hradvanced.advanced.requestDTO.NotificationRequestDTO;
import com.hradvanced.advanced.responseDTO.NotificationResponseDTO;
import com.hradvanced.advanced.service.NotificationService;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
	
	@Autowired
	NotificationService service;
	
	@GetMapping
	public List<NotificationResponseDTO> getNotification() {
		return service.getNotifications();
	}
	
	@PostMapping
	public String createnotification(@RequestBody NotificationRequestDTO request) {
		return service.addNotifications(request);
	}

}
