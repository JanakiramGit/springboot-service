package com.jk.service.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String make;
	private String model;
	private String type;
	private String colour;
	private long vin;
	private long tareWeight;
	private long grossMass;

	public Vehicle() {
		
	}

	@JsonIgnore
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public long getVin() {
		return vin;
	}

	public void setVin(long vin) {
		this.vin = vin;
	}

	public long getTareWeight() {
		return tareWeight;
	}

	public void setTareWeight(long tareWeight) {
		this.tareWeight = tareWeight;
	}

	public long getGrossMass() {
		return grossMass;
	}

	public void setGrossMass(long grossMass) {
		this.grossMass = grossMass;
	}
		
}
