package com.hradvanced.advanced.requestDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeRequestDTO {

	private String name;
	private String emailId;
	private String phoneNumber;
	private Integer yearOfExperience;
	private String expertize;
	private Integer currentSalary;
	private String status;
	private String password;

}
