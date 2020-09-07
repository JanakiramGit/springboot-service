package com.jk.service.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class VehicleRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String plateNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="registration_id", referencedColumnName = "id")
	private Registration registration;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="vehicle_id", referencedColumnName = "id")
	private Vehicle vehicle;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="insurer_id", referencedColumnName = "id")
	private Insurer insurer;
	
	public VehicleRegistration() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Registration getRegistration() {
		return registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}	
	
	public Insurer getInsurer() {
		return insurer;
	}

	public void setInsurer(Insurer insurer) {
		this.insurer = insurer;
	}
	
}
