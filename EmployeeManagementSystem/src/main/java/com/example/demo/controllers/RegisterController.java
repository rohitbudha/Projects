package com.example.demo.controllers;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.models.Employee;
import com.example.demo.repository.EmployeeRepository;

@Controller
public class RegisterController {
	
	@Autowired
	private EmployeeRepository employeeRespository;
	
	@GetMapping("/register")
public String getRegister() {
		
	
	return"register";
	}
	

	public String postRegister(@ModelAttribute Employee employee, Model m) {
		
		Employee emp= this.employeeRespository.save(employee);
		if(emp!=null) {
			m.addAttribute("success","Added successfully");
			
		}
		return"register";
		
		
	}
		
		
	
}


