FROM java:8-alpine

MAINTAINER yangxuan

ADD target/*.jar app.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "/app.jar"]

