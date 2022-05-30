package com.hradvanced.advanced.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hradvanced.advanced.requestDTO.ApplicantRequestDTO;
import com.hradvanced.advanced.responseDTO.ApplicantResponseDTO;
import com.hradvanced.advanced.service.ApplicantService;

@RestController
@RequestMapping("/recruitment")
public class RecruitmentController {

	@Autowired
	ApplicantService service;
	
	@GetMapping("/welcome")
	public String registration() {
		return "Welcome";
	}
	
	
	/*Endpoint for new applicants*/
	@PostMapping("/applicant/apply")
	public ApplicantResponseDTO newApplicant(@RequestBody ApplicantRequestDTO request){
		ApplicantResponseDTO response = service.newApplication(request);
		return response;
	} 
	
	@GetMapping("/applicant")
	public List<ApplicantResponseDTO> allApplicants(){
		List<ApplicantResponseDTO> response = service.allApplicants();
		return response;
	}
	
	@GetMapping("/applicant/hired/{id}")
	public String hired(@PathVariable Long id){
		service.hired(id);
		return "Welcome to the company";
	}
	
}
