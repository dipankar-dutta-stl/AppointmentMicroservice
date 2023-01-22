package com.spring.microservice.appointment.repo;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.microservice.appointment.model.AppointmentData;
import com.spring.microservice.appointment.model.AppointmentDetails;

public interface AppoinmentDetailsRepo extends JpaRepository<AppointmentDetails, String> {
	@Query(value = "SELECT * FROM appointment_details WHERE patient_id=?", nativeQuery = true)
	public List<AppointmentDetails> findByPATIENT_ID(String pATIENT_ID);

	@Query(value = "SELECT ad.id, pd.first_name, pd.last_name, pd.mobile_no, pd.email_id, pd.address, appsc.schedule_day, appsc.schedule_time_start,appsc.schedule_time_end,ad.appointment_confrimed FROM appointment_details ad,patient_details pd,appointment_schedule appsc WHERE ad.patient_id=pd.id AND ad.appointment_schedule_id=appsc.id AND ad.doctor_id=?", nativeQuery = true)
	public List<String> findByDOCTOR_ID(String dOCTOR_ID);

}
