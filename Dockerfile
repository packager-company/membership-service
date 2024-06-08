FROM maven:3.5.2-jdk-11-slim AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn package

FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
CMD ["java", "-jar", "app.jar"]


# Crear una nueva imagen para la aplicación compilada
FROM adoptopenjdk/openjdk11:alpine-slim AS runtime

# Copiar el archivo JAR generado durante la compilación
COPY --from=build /app/target/your-app.jar /app/your-app.jar

# Establecer el comando de inicio para ejecutar la aplicación
CMD ["java", "-jar", "/app/your-app.jar"]
