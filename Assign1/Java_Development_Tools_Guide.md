# Comprehensive Guide: Java Development Tools & Execution Lifecycle

This document provides a detailed, step-by-step breakdown of Java core development tools (`javac`, `java`, `javap`, `javadoc`) and demonstrates the execution lifecycle with practical examples.

---

##  Procedure Overview & Explanation of Each Step

### **Step 1: Source Code Creation (`.java` File)**
* **Concept:** Java is an object-oriented, strongly typed language. Java source code is saved with the `.java` file extension.
* **Key Rules:**
  * The file name **must exactly match** the name of the `public class` defined inside it (e.g., `Hello.java` for `public class Hello`).
  * The `main` method `public static void main(String[] args)` serves as the entry point for execution:
    * `public`: Accessible from anywhere.
    * `static`: Can be called without instantiating an object of the class.
    * `void`: Does not return any value.
    * `String[] args`: Accepts command-line arguments.

---

### **Step 2: Compilation (`javac`)**
* **Command:** `javac Hello.java`
* **What happens:**
  1. The **Java Compiler (`javac`)** performs lexical analysis, parsing, and semantic checks on the source code.
  2. If error-free, `javac` compiles the human-readable Java code into **Java Bytecode** (an intermediate instruction set).
  3. The output is a `.class` file (e.g., `Hello.class`).
* **Why Bytecode?** Bytecode is platform-independent. It allows Java to achieve its motto: **"Write Once, Run Anywhere" (WORA)**.

---

### **Step 3: Execution (`java`)**
* **Command:** `java Hello` *(Note: Class extension `.class` is omitted)*
* **What happens inside the JVM (Java Virtual Machine):**
  1. **Class Loader:** Loads `Hello.class` into JVM memory (Method Area).
  2. **Bytecode Verifier:** Checks the bytecode for security and structural violations.
  3. **Execution Engine:** Translates bytecode into native machine instructions using an Interpreter and JIT (Just-In-Time) compiler.
  4. **Output:** Executes `main()` and outputs results to the console (`Hello Java`).

---

### **Step 4, 5 & 6: Inspecting Class Structures (`javap`)**
* **Commands:**
  * `javap java.lang.String`
  * `javap java.lang.Object`
  * `javap java.util.Scanner`
* **What happens:** The **Java Disassembler (`javap`)** inspects compiled `.class` files.
  * It displays the class hierarchy, constructors, public fields, and method signatures.
  * Useful for exploring standard library classes (like `String`, `Object`, `Scanner`) or third-party bytecode when source code is unavailable.

---

### **Step 7: Viewing Bytecode Assembly (`javap -c`)**
* **Command:** `javap -c Hello`
* **What happens:** The `-c` flag instructs `javap` to disassemble method code into low-level **JVM Bytecode Opcodes**.
* **Common Bytecode Instructions:**
  * `aload_0` / `iload_1`: Load reference / integer local variable onto the operand stack.
  * `invokespecial`: Invoke instance initialization method (`<init>`).
  * `invokevirtual`: Invoke public instance method.
  * `iadd` / `isub`: Add / Subtract two integers.
  * `return` / `ireturn`: Return void / integer from a method.

---

### **Step 8: Generating API Documentation (`javadoc`)**
* **Command:** `javadoc -d doc Hello.java`
* **What happens:** The `javadoc` tool parses special Javadoc comments (`/** ... */`) in the Java source file and generates HTML documentation.
* **Key Javadoc Tags:**
  * `@author`: Specifies the author.
  * `@version`: Specifies software version.
  * `@param`: Describes method parameters.
  * `@return`: Describes return values.

---

##  Complete Hands-on Example: `Calculator.java`

To demonstrate these tools on a custom Java program, we created [Calculator.java](file:///f:/1.Java%20Practice/Java/Assign1/Calculator.java).

### **1. Source Code (`Calculator.java`)**

```java
/**
 * The Calculator class provides basic arithmetic operations
 * such as addition and subtraction.
 * 
 * @author Java Learner
 * @version 1.0
 */
public class Calculator {

    /**
     * Adds two integers.
     * 
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first integer.
     * 
     * @param a first number
     * @param b second number
     * @return difference of a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Main method to demonstrate Calculator functionality.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(15, 25);
        int diff = calc.subtract(50, 20);

        System.out.println("Calculator Demo");
        System.out.println("15 + 25 = " + sum);
        System.out.println("50 - 20 = " + diff);
    }
}
```

---

### **2. Execution Commands & Results**

#### **A. Compilation**
```bash
javac Calculator.java
```
* **Output:** Creates [Calculator.class](file:///f:/1.Java%20Practice/Java/Assign1/Calculator.class).

#### **B. Execution**
```bash
java Calculator
```
* **Output:**
```text
Calculator Demo
15 + 25 = 40
50 - 20 = 30
```

#### **C. Class Structure Inspection**
```bash
javap Calculator
```
* **Output:**
```text
Compiled from "Calculator.java"
public class Calculator {
  public Calculator();
  public int add(int, int);
  public int subtract(int, int);
  public static void main(java.lang.String[]);
}
```

#### **D. Disassembled Bytecode**
```bash
javap -c Calculator
```
* **Output:**
```text
public int add(int, int);
  Code:
     0: iload_1
     1: iload_2
     2: iadd
     3: ireturn

public int subtract(int, int);
  Code:
     0: iload_1
     1: iload_2
     2: isub
     3: ireturn
```

#### **E. Documentation Generation**
```bash
javadoc -d doc Calculator.java
```
* **Output:** HTML API documentation generated in the `doc/` directory (`doc/index.html`, `doc/Calculator.html`, etc.).

---

##  Summary of JDK Tools

| Tool | Purpose / Description | Syntax | Example |
| :--- | :--- | :--- | :--- |
| `javac` (Java Compiler) | Compiles the Java source file (`.java`) into bytecode (`.class`). It also checks for syntax errors during compilation. | `javac FileName.java` | `javac HelloWorld.java` |
| `java` (Java Interpreter / Launcher) | Executes the compiled Java bytecode (`.class`) using the Java Virtual Machine (JVM). | `java ClassName` | `java HelloWorld` |
| `javadoc` (Java Documentation Tool) | Generates HTML documentation from comments written in Java source code. | `javadoc FileName.java` | `javadoc HelloWorld.java` |
| `jar` (Java Archive Tool) | Packages multiple class files and resources into a single `.jar` (Java Archive) file for easy distribution. | `jar cf FileName.jar *.class` | `jar cf Hello.jar *.class` |
| `jdb` (Java Debugger) | A command-line debugger used to find and fix errors in Java programs. It allows setting breakpoints, executing the program step by step, and inspecting variables. | `jdb [options] ClassName [arguments...]` | `jdb MyClass` |
| `javap` (Java Class File Disassembler) | Displays information about a compiled `.class` file, such as constructors, methods, fields, and bytecode instructions. | `javap [options] ClassName` | `javap java.lang.String` |

