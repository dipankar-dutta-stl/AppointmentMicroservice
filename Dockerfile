FROM openjdk:17
EXPOSE 8003
ADD target/AppointmentMicroservice.jar AppointmentMicroservice.jar
ENTRYPOINT ["java","-jar","/AppointmentMicroservice.jar"]