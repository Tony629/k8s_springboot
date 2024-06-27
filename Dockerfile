FROM openjdk:17-jdk-alpine

COPY target/aks-springboot-0.0.1-SNAPSHOT.jar /app/aks-springboot-0.0.1-SNAPSHOT.jar

WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "aks-springboot-0.0.1-SNAPSHOT.jar"]
