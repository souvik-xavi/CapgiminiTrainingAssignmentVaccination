package com.assigment3.vaccination.vaccination.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.assigment3.vaccination.vaccination.Entity.VaccinationCenter;


@Repository
public interface VaccineRepository extends JpaRepository<VaccinationCenter,Long> {
	
	@Query("select v from VaccinationCenter v where v.centerPincode=?1")
	List<VaccinationCenter> findByPincode(int pincode);
	
	@Query("select v from VaccinationCenter v where v.district=?1")
	List<VaccinationCenter> findByDistrict(String district);

}
