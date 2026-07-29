# Project 3 - Student Management System (Spring Boot + MySQL)

## 📌 Overview

This project is a RESTful Student Management System built using Spring Boot and MySQL. It demonstrates CRUD (Create, Read, Update, Delete) operations with Spring Data JPA and Hibernate.

## 🚀 Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman (API Testing)

## 📂 Project Structure

```
src
└── main
    ├── java
    │   └── com.navanit.project3
    │       ├── controller
    │       ├── service
    │       ├── repository
    │       ├── model
    │       ├── exception
    │       └── Project3Application
    └── resources
        └── application.properties
```

## Features

- Add a student
- View all students
- View a student by ID
- Update student details
- Delete a student
- Input validation
- Global exception handling
- Data persistence using MySQL

## API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/students` | Add a new student |
| GET | `/students` | Get all students |
| GET | `/students/{id}` | Get student by ID |
| PUT | `/students/{id}` | Update student |
| DELETE | `/students/{id}` | Delete student |

## Sample Request

### POST `/students`

```json
{
  "name": "Navanit",
  "course": "CSE"
}
```

### Sample Response

```json
{
  "id": 1,
  "name": "Navanit",
  "course": "CSE"
}
```

## Database Configuration

Configure `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## How to Run

1. Clone the repository

```bash
git clone https://github.com/Navanit48/DecodeLabs-Internship.git
```

2. Open the project in IntelliJ IDEA.

3. Create a MySQL database:

```sql
CREATE DATABASE studentdb;
```

4. Update the database username and password in `application.properties`.

5. Run `Project3Application`.

6. Test the APIs using Postman.

## Learning Outcomes

- Building REST APIs using Spring Boot
- Using Spring Data JPA repositories
- Connecting Spring Boot with MySQL
- Entity mapping using Hibernate
- Request validation
- Exception handling
- CRUD operations with persistent storage

## Author

**Navanit Merla**

GitHub: https://github.com/Navanit48
