package com.hradvanced.advanced.responseDTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ApplicantResponseDTO {

	private String name;
	private String emailId;
	private String phoneNumber;
	private Integer yearOfExperience;
	private String expertize;
	private Integer currentSalary;
	private Integer expectedSalary;
	private String status;
	private Integer attemptCount;
	
}
