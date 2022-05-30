package com.hradvanced.advanced.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hradvanced.advanced.requestDTO.ApplicantRequestDTO;
import com.hradvanced.advanced.responseDTO.ApplicantResponseDTO;

@Service
public interface ApplicantService {
	
	public ApplicantResponseDTO newApplication(ApplicantRequestDTO request);
	
	public List<ApplicantResponseDTO> allApplicants();
	
	public void hired(Long id);

}
