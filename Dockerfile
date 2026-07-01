# Usa una imagen base de Java
FROM eclipse-temurin:17-jdk-alpine


# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el JAR generado por Maven
COPY target/CRUD-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto de la aplicación
EXPOSE 8080

# Comando de arranque
ENTRYPOINT ["java", "-jar", "app.jar"]
