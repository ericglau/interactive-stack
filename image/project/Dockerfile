# Dockerfile for building your application. Defines the final image that contains content from both the image and template.
FROM adoptopenjdk/openjdk11-openj9

RUN apt-get update && \
    apt-get install -y maven unzip wget xmlstarlet

COPY . /project

RUN cd /project && mvn -B install dependency:go-offline -DskipTests

WORKDIR /project/user-app

RUN mvn install -DskipTests

EXPOSE 9080
EXPOSE 9443
EXPOSE 7777