package com.hradvanced.advanced.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hradvanced.advanced.responseDTO.EmployeeResponseDTO;
import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee")
@Getter
@Setter
public class EmployeeEntity {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id;
	
	@Column(name="name")
	private String name;
	
	@NotNull
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="year_of_experience")
	private Integer yearOfExperience;
	
	@Column(name="expertize")
	private String expertize;
	
	@Column(name="current_salary")
	private Integer currentSalary;
	
	@Column(name="status")
	private String status;
	
	@NotNull
	@Column(name="password")
	private String password;
	
	public EmployeeEntity newEmployee(ApplicantEntity applicant) {
		EmployeeEntity entity = new EmployeeEntity();
		entity.setEmailId(applicant.getEmailId());
		entity.setExpertize(applicant.getExpertize());
		entity.setName(applicant.getName());
		entity.setPhoneNumber(applicant.getPhoneNumber());
		entity.setPassword(applicant.getPassword());
		entity.setStatus("hired");
		return entity;
	}
	
	public EmployeeResponseDTO toDTO() {
		EmployeeResponseDTO response =  new EmployeeResponseDTO();
		response.setName(this.name);
		response.setCurrentSalary(this.currentSalary);
		response.setPhoneNumber(this.phoneNumber);
		response.setEmailId(this.emailId);
		response.setExpertize(this.expertize);
		response.setStatus(this.status);
		response.setYearOfExperience(this.yearOfExperience);
		return response;
	}

}
