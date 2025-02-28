package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Doctor;
import com.example.demo.repository.DoctorRepository;

@Controller
public class DoctorController {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@GetMapping("/doctor")
public String getDoctor() {
		
	
	return"doctor";
	}
	
	@PostMapping("/postDoctor")
	public String postDoctor(@ModelAttribute Doctor doctor, Model m) {
		
		Doctor d= this.doctorRepository.save(doctor);
		if(d!=null) {
			m.addAttribute("success","Added successfully");
			
		}
		return"doctor";
		
		
	}
		
		
	
}


