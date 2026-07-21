# Java Practice Repository

A comprehensive collection of Java programming exercises and examples covering core concepts, networking, multithreading, GUI programming, and web development with JSP.

## Directory Structure

The repository is organized into the following logical folders:

### 📂 [Networking/](file:///f:/1.Java%20Practice/Java/Networking)
- **Sockets & Client-Server Communication**: Chat, date/time, and file listing services.
- **Utilities**: Echo server, IP address lookup, and URL handling.

### 📂 [Multithreading/](file:///f:/1.Java%20Practice/Java/Multithreading)
- **Concurrency Examples**: Producer-Consumer problem, join/sleep demonstrations, and custom multi-threaded calculations.

### 📂 [GUI_Applets/](file:///f:/1.Java%20Practice/Java/GUI_Applets)
- **AWT & Applets**: Graphical animations (Bouncing Ball), interactive simulations (Traffic Signal), and animated/blinking text.

### 📂 [Database_JSP/](file:///f:/1.Java%20Practice/Java/Database_JSP)
- **Web & DB Operations**: JSP files for dynamic web page generation and JDBC scripts demonstrating CRUD operations (Insert, Update, Delete, Records retrieval).

### 📂 [BasicPrograms/](file:///f:/1.Java%20Practice/Java/BasicPrograms)
- **Core Java & Algorithms**: Basic math (Prime numbers, Armstrong numbers, Palindromes, Fibonacci/Factorial), array/matrix manipulation, string exercises (Pig Latin, Vowel counting), and OOP demonstrations (ATM system, Constructor usage, Employee/Student classes).

---

## Technologies Used
- **Java SE** - Core programming language
- **Java Networking** - Socket programming
- **Java Threads** - Multithreading and concurrency
- **Java AWT/Applet** - GUI programming
- **JSP (JavaServer Pages)** - Web development
- **JDBC** - Database connectivity
- **PostgreSQL / MySQL** - Database management

## Usage

Each Java file can be compiled and run independently from its folder:

1. **Navigate to the subdirectory**:
   ```bash
   cd BasicPrograms
   ```
2. **Compile the program**:
   ```bash
   javac TwoSum.java
   ```
3. **Run the program**:
   ```bash
   java TwoSum
   ```

For JSP files, deploy them to a web application server (such as Apache Tomcat) and ensure the PostgreSQL/MySQL database server is configured as required by the JDBC connection strings.
