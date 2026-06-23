FROM eclipse-temurin:25-jre

WORKDIR /store

COPY target/store-0.0.3-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]