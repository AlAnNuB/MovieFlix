FROM eclipse-temurin:21
LABEL maintainer="alannub6@gmail.com"
WORKDIR /app
COPY target/CadastroDeNinjas-0.0.1-SNAPSHOT.jar /app/cadastro-de-ninjas.jar
ENTRYPOINT ["java", "-jar", "cadastro-de-ninjas.jar"]
EXPOSE 8080
