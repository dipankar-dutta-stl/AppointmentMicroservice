package com.spring.microservice.appointment.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.spring.microservice.appointment.model.AppointmentData;
import com.spring.microservice.appointment.model.AppointmentDetails;

public interface AppoinmentDetailsRepo extends JpaRepository<AppointmentDetails, String> {
    @Query(value = "SELECT ad.id, dd.first_name, dd.last_name, dd.mobile_no, dd.email_id, dd.chembar_address, appsc.schedule_day, appsc.schedule_time_start,appsc.schedule_time_end,ad.appointment_confrimed,ad.tags FROM appointment_details ad,doctor_details dd,appointment_schedule appsc WHERE ad.doctor_id=dd.id AND ad.appointment_schedule_id=appsc.id AND ad.patient_id=?", nativeQuery = true)
    public List<String> findByPATIENT_ID(String pATIENT_ID);

    @Query(value = "SELECT ad.id, pd.first_name, pd.last_name, pd.mobile_no, pd.email_id, pd.address, appsc.schedule_day, appsc.schedule_time_start,appsc.schedule_time_end,ad.appointment_confrimed,ad.tags FROM appointment_details ad,patient_details pd,appointment_schedule appsc WHERE ad.patient_id=pd.id AND ad.appointment_schedule_id=appsc.id AND ad.doctor_id=?", nativeQuery = true)
    public List<String> findByDOCTOR_ID(String dOCTOR_ID);

    @Modifying
    @Transactional
    @Query(value = "UPDATE appointment_details SET appointment_confrimed='CONFRIMED' WHERE id=?", nativeQuery = true)
    public void acceptAppointmentById(String id);

    @Query(value = "select id from appointment_details where appointment_schedule_id=?", nativeQuery = true)
    public String findAppointmentBySlotId(String slotid);

}
