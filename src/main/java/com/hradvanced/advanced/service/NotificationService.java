package com.hradvanced.advanced.service;

import java.util.List;

import com.hradvanced.advanced.requestDTO.NotificationRequestDTO;
import com.hradvanced.advanced.responseDTO.NotificationResponseDTO;

public interface NotificationService {

	public List<NotificationResponseDTO> getNotifications();	
	
	public String addNotifications(NotificationRequestDTO request);	
	
	
}
