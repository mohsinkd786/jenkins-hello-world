FROM openjdk:8-jdk-alpine
MAINTAINER "mohsinkd786@gmail.com"
VOLUME /tmp
ADD /target/hello.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/hello.jar"]
EXPOSE 9211