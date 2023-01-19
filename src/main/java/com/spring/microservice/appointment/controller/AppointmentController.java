package com.spring.microservice.appointment.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.microservice.appointment.model.AppointmentDetails;
import com.spring.microservice.appointment.repo.AppoinmentDetailsRepo;

@RestController
@RequestMapping("api/v1/appointment/")
public class AppointmentController {

	@Autowired
	AppoinmentDetailsRepo appoinmentDetailsRepo;
	
	@PostMapping("add")
	public String addAppointment(@RequestBody AppointmentDetails appointmentDetails) {
		try {
			String UID=UUID.randomUUID().toString();
			appointmentDetails.setID(UID);
			appoinmentDetailsRepo.save(appointmentDetails);
			return "APPOINTMENT BOOK SUCCESSFULLY";
		}catch(Exception x) {
			return "BOOKING FAILED";
		}
		
	}
	
	@GetMapping("get/p/{id}")
	public List<AppointmentDetails> getAppointmentByPatientId(@PathVariable("id") String pid) {
		try {
			return appoinmentDetailsRepo.findByPATIENT_ID(pid);
		}catch(Exception x) {
			return null;
		}
	}
	
	@GetMapping("get/d/{id}")
	public List<AppointmentDetails> getAppointmentByDoctorId(@PathVariable("id") String did) {
		try {
			return appoinmentDetailsRepo.findByDOCTOR_ID(did);
		}catch(Exception x) {
			return null;
		}
	}
}
