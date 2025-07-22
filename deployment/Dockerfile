# Use a lightweight OpenJDK base image
FROM openjdk:17-jdk-slim

# Add JAR to container
COPY target/client-onboarding.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "/app.jar"]
