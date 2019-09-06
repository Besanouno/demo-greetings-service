FROM openjdk:8-alpine
ADD /target/greetings-service.jar greetings-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "greetings-service.jar"]