# SpringDataGeodeExample

Spring Data for Apache Geode と Spring Boot を使用したシンプルなToDoアプリケーションです。
比較のため JPA（MySQL）で同等のことを実現する場合のアプリケーションも存在します。

## boot-geode-todo

### Build and run the app

1. `cd boot-geode-todo`
1. `mvnw clean package`
1. `java -jar target/boot-geode-todo-0.8.jar`
1. Open a web browser to http://localhost:8080

※起動に2分ぐらいかかります

## boot-mysql-todo

### Build and run the app

1. `cd boot-mysql-todo`
1. `mvnw clean package`
1. `java -jar target/boot-mysql-todo-0.8.jar`
1. Open a web browser to http://localhost:8080

※事前にMySQLを起動してapplication.propertiesに接続先を設定してください。

