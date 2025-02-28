package com.example.demo.controller;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.model.Patient;
import com.example.demo.repository.PatientRepository;

@Controller
public class PatientController {
	
	@Autowired
	private PatientRepository patientRepository;
	
	@GetMapping("/patient")
public String getPatient() {
		
	
	return"patient";
	}
	
	@PostMapping("/postPatient")
	public String postPatient(@ModelAttribute Patient patient, Model m) {
		
		Patient p= this.patientRepository.save(patient);
		if(p!=null) {
			m.addAttribute("success","Added successfully");
			
		}
		return"patient";
		
		
	}
		
		
	
}


