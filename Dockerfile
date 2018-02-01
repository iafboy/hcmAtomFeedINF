FROM java:8-jre

ADD ./target/hwservice-1.0.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/hwservice-1.0.jar"]

EXPOSE 8282