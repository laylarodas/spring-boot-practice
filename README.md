# MyApp - Spring Boot Practice Project

## 📚 Overview

This project serves as a hands-on practice application for a comprehensive **Spring Boot 3** course, where I'll be implementing and mastering the following technologies and concepts:

- **Spring Boot 3** - Main framework
- **Spring 6** - Core framework
- **Spring Core** - Dependency Injection and IoC container
- **Spring REST** - RESTful API development
- **Spring MVC** - Model-View-Controller pattern
- **Spring Security** - Authentication and authorization
- **Thymeleaf** - Template engine for views
- **JPA (Java Persistence API)** - Persistence specification
- **Hibernate** - Object-Relational Mapping (ORM)
- **MySQL** - Relational database management

## 🛠️ Tech Stack

- **Java**: 21
- **Spring Boot**: 3.5.7
- **Build Tool**: Maven
- **Maven Wrapper**: Included in the project

## 🚀 Getting Started

### Prerequisites
- Java 21 or higher installed
- Maven (or use the included Maven Wrapper)
- MySQL (required when implementing data persistence)

### Running the Application

#### Using Maven Wrapper (Recommended)
```bash
# Windows
.\mvnw.cmd spring-boot:run

# Linux/Mac
./mvnw spring-boot:run
```

#### Using Installed Maven
```bash
mvn spring-boot:run
```

### Accessing the Application
Once started, the application will be available at:
```
http://localhost:8080
```

## 📁 Project Structure

```
myapp/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/laylarodas/springboot/demo/myapp/
│   │   │       ├── controllers/          # REST Controllers
│   │   │       │   └── HelloController.java
│   │   │       └── MyappApplication.java # Main application class
│   │   └── resources/
│   │       └── application.properties    # Configuration file
│   └── test/                             # Unit tests
├── pom.xml                               # Maven dependencies
└── README.md
```

## 🎯 Available Endpoints

### REST API

- **GET** `/` - Returns "Hello World!"
- **GET** `/hello` - Alternative greeting endpoint

## 📝 Development Notes

This is an actively developed project where features will be progressively added as the course advances.

### Upcoming Implementations
- [ ] MySQL integration
- [ ] JPA/Hibernate implementation
- [ ] Spring Security authentication
- [ ] Thymeleaf views
- [ ] Complete REST APIs (CRUD operations)
- [ ] Input validation
- [ ] Exception handling
- [ ] Unit and integration testing

## 🎓 Learning Objectives

Throughout this project, I aim to gain proficiency in:

- Building robust REST APIs with Spring Boot
- Implementing security mechanisms
- Working with relational databases using JPA/Hibernate
- Creating dynamic web applications with Thymeleaf
- Following best practices in enterprise Java development
- Understanding the Spring ecosystem comprehensively

## 👨‍💻 Author

**Layla Rodas**  
Practice project for Spring Boot course

## 📄 License

This is an educational project for learning purposes.

---

⭐ **Course**: Spring Boot 3: Learn Spring 6, Spring Core, Spring REST, Spring MVC, Spring Security, Thymeleaf, JPA, Hibernate, MySQL

