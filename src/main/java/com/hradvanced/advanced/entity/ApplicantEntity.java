package com.hradvanced.advanced.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hradvanced.advanced.requestDTO.ApplicantRequestDTO;
import com.hradvanced.advanced.responseDTO.ApplicantResponseDTO;
import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="applicant")
@Getter
@Setter
public class ApplicantEntity {
	
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
	
	@Column(name="expected_salary")
	private Integer expectedSalary;
	
	@Column(name="status")
	private String status;
	
	@Column(name="attempt_count")
	private int attemptCount;
	
	@NotNull
	@Column(name="password")
	private String password;
	
	public ApplicantEntity toEntity(ApplicantRequestDTO request) {
		ApplicantEntity entity = new ApplicantEntity();
		entity.setCurrentSalary(request.getCurrentSalary());
		entity.setEmailId(request.getEmailId());
		entity.setExpectedSalary(request.getExpectedSalary());
		entity.setExpertize(request.getExpertize());
		entity.setName(request.getName());
		entity.setPhoneNumber(request.getPhoneNumber());
		entity.setStatus(request.getStatus());
		entity.setYearOfExperience(request.getYearOfExperience());
		entity.setPassword(request.getPassword());
		entity.setAttemptCount(request.getAttemtCount());
		return entity;
	}
	
	public ApplicantResponseDTO toDTO() {
		ApplicantResponseDTO response= new ApplicantResponseDTO();
		response.setCurrentSalary(this.currentSalary);
		response.setEmailId(this.emailId);
		response.setExpectedSalary(this.expectedSalary);
		response.setExpertize(this.expertize);
		response.setName(this.name);
		response.setPhoneNumber(this.phoneNumber);
		response.setStatus(this.status);
		response.setYearOfExperience(this.yearOfExperience);
		response.setAttemptCount(this.attemptCount);
		return response;
	}

}
