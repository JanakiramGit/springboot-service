package com.jk.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.jk.service.model.VehicleRegistration;
import com.jk.service.model.RegistrationRepository;

@Controller
public class RegistrationController {
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	@GetMapping("/registrations")
	public ResponseEntity<List<VehicleRegistration>> findAllRegistrations() {

		//Load all registrations and return as JSON response.
		List<VehicleRegistration> registrations = registrationRepository.findAll();
		return new ResponseEntity<>(registrations, HttpStatus.OK);
	}	

}
