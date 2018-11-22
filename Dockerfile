FROM openjdk:8
ADD target/course-api.jar course-api.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "course-api.jar"]