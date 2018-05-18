FROM openjdk:8-jdk-alpine

RUN mkdir /opt/app -p
WORKDIR /opt/app
COPY build/libs/*.jar app.jar
RUN apk add --no-cache curl
EXPOSE 80
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
ENV SPRING_PROFILES_ACTIVE=local
HEALTHCHECK CMD curl --fail http://localhost/sample-app/hello || exit 1
