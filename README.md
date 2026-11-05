# ☕ Java Practice & Programming Repository

[![Java Version](https://img.shields.io/badge/Java-SE%208%20%7C%2011%20%7C%2017%20%7C%2021-orange.svg?logo=openjdk&logoColor=white)](#prerequisites--environment)
[![Supported Platforms](https://img.shields.io/badge/Platform-Windows%20%7C%20Linux%20%7C%20macOS-blue.svg)](#how-to-run)
[![Key Topics](https://img.shields.io/badge/Modules-Core%20%7C%20OOP%20%7C%20Threads%20%7C%20Sockets%20%7C%20JDBC%20%7C%20JSP-brightgreen.svg)](#-repository-modules)
[![Status](https://img.shields.io/badge/Status-Fully%20Documented%20%26%20Organized-success.svg)](#)

A comprehensive, organized collection of Java programming solutions, academic lab assignments, university practical exam slips, interview preparation algorithms, and full-stack mini-projects. Covers foundational logic through advanced enterprise Java: Object-Oriented Programming (OOP), multithreading, client-server socket networking, AWT GUI graphics, JDBC database connectivity, and JSP web development.

---

## 📑 Table of Contents

- [Overview](#-overview)
- [Repository Modules](#-repository-modules)
  - [1. Core Foundations & Algorithms](#1-core-foundations--algorithms)
  - [2. Object-Oriented Programming (OOP) Suite](#2-object-oriented-programming-oop-suite)
  - [3. Custom Packages & Modularity](#3-custom-packages--modularity)
  - [4. File Streams & Exception Handling](#4-file-streams--exception-handling)
  - [5. Multithreading & Concurrency](#5-multithreading--concurrency)
  - [6. Sockets & Network Programming](#6-sockets--network-programming)
  - [7. GUI & Event-Driven Applications](#7-gui--event-driven-applications)
  - [8. Database Connectivity & JSP Web Apps](#8-database-connectivity--jsp-web-apps)
  - [9. Academic Lab Assignments](#9-academic-lab-assignments)
  - [10. University Practical Slips & Web Tech](#10-university-practical-slips--web-tech)
  - [11. Reference Notes & Question Banks](#11-reference-notes--question-banks)
- [Prerequisites & Environment](#-prerequisites--environment)
- [How to Run](#-how-to-run)
  - [1. Compiling & Running Core Java Programs](#1-compiling--running-core-java-programs)
  - [2. Programs with Custom Packages](#2-programs-with-custom-packages-mypack-stringoperation)
  - [3. Client-Server Networking Programs](#3-client-server-networking-programs)
  - [4. GUI & AWT Frame Applications](#4-gui--awt-frame-applications)
  - [5. JDBC and JSP Web Applications](#5-jdbc-and-jsp-web-applications)
  - [6. Running Web Technology Slips (HTML & JS)](#6-running-web-technology-slips-html--js)
- [Code Conventions & Best Practices](#-code-conventions--best-practices)
- [License & Academic Integrity](#-license--academic-integrity)

---

## 🌟 Overview

This repository serves as an all-in-one learning, practice, and reference hub for Java developers and computer science students:
- **Core Algorithms & Logic**: Number theory (Armstrong, Prime, Fibonacci, Factorial, Palindrome, Sum of Digits), 1D/2D array operations, and matrix math.
- **Complete OOP Hierarchy**: Progressive demonstrations covering classes, objects, methods, constructor overloading, encapsulation with accessors/mutators, abstraction, single/multilevel/hierarchical inheritance, and runtime polymorphism.
- **Systems & Concurrency**: Multi-threaded execution, thread synchronization, thread control (`join`, `sleep`), and Producer-Consumer architectures.
- **Client-Server Networking**: TCP/IP socket programming for interactive terminal chat, date services, file streaming, and network inspection.
- **Enterprise & Web Stack**: Relational database persistence using PostgreSQL/MySQL via JDBC, dynamic server-side rendering with JSP, and companion web tech slips (HTML5/CSS3/ES6).

---

## 📁 Repository Modules

### Module Directory Map

| Directory | Primary Domain | Description & Key Contents |
| :--- | :--- | :--- |
| [**BasicPrograms/**](BasicPrograms/) | Core Language Fundamentals | Loop patterns, array logic, matrix manipulation, command-line arguments, and I/O streams. |
| [**JavaPrep/**](JavaPrep/) | Interview & Exam Practice | Frequently asked coding problems: linear search, min/max in arrays, string palindromes, factorials, and digit sums. |
| [**OOP_Programs/**](OOP_Programs/) | Object-Oriented Architecture | Structured learning path across 7 submodules (Classes, Methods, Constructors, Encapsulation, Abstraction, Inheritance, Polymorphism). |
| [**mypack/**](mypack/) | Java Packages Demo | Defining package namespaces, compiling with classpath flags, and importing custom packages. |
| [**StringOperation/**](StringOperation/) | Modular Utilities | Custom package demonstrating string comparison and concatenation classes with a driver harness. |
| [**chapter4/**](chapter4/) | File Streams & Character I/O | Case manipulation, reading uppercase files, stream pipelines, and file buffer manipulation. |
| [**Multithreading/**](Multithreading/) | Concurrency & Thread Safety | Thread lifecycles, synchronization, `join()`, `sleep()`, and Producer-Consumer design. |
| [**Networking/**](Networking/) | Sockets & Client-Server Systems | TCP/IP network applications: Chat servers, Echo, Date servers, File streaming, and URL parsing. |
| [**GUI_Applets/**](GUI_Applets/) | AWT Graphics & Threaded UI | Threaded Traffic Signal simulator, Bouncing Ball animation, text tickers, and prime checkers. |
| [**Database_JSP/**](Database_JSP/) | JDBC & Web Applications | Full CRUD database operations with PostgreSQL/MySQL, dynamic JSP server pages, and HTML forms. |
| [**Assign1/**](Assign1/) | Practical Lab Assignment 1 | Date formatting, matrix operations, menu-driven math utilities, and array reversal. |
| [**Assign2/**](Assign2/) | Practical Lab Assignment 2 | Three-tiered assignment sets (Set A, Set B, Set C) featuring packages, objects, and records. |
| [**Assign3/**](Assign3/) | Practical Lab Assignment 3 | Multi-level inheritance, abstract models, interfaces, credit cards, orders, and products. |
| [**slips/**](slips/) | Practical Exam Slips | Categorized slips (Chapters 1–4 for Java, Chapters 6–8 for Web Tech & ES6 JavaScript). |
| [**Notes/**](Notes/) | Study Guides & Cheat Sheets | Comprehensive HTML notes on Classes, Inheritance, Interfaces, Exceptions, and JavaFX. |

---

### Detailed Breakdown

#### 1. Core Foundations & Algorithms
- [**BasicPrograms/**](BasicPrograms/):
  - `Array/`: 1D and 2D arrays, searching, sorting, and element transformations.
  - `Loops/` & `Operators/`: Control flow structures, bitwise logic, and iteration patterns.
  - `ClassesAndObjects/`: Introductory class models.
  - Algorithm highlights: `TwoSum.java`, `ArmstrongNumber.java`, `PrimeCheck.java`, `FibonacciSeries.java`, `MatrixOperations.java`, `BufferedReaderExample.java`, `CommandLineDemo.java`, `ATMMain.java`.
- [**JavaPrep/**](JavaPrep/):
  - Clean, interview-ready implementations: `LinearSearchArray.java`, `MaxMinArray.java`, `PalindromeString.java`, `PalindromeNumber.java`, `SumOfDigits.java`, `ReverseTheNumber.java`, `Factorial.java`, `SumAvgArray.java`.

#### 2. Object-Oriented Programming (OOP) Suite
Located in [**OOP_Programs/**](OOP_Programs/):
- **Part 1 — Classes & Objects** (`Part1_ClassAndObject/`): Real-world state and behavior modeling (`Program01_StudentClass.java`, `Program02_CarClass.java`, `Program03_EmployeeClass.java`, `Program04_MobileClass.java`, `Program05_BookClass.java`).
- **Part 2 — Methods** (`Part2_Methods/`): Parameters, return types, calculation methods (`Program06_Calculator.java`, `Program07_StudentResult.java`, `Program08_ReturnStatementDemo.java`).
- **Part 3 — Constructors** (`Part3_Constructors/`): Default, parameterized, and constructor overloading (`Program09_StudentConstructor.java`, `Program10_CarConstructor.java`, `Program11_BankAccountConstructor.java`, `ConstructorOverloadingDemo.java`).
- **Part 4 — Encapsulation** (`Part4_Encapsulation/`): Private fields, validation, accessor & mutator encapsulation patterns (`Program12_EncapsulatedBankAccount.java`, `Program13_EncapsulatedStudent.java`).
- **Part 5 — Abstraction** (`Part5_Abstraction/`): Abstract base classes, abstract methods, contracts (`Program14_AbstractVehicle.java`, `CircleAreaDemo.java`, `OrderDemo.java`, `SimpleCalcDemo.java`).
- **Inheritance** (`Inheritance/`): Single, multilevel, and hierarchical inheritance structures with `super` keyword chaining (`VehicleDemo.java`, `MultiLevelDemo.java`, `HierarchicalDemo.java`).
- **Polymorphism** (`Polymorphism/`): Compile-time method overloading and dynamic runtime method dispatch (`BankDemo.java`, `PaymentDemo.java` with UPI, CreditCard, DebitCard).

#### 3. Custom Packages & Modularity
- [**mypack/**](mypack/): Demonstrates package declarations (`package mypack;`), cross-package class imports, and directory hierarchical compilation (`Calculator.java`, `Greeting.java`, `Test.java`).
- [**StringOperation/**](StringOperation/): Modular package containing string manipulation classes (`Comp.java`, `Con.java`) executed by driver `TestStringOperation.java`.

#### 4. File Streams & Exception Handling
- [**chapter4/**](chapter4/): Reading and writing streams with `Scanner`, `FileReader`, and `BufferedReader`, character transformations, file casing toggles (`FileReverseCase.java`, `ReadUpperCase.java`).
- Exception handling patterns: checked vs unchecked exceptions, `try-catch-finally`, `throw`, and custom exceptions.

#### 5. Multithreading & Concurrency
Located in [**Multithreading/**](Multithreading/):
- Creating threads via `Thread` subclassing and `Runnable` implementation.
- Inter-thread communication and synchronization using `wait()` and `notify()`.
- Classic **Producer-Consumer** queue implementation (`ProducerConsumer.java`, `ProducerConsumer1.java`).
- Thread control methods: `join()`, `sleep()`, and thread priorities (`JoinMethod4.java`, `Sleep_Reverse.java`, `PrintText_Thread.java`).

#### 6. Sockets & Network Programming
Located in [**Networking/**](Networking/):
- **Client-Server Architecture**: TCP socket communication using `ServerSocket` and `Socket`.
- **Chat Application**: Bidirectional terminal chat (`ChatServer.java` & `ChatClient.java`).
- **File Transfer**: Streaming files over network sockets (`FileServer.java` & `FileClient.java`).
- **Directory Services**: Remote directory listing (`FilelistServer.java` & `FilelistClient.java`).
- **Utilities**: `EchoServer.java`, `DateServer.java` / `DateClient.java`, and IP / URL inspection (`PrimaryIP.java`, `URLDemo.java`).

#### 7. GUI & Event-Driven Applications
Located in [**GUI_Applets/**](GUI_Applets/):
- Standalone AWT `Frame` graphics and threaded UI updates.
- `TrafficSignal.java`: Multi-threaded visual traffic light simulation cycling through Red, Yellow, and Green states.
- `BouncingBall.java`: Canvas animation with boundary collision physics.
- `BlinkText.java` & `MovingText.java`: Marquee text banners and dynamic repaint loops.
- `PrimeCheck.java`: Interactive AWT form for prime number validation.

#### 8. Database Connectivity & JSP Web Apps
Located in [**Database_JSP/**](Database_JSP/):
- **JDBC Persistence**: Drivers, `Connection`, `Statement`, `PreparedStatement`, and `ResultSet`.
- CRUD scripts: `insert.java`, `update.java`, `Delete.java`, and row counting `records.java` targeting PostgreSQL (`org.postgresql.Driver`) / MySQL.
- **JSP Dynamic Pages**: Form-based request handling, dynamic HTML generation (`database.jsp`, `word.jsp`, `result.jsp`, `demo.jsp`).
- Form frontends: `database.html`, `First.html`, `operations.html`, `word.html`.

#### 9. Academic Lab Assignments
- [**Assign1/**](Assign1/): Foundational exercises covering date formats (`DateFormatDemo`, `EasyDateDemo`), prime verification, multiplication matrices, and 2D arrays.
- [**Assign2/**](Assign2/):
  - **Set A**: Class definitions (`Employee`, `Person`, `Sphere`, `MyNumber`).
  - **Set B**: Constructor arrays and multi-level packaging (`Clock`, `CricketPlayer`, `Operation/Addition.java`, `Operation/Maximum.java`, `SY/SYMarks.java`, `TY/TYMarks.java`).
  - **Set C**: Cross-package relationships (`CustomerPack`, `string_operation`, `student`, `DifferentPackageDemo.java`).
- [**Assign3/**](Assign3/): Vehicle hierarchies, office staff models, credit card tier interfaces (`GoldCardCustomer`, `SilverCardCustomer`), and sales/purchase order abstractions.

#### 10. University Practical Slips & Web Tech
Located in [**slips/**](slips/):
- **Java Slips (Chapters 1–4)**: Exam problem sets covering loops, arrays, OOP, inheritance, custom exceptions, and file processing.
- **Web Technology Slips (Chapters 6–8)**:
  - **Chapter 6**: HTML5 forms, modern CSS layout styling, table grids, and image galleries (`RegistrationForm.html`, `StudentRegistrationForm.html`, `CollegeHomepage.html`, `HoverEffects.html`, `ImageGallery.html`).
  - **Chapter 7**: Client-side JavaScript DOM manipulation (`ChangeHeadingText.html`, `ChangeImage.html`).
  - **Chapter 8**: Modern ES6 JavaScript features: arrow functions, rest/spread operators, object destructuring, and ES modules (`ArrowFunctions.js`, `ObjectDestructuring.js`, `SpreadOperatorArray.js`, `mathOperations.mjs`, `MainApp.mjs`).

#### 11. Reference Notes & Question Banks
Located in [**Notes/**](Notes/):
- Interactive HTML documentation files for study and exam revision:
  - `Chapter2_Objects_And_Classes.html`
  - `Chapter3_Inheritance_And_Interfaces.html`
  - `Chapter4_Exception_And_File_Handling.html`
  - `Chapter5_User_Interface_with_JavaFX.html`
  - `AbstractClassNotes.html`
  - `all_questions.html` & `selected_slips.html`

---

## 💻 Prerequisites & Environment

| Component | Minimum Version | Recommended | Notes |
| :--- | :--- | :--- | :--- |
| **Java Development Kit (JDK)** | Java SE 8 | Java SE 17+ / 21 LTS | Ensure `javac` and `java` are configured in your system `PATH`. |
| **Database Server** | PostgreSQL 12+ / MySQL 8+ | PostgreSQL 15+ | Required for `Database_JSP/` programs. |
| **Web Container** | Apache Tomcat 9+ | Apache Tomcat 10+ | Required to deploy `.jsp` pages. |
| **Node.js** *(Optional)* | v16+ | v20+ LTS | To execute Chapter 8 JavaScript/ES6 slips directly in terminal. |
| **Web Browser** | Any modern browser | Chrome / Firefox / Edge | For viewing HTML notes and web slips. |

---

## 🚀 How to Run

### 1. Compiling & Running Core Java Programs

Navigate to any target directory, compile with `javac`, and execute the bytecode with `java`:

```bash
# Example 1: Running an algorithm from BasicPrograms
cd BasicPrograms
javac TwoSum.java
java TwoSum

# Example 2: Running an OOP demonstration (from OOP_Programs root)
cd ../OOP_Programs
javac Part1_ClassAndObject/Program01_StudentClass.java
java Part1_ClassAndObject.Program01_StudentClass

# Example 3: Running an abstraction example
javac Part5_Abstraction/Program14_AbstractVehicle.java
java Part5_Abstraction.Program14_AbstractVehicle
```

---

### 2. Programs with Custom Packages (`mypack`, `StringOperation`)

For programs utilizing package namespaces, compile using the root directory or the `-d` (destination) flag:

```bash
# Compile package classes from the repository root:
javac -d . mypack/*.java

# Compile and run the consumer/driver class:
javac -cp . mypack/Test.java
java -cp . mypack.Test

# Example for StringOperation:
javac -d . StringOperation/*.java
java -cp . StringOperation.TestStringOperation
```

---

### 3. Client-Server Networking Programs

Socket programs require starting the server first to listen on the specified port, followed by running the client in a second terminal session:

#### Terminal 1 — Start the Server:
```bash
cd Networking
javac ChatServer.java
java ChatServer
```
*Output: `Server ready for chatting` (listening on port 3000)*

#### Terminal 2 — Connect the Client:
```bash
cd Networking
javac ChatClient.java
java ChatClient
```

---

### 4. GUI & AWT Frame Applications

Standard AWT GUI programs run as standalone desktop frames:

```bash
cd GUI_Applets
javac TrafficSignal.java
java TrafficSignal
```

```bash
cd GUI_Applets
javac BouncingBall.java
java BouncingBall
```

> **Note on JavaFX (`PrimeCheck.java`)**: If using JDK 11+, compile and run JavaFX applications with the OpenJFX SDK module path:
> ```bash
> javac --module-path <path-to-javafx-sdk>/lib --add-modules javafx.controls PrimeCheck.java
> java --module-path <path-to-javafx-sdk>/lib --add-modules javafx.controls PrimeCheck
> ```

---

### 5. JDBC and JSP Web Applications

#### For JDBC Console Programs:
1. Ensure your PostgreSQL service is running and database `java` is created:
   ```sql
   CREATE DATABASE java;
   \c java
   CREATE TABLE person (id INT PRIMARY KEY, name VARCHAR(50), age INT);
   ```
2. Include the PostgreSQL JDBC Driver in your classpath when compiling and running:
   ```bash
   cd Database_JSP

   # Windows
   javac -cp ".;postgresql.jar" records.java
   java -cp ".;postgresql.jar" records

   # Linux / macOS
   javac -cp ".:postgresql.jar" records.java
   java -cp ".:postgresql.jar" records
   ```

#### For JSP Dynamic Pages:
1. Copy or deploy the `Database_JSP` folder to the `webapps/` directory of your Apache Tomcat installation.
2. Start Apache Tomcat (`bin/startup.bat` on Windows or `bin/catalina.sh run` on Linux/macOS).
3. Access the pages in your browser:
   ```text
   http://localhost:8080/Database_JSP/database.jsp
   ```

---

### 6. Running Web Technology Slips (HTML & JS)

- **HTML / CSS / DOM Slips (`chapter6`, `chapter7`)**: Open the `.html` files directly in any web browser.
- **ES6 JavaScript Slips (`chapter8`)**: Run in terminal using Node.js:
  ```bash
  cd slips/chapter8
  node ArrowFunctions.js
  node SpreadOperatorArray.js
  node MainApp.mjs
  ```

---

## 🛠️ Code Conventions & Best Practices

- **Naming Conventions**: PascalCase for class names (`StudentResult`), camelCase for method and variable names (`calculateGrade`), UPPER_SNAKE_CASE for constants.
- **Resource Management**: Input/output streams and database connections should be wrapped in `try-with-resources` or closed in `finally` blocks.
- **Package Hierarchy**: Packages match folder hierarchy for clean modular reuse.

---


## 📜 License & Academic Integrity

This repository is maintained for educational, reference, and self-study purposes. All assignments and slips are structured to adhere to academic curricula and industry programming standards.

Feel free to star ⭐ the repository if you find it helpful for your Java learning journey!
