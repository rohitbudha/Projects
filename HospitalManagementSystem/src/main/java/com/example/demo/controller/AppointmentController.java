package com.example.demo.controller;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Appointment;

import com.example.demo.repository.AppointmentRepository;


@Controller
public class AppointmentController {
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@GetMapping("/appointment")
public String getAppointment() {
		
	
	return"appointment";
	}
	
	@PostMapping("/postAppointment")
	public String postAppointment(@ModelAttribute Appointment appointment, Model m) {
		
		Appointment a= this.appointmentRepository.save(appointment);
		if(a!=null) {
			m.addAttribute("success","Added successfully");
			
		}
		return"appointment";
		
		
	}
		
		
	
}


