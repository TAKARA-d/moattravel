# 基本的なSpring Bootアプリ用のDockerfile
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/moattravel-0.0.1-SNAPSHOT.jar app.jar

# 必要に応じて、環境変数や依存パッケージを追加
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]

