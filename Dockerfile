FROM openjdk

WORKDIR /app

COPY target/simple-docker-example-0.0.1-SNAPSHOT.jar /app/simple-docker-example.jar

ENTRYPOINT ["java", "-jar", "simple-docker-example.jar"]