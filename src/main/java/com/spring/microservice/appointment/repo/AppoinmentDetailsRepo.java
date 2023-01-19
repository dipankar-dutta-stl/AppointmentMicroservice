package com.spring.microservice.appointment.repo;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.microservice.appointment.model.AppointmentDetails;

public interface AppoinmentDetailsRepo extends JpaRepository<AppointmentDetails,String> {
	@Query(value="SELECT * FROM appointment_details WHERE patient_id=?",nativeQuery=true)
	public List<AppointmentDetails> findByPATIENT_ID(String pATIENT_ID);
	@Query(value="SELECT * FROM appointment_details WHERE doctor_id=?",nativeQuery=true)
	public List<AppointmentDetails> findByDOCTOR_ID(String dOCTOR_ID);

}
