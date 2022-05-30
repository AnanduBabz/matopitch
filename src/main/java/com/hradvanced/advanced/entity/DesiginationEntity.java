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
@Getter
@Setter
@Table(name = "desigination")
public class DesiginationEntity {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id;
	
	@Column(name="desigination_name")
	private String desiginationName;
	
	@Column(name="desigination_code")
	private String desiginationCode;
	
}
