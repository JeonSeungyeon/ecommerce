FROM openjdk:11-jre-slim

LABEL authors="jsy"

WORKDIR /app

COPY target/user-service-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
