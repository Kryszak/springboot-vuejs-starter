FROM openjdk:8-jdk-alpine
LABEL maintainer="prajskrzysztof@gmail.com"

EXPOSE 8080

ADD build/libs/server-0.0.1-SNAPSHOT.jar server.jar

ENTRYPOINT ["java","-jar","/server.jar"]