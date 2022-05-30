package com.hradvanced.advanced.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "recruitment")
public class RecruitmentEntity {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id;
	
	@Column(name="attempt_no")
	private int attemptNo;
	
	@Column(name="order")
	private int order;
	
	@Column(name="applicant_id")
	private Long applicantId;
	
	@Column(name="status")
	private String status;
	
	@Column(name="interviewer_id")
	private String interviewerId;
	
	@Column(name="remarks")
	private String remarks;
	
	@Column(name="interview_date")
	private Date interviewDate;
	
	
}
