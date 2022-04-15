package com.assigment3.vaccination.vaccination.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assigment3.vaccination.vaccination.Entity.VaccinationCenter;
import com.assigment3.vaccination.vaccination.Repository.VaccineRepository;

@Service
public class VaccinationService {
	
	@Autowired
	VaccineRepository vaccineRepository;

	public void addCenter(VaccinationCenter vc) {
		vaccineRepository.save(vc);
		
	}

	public List<VaccinationCenter> getAllCenter() {
		return vaccineRepository.findAll();
	}

	public List<VaccinationCenter> getAllCenterByDistrict(String district) {
		return vaccineRepository.findByDistrict(district);
		
	}

	public List<VaccinationCenter> getAllCenterByPincode(int pincode) {
		
		return vaccineRepository.findByPincode(pincode);
	}

}
