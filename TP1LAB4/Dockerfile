FROM openjdk:11-jre-slim
WORKDIR /app
COPY --FROM-build /build/libs/TP1LAB4-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "TP1LAB4.jar"]
