FROM java:8

ADD build/libs/docker-and-docker-compose-basics-homework-1.0-SNAPSHOT.jar app.jar
ADD wait-for-it.sh wait-for-it.sh

EXPOSE 8080

ENTRYPOINT ["./wait-for-it.sh", "bob:8081", "-t", "60", "--", "java", "-jar", "/app.jar"]