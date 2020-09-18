FROM openjdk:8-alpine

COPY target/uberjar/doh.jar /doh/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/doh/app.jar"]
