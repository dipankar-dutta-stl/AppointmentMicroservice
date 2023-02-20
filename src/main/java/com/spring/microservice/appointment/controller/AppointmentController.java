package com.spring.microservice.appointment.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.spring.microservice.appointment.pdf.PdfGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.spring.microservice.appointment.model.AppointmentData;
import com.spring.microservice.appointment.model.AppointmentDetails;
import com.spring.microservice.appointment.model.Doctor;
import com.spring.microservice.appointment.model.Patient;
import com.spring.microservice.appointment.repo.AppoinmentDetailsRepo;

import javax.servlet.http.HttpServletResponse;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("api/v1/appointment/")
public class AppointmentController {

    @Autowired
    AppoinmentDetailsRepo appoinmentDetailsRepo;


    @PostMapping("add")
    public String addAppointment(@RequestBody AppointmentDetails appointmentDetails) {
        try {
            String UID = UUID.randomUUID().toString();
            appointmentDetails.setID(UID);
            appoinmentDetailsRepo.save(appointmentDetails);
            return "APPOINTMENT BOOK SUCCESSFULLY";
        } catch (Exception x) {
            return "BOOKING FAILED";
        }

    }

    @GetMapping("get/p/{id}")
    public List<AppointmentData> getAppointmentByPatientId(@PathVariable("id") String pid) {
        List<AppointmentData> appointmentDataList = new ArrayList<AppointmentData>();
        try {
            List<String> adetails = appoinmentDetailsRepo.findByPATIENT_ID(pid);

            for (String s : adetails) {
                String[] splitData = s.split(",");
                appointmentDataList.add(new AppointmentData(splitData[0], splitData[1], splitData[2], splitData[4], splitData[3], splitData[5].replace("|", ","), splitData[6], splitData[7] + "-" + splitData[8], splitData[9], splitData[10]));
            }

            return appointmentDataList;
        } catch (

                Exception x) {
            return null;
        }
    }

    @GetMapping("get/d/{id}")
    public List<AppointmentData> getAppointmentByDoctorId(@PathVariable("id") String did) {
        List<AppointmentData> appointmentDataList = new ArrayList<AppointmentData>();
        try {
            List<String> adetails = appoinmentDetailsRepo.findByDOCTOR_ID(did);

            for (String s : adetails) {
                String[] splitData = s.split(",");
                appointmentDataList.add(new AppointmentData(splitData[0], splitData[1], splitData[2], splitData[4], splitData[3], splitData[5].replace("|", ","), splitData[6], splitData[7] + "-" + splitData[8], splitData[9], splitData[10]));
            }

            return appointmentDataList;
        } catch (

                Exception x) {
            return null;
        }
    }

    @PutMapping("update/{id}")
    public String updateAppointment(@PathVariable("id") String ad) {
        try {
            appoinmentDetailsRepo.acceptAppointmentById(ad);
            return "UPDATE SUCCESSFULLY";
        } catch (Exception x) {
            return "UPDATE FAILED";
        }
    }

    @GetMapping("slot/{id}")
    public String getAppointmentBySlotId(@PathVariable("id") String id) {
        String appointmentId = appoinmentDetailsRepo.findAppointmentBySlotId(id);
        if (appointmentId != null) {
            return "FOUND";
        } else {
            return "NOT FOUND";
        }

    }

    @DeleteMapping("delete/{id}")
    public String deleteAppointmentById(@PathVariable("id") String id){
        try{
          appoinmentDetailsRepo.deleteById(id);
          return "APPOINTMENT DELETED";
        }catch(Exception x){
            return "ERROR";
        }

    }


}
