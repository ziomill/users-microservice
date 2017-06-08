FROM java:8
MAINTAINER Antonio Benvenuto

COPY target/users-microservice-1.0-SNAPSHOT.jar users-microservice-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/users-microservice-1.0-SNAPSHOT.jar"]

EXPOSE 8081