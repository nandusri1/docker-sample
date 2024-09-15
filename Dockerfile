FROM openjdk:17-jdk-alpine


WORKDIR /app

# Copy the jar file into the container
COPY target/*.jar app.jar

# Expose the port Spring Boot will run on
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
