package com.hradvanced.advanced.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hradvanced.advanced.responseDTO.NotificationResponseDTO;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "notification")
@Getter
@Setter
public class NotificationEntity {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long Id;
	
	@Column(name="date")
	private Date date;
	
	@Column(name = "level")
	private int level;
	
	@Column(name = "notification")
	private String notification;
	
	public NotificationResponseDTO toDto() {
		NotificationResponseDTO response = new NotificationResponseDTO();
		response.setDate(this.date);
		response.setNotification(this.notification);
		return response;
	}
	
}

