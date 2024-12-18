# Java 17ベースイメージ
FROM openjdk:17-jdk-slim

# 作業ディレクトリを設定
WORKDIR /app

# Maven Wrapperを含むプロジェクト全体をコピー
COPY . .

# MavenビルドでJARファイルを生成
RUN ./mvnw clean package -DskipTests

# 生成されたJARファイルを実行
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "target/moattravel-0.0.1-SNAPSHOT.jar"]
