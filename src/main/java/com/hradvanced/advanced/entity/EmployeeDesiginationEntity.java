package com.hradvanced.advanced.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee_desigination")
@Getter
@Setter
public class EmployeeDesiginationEntity {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id;
	
	@Column(name="employee_id")
	private long employeeId;
	
	@Column(name="desigination_id")
	private long desiginationId;
	
}
