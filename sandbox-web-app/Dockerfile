FROM openjdk:17

COPY ./target/sandbox-web-app-1.0.jar /sandbox-web-app-1.0.jar
COPY ../opentelemetry/opentelemetry-javaagent.jar /opentelemetry-javaagent.jar
COPY ../opentelemetry/opentelemetry.properties /opentelemetry.properties

WORKDIR /

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "-javaagent:/opentelemetry-javaagent.jar", "-Dotel.javaagent.configuration-file=/opentelemetry.properties", "sandbox-web-app-1.0.jar"]

# docker build -t sandbox .