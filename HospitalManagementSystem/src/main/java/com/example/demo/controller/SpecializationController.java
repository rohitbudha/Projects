package com.example.demo.controller;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.demo.model.Specialization;

import com.example.demo.repository.SpecializationRepository;

@Controller
public class SpecializationController {
	
	@Autowired
	private SpecializationRepository specializationRepository;
	
	@GetMapping("/specialization")
public String getSpecialization() {
		
	
	return"specialization";
	}
	
	@PostMapping("/postSpecialization")
	public String postSpecializationString(@ModelAttribute Specialization specialization, Model m) {
		
		Specialization s= this.specializationRepository.save(specialization);
		if(s!=null) {
			m.addAttribute("message","Added successfully");
			
		}
		return"specialization";
		
		
	}
		
		
	
}


