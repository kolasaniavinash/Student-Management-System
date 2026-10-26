# Student Management System

A console-based **Student Management System developed using Java** that allows users to manage student records efficiently. The application supports adding, viewing, searching, updating, and deleting student details, along with automatic grade calculation.

## Project Overview

The Student Management System is a beginner-friendly Java application that demonstrates Object-Oriented Programming (OOP), collections, methods, conditional statements, loops, and user input handling.

It uses an interactive menu to help users perform student record management operations.

## Features

- **Add Student:** Add a new student with ID, name, age, course, and marks.
- **View All Students:** Display the details of all registered students.
- **Search Student:** Find a student using their unique ID.
- **Update Student:** Modify a student's name, age, course, and marks.
- **Delete Student:** Remove a student record using the student ID.
- **Automatic Grade Calculation:** Calculate grades based on marks.
- **Percentage Display:** Display the student's marks as a percentage, assuming marks are out of 100.
- **Duplicate ID Prevention:** Prevent adding another student with an existing ID.
- **Marks Validation:** Accept marks only between 0 and 100.

## Technologies Used

- **Programming Language:** Java
- **Collections:** ArrayList
- **Input Handling:** Scanner
- **Concepts:** Object-Oriented Programming (OOP), encapsulation, methods, loops, switch statements, and conditional statements.

## Project Structure

```text
Student-Management-System/
│
├── StudentManagementSystem.java
└── README.md
```

The `StudentManagementSystem.java` file contains the `Student` class and the main application.

## Grade Calculation

| Marks | Grade |
|---|---|
| 90–100 | A+ |
| 80–89.99 | A |
| 70–79.99 | B |
| 60–69.99 | C |
| 50–59.99 | D |
| Below 50 | F |

## How to Run

### Prerequisites

- Java Development Kit (JDK) installed on your computer.
- A Java-compatible IDE, such as Visual Studio Code or IntelliJ IDEA.

### Steps

1. Download or clone this repository.
2. Open the project in your Java IDE.
3. Open `StudentManagementSystem.java`.
4. Run the `StudentManagementSystem` class.
5. Choose an option from the displayed menu and follow the prompts.

## Sample Output

```text
=================================
     STUDENT MANAGEMENT SYSTEM
=================================
1. Add Student
2. View All Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit
=================================
Enter your choice: 1

===== ADD STUDENT =====
Enter Student ID: 101
Enter Student Name: Rahul
Enter Age: 20
Enter Course: Computer Science
Enter Marks: 85

Student added successfully!
```

## Data Storage

This project stores student records in an `ArrayList` while the application is running. **The records are not permanently saved**; they are lost when the application terminates. Database or file storage can be added in a future version.

## Learning Outcomes

This project demonstrates practical experience with:

- Java classes and objects
- Encapsulation using private fields and getters/setters
- ArrayList operations
- Searching and updating records
- Input handling using Scanner
- Validation and grade calculation
- Menu-driven application development

## Future Enhancements

- Database integration using MySQL or PostgreSQL
- Permanent storage of student records
- Graphical user interface (GUI)
- Student attendance management
- Report generation and export
- Improved input validation and error handling

## Author

**Student Management System — Java Project**

Developed as a Java programming project for learning and practical application development.

## License

This project is available for educational and learning purposes. Add a formal open-source license if you intend to distribute it under specific reuse terms.
