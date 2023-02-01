package com.spring.microservice.appointment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AppointmentMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppointmentMicroserviceApplication.class, args);
    }


}
