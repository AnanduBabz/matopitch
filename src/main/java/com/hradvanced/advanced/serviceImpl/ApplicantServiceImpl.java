package com.hradvanced.advanced.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hradvanced.advanced.entity.ApplicantEntity;
import com.hradvanced.advanced.entity.EmployeeEntity;
import com.hradvanced.advanced.repository.ApplicantRepository;
import com.hradvanced.advanced.repository.EmployeeRepository;
import com.hradvanced.advanced.requestDTO.ApplicantRequestDTO;
import com.hradvanced.advanced.responseDTO.ApplicantResponseDTO;
import com.hradvanced.advanced.service.ApplicantService;
import com.sun.xml.bind.v2.schemagen.xmlschema.Appinfo;

@Service
public class ApplicantServiceImpl implements ApplicantService {

	@Autowired
	ApplicantRepository applicantRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public ApplicantResponseDTO newApplication(ApplicantRequestDTO request) {
		ApplicantEntity entity = new ApplicantEntity();
		entity = 	entity.toEntity(request);
		entity.setStatus("waiting");
		applicantRepository.save(entity);
		ApplicantResponseDTO response = entity.toDTO();
		return response;
	}

	@Override
	public List<ApplicantResponseDTO> allApplicants() {
		List<ApplicantResponseDTO> response =  new ArrayList<ApplicantResponseDTO>();
		List <ApplicantEntity> entity = applicantRepository.findAll();
		for(ApplicantEntity each: entity) {
			response.add(each.toDTO());
		}
		return response;
	}

	@Override
	public void hired(Long id) {
		// send mail to the person
		EmployeeEntity entity = new EmployeeEntity();
		ApplicantEntity applicantEntity = new ApplicantEntity();
		applicantEntity = applicantRepository.findById(id).orElse(null);
		if(applicantEntity!=null) {
			System.out.println("employee going to save");
			entity=entity.newEmployee(applicantEntity);
			employeeRepository.save(entity);
		}
		
		
	}

	
	
	

}
