FROM openjdk:17
EXPOSE 8003
ADD target/AppointmentMicroservice.jar AppointmentMicroserviceImg
ENTRYPOINT ["java","-jar","/AppointmentMicroservice.jar"]