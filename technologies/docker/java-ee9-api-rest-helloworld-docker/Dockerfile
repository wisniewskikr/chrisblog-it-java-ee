FROM maven:3.9.6-eclipse-temurin-21 AS builder
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -Dmaven.test.skip

FROM payara/micro:6.2024.3-jdk21
COPY --from=builder /home/app/target/rest.war  /opt/payara/deployments/rest.war