package com.hradvanced.advanced.responseDTO;

import java.util.Date;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationResponseDTO {

	private Date date;
	private String notification;

}
