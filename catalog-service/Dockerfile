FROM openjdk:8-jdk-alpine
ADD target/catalog-service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Xms768m","-Xmx2048m","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
