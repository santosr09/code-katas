FROM openjdk:8u252-slim
COPY /target/FooBar-1.0-SNAPSHOT.jar /usr/local/app/
WORKDIR /usr/local/app/
ENTRYPOINT ["java", "-jar", "FooBar-1.0-SNAPSHOT.jar"]