# Java 17ベースイメージ
FROM openjdk:17-jdk-slim

# 作業ディレクトリを作成
WORKDIR /app

# Maven Wrapper関連ファイルとソースコードをコピー
COPY mvnw mvnw
COPY mvnw.cmd mvnw.cmd
COPY .mvn/ .mvn/
COPY pom.xml pom.xml
COPY src/ src/

# Maven Wrapperに実行権限を付与
RUN chmod +x mvnw

# MavenビルドでJARファイルを生成
RUN ./mvnw clean package -DskipTests

# 生成されたJARファイルを実行
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "target/moattravel-0.0.1-SNAPSHOT.jar"]
