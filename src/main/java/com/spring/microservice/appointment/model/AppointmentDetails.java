package com.spring.microservice.appointment.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AppointmentDetails {

    @Id
    private String ID;
    private String DOCTOR_ID;
    private String PATIENT_ID;
    private String APPOINTMENT_SCHEDULE_ID;
    private String APPOINTMENT_CONFRIMED;
    private String TAGS;


    public AppointmentDetails() {
        super();
    }


    public AppointmentDetails(String iD, String dOCTOR_ID, String pATIENT_ID, String aPPOINTMENT_SCHEDULE_ID,
                              String aPPOINTMENT_CONFRIMED, String tAGS) {
        super();
        ID = iD;
        DOCTOR_ID = dOCTOR_ID;
        PATIENT_ID = pATIENT_ID;
        APPOINTMENT_SCHEDULE_ID = aPPOINTMENT_SCHEDULE_ID;
        APPOINTMENT_CONFRIMED = aPPOINTMENT_CONFRIMED;
        TAGS = tAGS;
    }


    public String getID() {
        return ID;
    }


    public void setID(String iD) {
        ID = iD;
    }


    public String getDOCTOR_ID() {
        return DOCTOR_ID;
    }


    public void setDOCTOR_ID(String dOCTOR_ID) {
        DOCTOR_ID = dOCTOR_ID;
    }


    public String getPATIENT_ID() {
        return PATIENT_ID;
    }


    public void setPATIENT_ID(String pATIENT_ID) {
        PATIENT_ID = pATIENT_ID;
    }


    public String getAPPOINTMENT_SCHEDULE_ID() {
        return APPOINTMENT_SCHEDULE_ID;
    }


    public void setAPPOINTMENT_SCHEDULE_ID(String aPPOINTMENT_SCHEDULE_ID) {
        APPOINTMENT_SCHEDULE_ID = aPPOINTMENT_SCHEDULE_ID;
    }


    public String getAPPOINTMENT_CONFRIMED() {
        return APPOINTMENT_CONFRIMED;
    }


    public void setAPPOINTMENT_CONFRIMED(String aPPOINTMENT_CONFRIMED) {
        APPOINTMENT_CONFRIMED = aPPOINTMENT_CONFRIMED;
    }


    public String getTAGS() {
        return TAGS;
    }


    public void setTAGS(String tAGS) {
        TAGS = tAGS;
    }


    @Override
    public String toString() {
        return "AppointmentDetails [ID=" + ID + ", DOCTOR_ID=" + DOCTOR_ID + ", PATIENT_ID=" + PATIENT_ID
                + ", APPOINTMENT_SCHEDULE_ID=" + APPOINTMENT_SCHEDULE_ID + ", APPOINTMENT_CONFRIMED="
                + APPOINTMENT_CONFRIMED + ", TAGS=" + TAGS + "]";
    }


}
