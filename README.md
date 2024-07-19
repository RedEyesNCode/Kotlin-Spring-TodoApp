# Kotlin, Spring Boot, Postgresql ~ Todo App

Build a Restful CRUD API using Kotlin, Spring Boot, Postgresql, JPA and Hibernate.

## Requirements

1. Java - 11

2. Maven - 3.x.x

3. PostgreSQL - 5.x.x

## Steps to Setup

**1. Clone the application**

**2. Create PostgreSQL database named as qwestify_db (you can change this accordingly)**

**3. Change postgresql username and password as per your installation**

**4. Server port is : 3577**


+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your Postgresql installation

**4. Running the App**

Type the following command in your terminal to run the app -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET http://localhost:3577/todos (For Getting All Todo Item)
    
    POST http://localhost:3577/todos (For creating new Todo Item)
    
    PUT http://localhost:3577/todos/{id} (For Updating Todo-Item)
    
    DELETE http://localhost:3577/todos/{id} (For Deleting Todo-Item)

You can test them using postman or any other rest client.

Project Files

A typical Kotlin Spring Boot project will include the following files:

    pom.xml (or build.gradle): This file contains the project's dependencies and build configuration.
    
    application.properties: This file contains configuration properties for your application.
    
    src/main/java: This directory contains the source code for your application's Java classes.
    
    src/main/resources: This directory contains resources that your application needs, such as images, CSS files, and JavaScript files.
    
    src/test/java: This directory contains the source code for your application's tests.
