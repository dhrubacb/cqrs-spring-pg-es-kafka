# cqrs-spring-pg-es-kafka
CQRS Spring Boot Project
A high-performance microservice template demonstrating the CQRS (Command Query Responsibility Segregation) pattern using Spring Boot, PostgreSQL for writes, Elasticsearch for reads, and Kafka for asynchronous data synchronization.

🏗 Architecture Overview

This project separates the write and read concerns to allow independent scaling and optimized data schemas for each operation.

Command Side (Write): A REST API receives state-changing requests and persists them into PostgreSQL.

Synchronization: A Kafka Producer captures the change (or the event) and publishes it to a Kafka topic.

Read Side (Sync): A Kafka Consumer listens to the topic and updates the Elasticsearch index.

Query Side (Read): A separate REST endpoint queries Elasticsearch for high-speed, full-text searchable results.

Updated init 
