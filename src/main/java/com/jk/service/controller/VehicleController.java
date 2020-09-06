package com.jk.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.jk.service.model.Vehicle;
import com.jk.service.model.VehicleRepository;

@Controller
public class VehicleController {
	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	@GetMapping("/vehicles")
	public ResponseEntity<List<Vehicle>> findAllVehicles() {

		//Load all vehicles and return as JSON response.
		List<Vehicle> vehicles = vehicleRepository.findAll();
		return new ResponseEntity<>(vehicles, HttpStatus.OK);
	}	

}
