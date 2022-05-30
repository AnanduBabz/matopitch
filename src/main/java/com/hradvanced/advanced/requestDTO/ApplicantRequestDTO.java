package com.hradvanced.advanced.requestDTO;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicantRequestDTO {

	private long id;
	private String name;
	private String emailId;
	private String phoneNumber;
	private Integer yearOfExperience;
	private String expertize;
	private Integer currentSalary;
	private Integer expectedSalary;
	private String status;
	private String password;
	private Integer attemtCount;
	
}
