FROM maven:3.8.5-openjdk-11

WORKDIR /app

COPY pom.xml .

RUN mvn dependency:go-offline

COPY src ./src

RUN mvn clean install

CMD ["java", "-jar", "target/MembershipService-1.0-SNAPSHOT.jar"]
