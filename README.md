# Spring Boot Dependency Pulling

A beginner-friendly Spring Boot project demonstrating **Dependency Pulling** using Spring's `ApplicationContext`. The application retrieves Spring-managed service objects from the Spring container at runtime to process different document types.

## Features

- Demonstrates Dependency Pulling using `ApplicationContext`.
- Retrieves Spring-managed beans using `getBean()`.
- Uses an interface to define common document service operations.
- Uses an abstract class to implement common functionality.
- Supports PDF and Excel document processing.
- Uses Spring's `@Service` annotation to register service implementations.
- Exposes REST API endpoints using Spring Boot.

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Core
- Maven
- REST API
- Object-Oriented Programming (OOP)

## Concept Overview

Dependency Pulling allows an application component to explicitly request a dependency from the Spring container.

In this project, `DocumentController` uses the injected `ApplicationContext` to retrieve the required document service bean through the `getBean()` method.

The application retrieves either the PDF or Excel service based on the requested document type.

## Project Structure

```text
spring-boot-dependency-pulling/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/document/
│       │       ├── controller/
│       │       │   └── DocumentController.java
│       │       └── service/
│       │           ├── DocumentService.java
│       │           ├── DocumentServiceAB.java
│       │           ├── PdfServiceImpl.java
│       │           └── ExcelServiceImpl.java
│       └── resources/
│           └── application.properties
├── .gitignore
├── pom.xml
└── README.md
```

## API Endpoints

| HTTP Method | Endpoint                  | Description                 |
| ----------- | ------------------------- | --------------------------- |
| GET         | `/print/pdf`              | Processes a PDF document    |
| GET         | `/print/excelServiceImpl` | Processes an Excel document |

## Example Request

### Process a PDF Document

```http
GET http://localhost:8080/print/pdf
```

### Example Response

```text
PDF
```

### Console Output

```text
Read Data From DB
Process Data For PDF
Print PDF
```

### Process an Excel Document

```http
GET http://localhost:8080/print/excelServiceImpl
```

### Example Response

```text
Excel
```

### Console Output

```text
Read Data From DB
Process Data For Excel
print excel
```

## How to Run the Project

1. Clone the repository:

   ```bash
   git clone https://github.com/rushigithub2003/spring-boot-dependency-pulling.git
   ```

2. Open the project in Spring Tool Suite (STS) or another compatible Java IDE.

3. Allow Maven to download the required dependencies.

4. Run the Spring Boot application.

5. Test the endpoints using Postman or a web browser.

## Learning Objectives

- Understand Dependency Pulling in Spring.
- Practise using `ApplicationContext`.
- Retrieve Spring-managed beans using `getBean()`.
- Understand Spring bean naming conventions.
- Practise interfaces, abstract classes, and inheritance.
- Build REST APIs using Spring Boot.

## Future Improvements

- Handle unsupported document types.
- Improve exception handling.
- Explore Dependency Injection and compare it with Dependency Pulling.
- Add unit tests.
- Improve API responses.

## Author

**Rushikesh Dhole**

GitHub: https://github.com/rushigithub2003

---

This project is part of my ongoing Java and Spring Boot practice journey.
