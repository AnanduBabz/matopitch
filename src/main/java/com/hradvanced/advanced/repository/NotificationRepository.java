package com.hradvanced.advanced.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hradvanced.advanced.entity.NotificationEntity;

public interface NotificationRepository extends JpaRepository<NotificationEntity, Long>{
	

}
