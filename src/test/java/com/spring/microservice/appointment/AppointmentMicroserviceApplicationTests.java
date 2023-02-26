package com.spring.microservice.appointment;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

@SpringBootTest
class AppointmentMicroserviceApplicationTests {

    @Test
    void contextLoads() {
    }

    // @Test
    // void TestGetAppointmentByPatientId() {
    //     String data = given()
    //             .header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
    //             .when()
    //             .get("http://localhost:8003/api/v1/appointment/get/p/62059d81-bad5-45c5-a245-4300cb82be33")
    //             .then().assertThat().statusCode(200).extract().response().asString();
    //     System.out.println(data);
    // }




}
