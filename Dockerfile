# Étape 1 : Build Maven
FROM eclipse-temurin:17-jdk-alpine AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN apk add --no-cache maven \
    && mvn clean package -DskipTests

# Étape 2 : Image finale
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=builder /app/target/devops2project-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
