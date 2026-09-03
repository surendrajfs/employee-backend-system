# Employee Management System - Backend API

A RESTful Web Service built with **Spring Boot 3**, **Spring Data JPA**, and **MySQL Database** to manage employee records.

---

## 🛠️ Tech Stack

- **Framework:** Spring Boot 3
- **Language:** Java 17/21
- **Database:** MySQL (`batch71`)
- **ORM:** Spring Data JPA / Hibernate
- **Build Tool:** Maven

---

## 🏁 Getting Started

### 1. Database Configuration
Ensure MySQL is running and configure `src/main/resources/application.properties`:

```properties
server.port=9999

spring.datasource.url=jdbc:mysql://localhost:3306/batch71?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=YOUR_MYSQL_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
