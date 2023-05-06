FROM openjdk:11

WORKDIR /dockerized-springboot-app
ENV DOCKERIZED_SPRINGBOOT_APP_BASIC_MESSAGE="Dockerized Springboot App - Basic Message, Hello: { %s }"
ARG JAR_FILE=target/dockerized-springboot-app-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} /dockerized-springboot-app/app/dockerized-springboot-app-0.0.1.jar
ENTRYPOINT ["java","-jar","/dockerized-springboot-app/app/dockerized-springboot-app-0.0.1.jar"]