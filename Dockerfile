FROM azul/zulu-openjdk:8u312-8.58.0.13-x86

RUN mkdir -p /atm-app

COPY build/libs/*.jar /atm-app/app.jar

WORKDIR /atm-app

# Expose the port for our local container
EXPOSE 8080
# Port for embedded Tomcat server port
ENV SERVER_PORT 8080

ENTRYPOINT [ "java", "-jar", "app.jar" ]