FROM eclipse-temurin:17-jdk
COPY target/devops2project-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
