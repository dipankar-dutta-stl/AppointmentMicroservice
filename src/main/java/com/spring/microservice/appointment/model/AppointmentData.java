package com.spring.microservice.appointment.model;

public class AppointmentData {

    private String APPOINTMENT_ID;


    private String FIRST_NAME;
    private String LAST_NAME;
    private String EMAIL;
    private String MOBILE_NO;
    private String ADDRESS;

    private String A_DAY;
    private String A_TIME;

    private String APPOINTMENT_CONFRIMED;
    private String TAGS;

    public AppointmentData() {

    }


    public AppointmentData(String aPPOINTMENT_ID, String fIRST_NAME, String lAST_NAME, String eMAIL, String mOBILE_NO,
                           String aDDRESS, String a_DAY, String a_TIME, String aPPOINTMENT_CONFRIMED, String tAGS) {
        super();
        APPOINTMENT_ID = aPPOINTMENT_ID;
        FIRST_NAME = fIRST_NAME;
        LAST_NAME = lAST_NAME;
        EMAIL = eMAIL;
        MOBILE_NO = mOBILE_NO;
        ADDRESS = aDDRESS;
        A_DAY = a_DAY;
        A_TIME = a_TIME;
        APPOINTMENT_CONFRIMED = aPPOINTMENT_CONFRIMED;
        TAGS = tAGS;
    }


    public String getAPPOINTMENT_ID() {
        return APPOINTMENT_ID;
    }

    public void setAPPOINTMENT_ID(String aPPOINTMENT_ID) {
        APPOINTMENT_ID = aPPOINTMENT_ID;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String fIRST_NAME) {
        FIRST_NAME = fIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String lAST_NAME) {
        LAST_NAME = lAST_NAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String eMAIL) {
        EMAIL = eMAIL;
    }

    public String getMOBILE_NO() {
        return MOBILE_NO;
    }

    public void setMOBILE_NO(String mOBILE_NO) {
        MOBILE_NO = mOBILE_NO;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String aDDRESS) {
        ADDRESS = aDDRESS;
    }

    public String getA_DAY() {
        return A_DAY;
    }

    public void setA_DAY(String a_DAY) {
        A_DAY = a_DAY;
    }

    public String getA_TIME() {
        return A_TIME;
    }

    public void setA_TIME(String a_TIME) {
        A_TIME = a_TIME;
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
        return "AppointmentData [APPOINTMENT_ID=" + APPOINTMENT_ID + ", FIRST_NAME=" + FIRST_NAME + ", LAST_NAME="
                + LAST_NAME + ", EMAIL=" + EMAIL + ", MOBILE_NO=" + MOBILE_NO + ", ADDRESS=" + ADDRESS + ", A_DAY="
                + A_DAY + ", A_TIME=" + A_TIME + ", APPOINTMENT_CONFRIMED=" + APPOINTMENT_CONFRIMED + "]";
    }


}
