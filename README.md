# Java Learning Journey 🚀

Welcome to my Java learning repository! This repository documents my journey learning Java programming from the basics to advanced concepts.

## 📚 What's Inside

This repository contains my daily Java learning exercises, projects, and notes as I progress through Java fundamentals and beyond.

### Current Progress
- **Day 1**: Java Basics - Variables, Data Types, and Output
  - `JavaBasics.java` - Basic variable declarations and printing
  - `firstProgram.java` - My first Java program

- **Day 3**: Advanced Conditional Statements
  - `MoreIfElse.java` - Grade calculator using if-else chains

- **Day 4**: Logic and Loops
  - `Conditions.java` - Student discount eligibility checker
  - `Nested.java` - Nested loops and multiplication table

- **Day 6**: Object-Oriented Programming Basics
  - `CandO.java` - Classes and Objects introduction

- **Day 7**: GUI Programming with Swing
  - `Registration.java` - Registration form with JFrame, JTextField, JPasswordField, and ActionListeners

- **Day 8**: Database Connectivity Foundation
  - `Javadb.java` - MySQL database connection using JDBC
  - `Jdbc.java` - Basic JDBC connection and error handling

- **Day 9**: Advanced JDBC Operations
  - `Morejdbc.java` - Query execution and ResultSet processing

## 🛠️ How to Run the Code

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any text editor or IDE (VS Code, IntelliJ IDEA, Eclipse)
- MySQL Server (for Day 8-9 database examples)
- MySQL JDBC Driver (mysql-connector-java.jar)

### Running the Programs
1. Navigate to the specific day folder
2. Compile the Java file:
   ```bash
   javac filename.java
   ```
3. Run the compiled program:
   ```bash
   java filename
   ```

### Special Instructions for GUI and Database Programs:

**For Day 7 (Swing GUI):**
```bash
cd day_7
javac Registration.java
java Registration
```

**For Day 8-9 (Database Programming):**
```bash
cd day_8  # or day_9
# Download MySQL Connector/J first
javac -cp ".:mysql-connector-java-8.0.33.jar" filename.java
java -cp ".;mysql-connector-java-8.0.33.jar" filename
```

## 📖 Learning Topics Covered

- [x] **Day 1**: Variables and Data Types
  - int, double, char, boolean, String
  - Basic output with System.out.println()

- [x] **Day 3**: Advanced Conditional Logic
  - Multiple if-else statements
  - Grade calculation logic
  - Scanner class for user input

- [x] **Day 4**: Control Flow and Logic
  - Logical operators (||, &&)
  - Nested loops
  - Pattern generation with loops

- [x] **Day 6**: Object-Oriented Programming
  - Class creation and instantiation
  - Instance variables and methods
  - Basic OOP concepts

- [x] **Day 7**: GUI Development
  - Swing components (JFrame, JLabel, JTextField, JPasswordField, JButton)
  - Event handling with ActionListener
  - Layout management with absolute positioning

- [x] **Day 8**: Database Programming Fundamentals
  - JDBC connectivity concepts
  - DriverManager and Connection objects
  - Error handling with try-catch-finally
  - Connection cleanup and resource management

- [x] **Day 9**: Advanced JDBC Operations
  - Statement creation and execution
  - SQL query execution with executeQuery()
  - ResultSet processing and data retrieval
  - Iterating through database results

- [ ] **Upcoming Topics**:
  - PreparedStatement for secure queries
  - Database CRUD operations (Create, Read, Update, Delete)
  - Advanced OOP (Inheritance, Polymorphism, Encapsulation)
  - Collections Framework
  - Exception Handling
  - File I/O
  - Multithreading

## 🎯 Learning Goals

- ✅ Master Java fundamentals
- ✅ Understand control flow and logic
- ✅ Build GUI applications
- ✅ Connect to databases
- ✅ Execute SQL queries and process results
- 🔄 Advanced database operations (INSERT, UPDATE, DELETE)
- 🔄 Advanced OOP concepts
- 🔄 Build practical projects
- 🔄 Develop problem-solving skills

## 🛠️ Tools and Technologies Used

- **Language**: Java
- **IDE**: Visual Studio Code
- **GUI Framework**: Java Swing
- **Database**: MySQL (via XAMPP)
- **JDBC Driver**: MySQL Connector/J
- **Database Tool**: phpMyAdmin
- **Version Control**: Git & GitHub

## 📝 Project Structure

```
learning_java/
├── day_1/
│   ├── JavaBasics.java
│   └── firstProgram.java
├── day_3/
│   └── MoreIfElse.java
├── day_4/
│   ├── Conditions.java
│   └── Nested.java
├── day_6/
│   └── CandO.java
├── day_7/
│   └── Registration.java
├── day_8/
│   ├── Javadb.java
│   └── Jdbc.java
├── day_9/
│   └── Morejdbc.java
└── README.md
```

## 🚀 Recent Achievements

- 🎨 Created interactive GUI applications with event handling
- 🗄️ Successfully mastered MySQL database connectivity
- 📊 Learned to execute SQL queries and process results
- 🧮 Built complex logic-based programs with conditions
- 🔄 Mastered nested loops and pattern generation
- 🛠️ Implemented proper error handling and resource management

## 🔥 Current Focus: Database Programming

Currently diving deep into **JDBC (Java Database Connectivity)**:
- Understanding Connection, Statement, and ResultSet objects
- Learning proper resource management and cleanup
- Practicing SQL query execution and data processing
- Building foundation for full-stack Java applications

## 🤝 Connect

Feel free to follow my learning journey! Suggestions and feedback are always welcome.

---
*Learning Java one day at a time!* ☕

**Days Active:** 9 | **Programs Written:** 10+ | **Concepts Mastered:** 20+