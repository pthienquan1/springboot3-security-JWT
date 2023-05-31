# springboot3-security-JWT
Project to show how to implement JWT security using java17 and spring3

## Features
* User registration and login with JWT authentication
* Password encryption using BCrypt
* Role-based authorization with Spring Security
* 
## Technologies
* Spring Boot 3.0
* Spring Security
* JSON Web Tokens (JWT)
* BCrypt

## Getting Started
I assume you already have the following in your machine:
* JDK 17+
* Maven 3+

## Database
--> Using PostgreSQL

To build and run the project, follow these steps:

* Clone the repository: git clone https://github.com/pthienquan1/springboot3-security-JWT.git
* Add database "jwt_security" to postgres
* Build the project: mvn clean install
* Run the project: mvn spring-boot:run

-> The application will be available at http://localhost:8080.