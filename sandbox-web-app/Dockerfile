FROM openjdk:17

COPY ./target/sandbox-web-app-1.0.jar /sandbox-web-app-1.0.jar

ENTRYPOINT ["java", "-jar", "-javaagent:${OTLP_JAR}", "-Dotel.javaagent.configuration-file=${OTLP_PROP}", "sandbox-web-app-1.0.jar"]

# docker build -t sandbox .