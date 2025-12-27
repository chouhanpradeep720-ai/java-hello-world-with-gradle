FROM openjdk:27-ea-slim-trixie

WORKDIR /app

COPY build/libs/jb-hello-world-1.1.2.0.jar app.jar

CMD ["java","-jar","app.jar"]

