package com.assigment3.vaccination.vaccination.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class VaccinationCenter {
	@Id
	@SequenceGenerator(
	           name ="vaccination_sequence",
	           sequenceName = "vaccination_sequence",
	           allocationSize = 1
	   )
	@GeneratedValue(
	           strategy = GenerationType.SEQUENCE,
	           generator = "vaccination_sequence"
	   )
	private Long id;
	private String centerName;
	private int centerPincode;
	private String district;
	private Long availableVaccine;
	
	public VaccinationCenter() {
		super();
	}
	public VaccinationCenter(Long id, String centerName, int centerPincode, String district, Long availablevaccine) {
		super();
		this.id = id;
		this.centerName = centerName;
		this.centerPincode = centerPincode;
		this.district = district;
		availableVaccine = availablevaccine;
	}
	public VaccinationCenter(String centerName, int centerPincode, String district, Long availablevaccine) {
		super();
		this.centerName = centerName;
		this.centerPincode = centerPincode;
		this.district = district;
		availableVaccine = availablevaccine;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public int getCenterPincode() {
		return centerPincode;
	}
	public void setCenterPincode(int centerPincode) {
		this.centerPincode = centerPincode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Long getAvailablevaccine() {
		return availableVaccine;
	}
	public void setAvailablevaccine(Long availablevaccine) {
		availableVaccine = availablevaccine;
	}
	
	@Override
	public String toString() {
		return "VaccinationCenter [id=" + id + ", centerName=" + centerName + ", centerPincode=" + centerPincode
				+ ", district=" + district + ", availableVaccine=" + availableVaccine + "]";
	}
	
	

}
