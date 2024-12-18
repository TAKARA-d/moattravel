# ベースイメージとしてJava 17を使用
FROM openjdk:17-jdk-slim

# 作業ディレクトリを作成
WORKDIR /app

# MavenでビルドされたJARファイルをコンテナにコピー
COPY target/*.jar app.jar

# コンテナが使用するポートを指定
EXPOSE 8080

# アプリケーションを起動
ENTRYPOINT ["java", "-jar", "app.jar"]
