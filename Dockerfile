FROM openjdk:8
ADD target/consumer.jar consumer.jar
EXPOSE 7092
ENTRYPOINT ["java", "-jar", "consumer.jar"]