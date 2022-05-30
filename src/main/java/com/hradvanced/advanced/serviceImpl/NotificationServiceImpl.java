package com.hradvanced.advanced.serviceImpl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hradvanced.advanced.entity.NotificationEntity;
import com.hradvanced.advanced.repository.NotificationRepository;
import com.hradvanced.advanced.requestDTO.NotificationRequestDTO;
import com.hradvanced.advanced.responseDTO.NotificationResponseDTO;
import com.hradvanced.advanced.service.NotificationService;

public class NotificationServiceImpl implements NotificationService {

	@Autowired
	NotificationRepository repo;
	
	@Override
	public List<NotificationResponseDTO> getNotifications() {
		List<NotificationEntity> response = repo.findAll();
		List<NotificationResponseDTO> result = new ArrayList<NotificationResponseDTO>();
		for(NotificationEntity entity : response) {
			result.add(entity.toDto());
		}
		return result;
	}

	@Override
	public String addNotifications(NotificationRequestDTO request) {
		NotificationEntity entity= new NotificationEntity();
		entity.setLevel(request.getLevel());
		entity.setNotification(request.getNotification());
		Date date = new Date();
		entity.setDate(date);
		repo.save(entity);
		return "saved";
	}

}
