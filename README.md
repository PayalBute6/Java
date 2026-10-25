# Java Practice Repository

A comprehensive collection of Java programming exercises, practical assignments, and reference examples covering core concepts, object-oriented design, networking, multithreading, GUI programming, and web development with JSP/JDBC.

---

## 📁 Repository Structure

| Directory | Description |
| :--- | :--- |
| [**BasicPrograms/**](BasicPrograms/) | Fundamental Java algorithms: number theory (prime, armstrong, fibonacci), array & matrix operations, and basic OOP demonstrations. |
| [**OOP_Programs/**](OOP_Programs/) | Deep-dive into Object-Oriented Programming: Classes & Objects, Methods, Constructors, Encapsulation, Abstraction, Inheritance, and Polymorphism. |
| [**JavaPrep/**](JavaPrep/) | Core Java interview and practice programs: search algorithms, string and number manipulation, and frequency counters. |
| [**Networking/**](Networking/) | Sockets & Client-Server applications: Chat servers, Date/Time services, File transfer, Echo server, and URL/IP utilities. |
| [**Multithreading/**](Multithreading/) | Concurrency & Thread synchronization: Producer-Consumer pattern, thread lifecycle, `join`/`sleep` demonstrations. |
| [**GUI_Applets/**](GUI_Applets/) | Graphical applications and animations: Bouncing Ball, Traffic Signal simulation, and text animation effects using AWT/Applets. |
| [**Database_JSP/**](Database_JSP/) | Web applications and database integration: Dynamic JSP pages and JDBC implementations with CRUD operations (PostgreSQL / MySQL). |
| [**StringOperation/**](StringOperation/) | String comparison, concatenation, and utility implementations. |
| [**Assign1/**](Assign1/) / [**Assign2/**](Assign2/) / [**Assign3/**](Assign3/) | Practical lab exercises and assignments. |
| [**slips/**](slips/) | Practical exam question slips, problem sets, and solutions. |
| [**Notes/**](Notes/) | Topic summaries, HTML lecture notes, and question banks. |

---

## 🛠️ Technologies Used

- **Java SE (Standard Edition)** - Core programming language
- **Java Networking** - Socket programming (TCP/IP)
- **Java Concurrency** - Multithreading, thread synchronization, locks
- **Java AWT / Applet** - GUI components and graphics rendering
- **JSP (JavaServer Pages) & Servlets** - Dynamic web page development
- **JDBC (Java Database Connectivity)** - Relational database persistence
- **PostgreSQL / MySQL** - Relational database management systems

---

## 🚀 How to Run

### 1. Core Java Programs

Navigate to the respective folder, compile with `javac`, and execute with `java`:

```bash
# Navigate to the target directory
cd BasicPrograms

# Compile the Java file
javac TwoSum.java

# Run the compiled bytecode
java TwoSum
```

### 2. Programs Using Packages (`mypack`, etc.)

Compile from the root directory or with the classpath flag:

```bash
javac -d . mypack/*.java
javac -cp . TestClass.java
java -cp . TestClass
```

### 3. Database & JSP Web Applications

1. Ensure **PostgreSQL** or **MySQL** server is running and database tables are created according to the schema in the SQL/JSP files.
2. Deploy the `Database_JSP/` project to a servlet container such as **Apache Tomcat**.
3. Ensure the appropriate JDBC driver (`postgresql.jar` / `mysql-connector-java.jar`) is in your classpath or Tomcat `lib/` directory.

---

## 📝 License & Contributions

This repository is maintained for educational and reference purposes. Feel free to explore, learn, and use the code for practice!
