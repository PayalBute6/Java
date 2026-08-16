# Java Programming (Chapter 1) - Study Guide

This document contains a structured set of **24 Java Programs** covering introductory Java topics (1.1 to 1.9). It is formatted for clean export to PDF.

---

## Program Quick Reference

| # | Program Name | Syllabus Topic | Key Concept |
|---|---|---|---|
| 01 | P01BasicStructureAndComments | 1.4 & 1.6.1 | Structure & Comment Types |
| 02 | P02PrimitiveDataTypes | 1.6.1 & 1.6.3 | Data Types & Memory Sizes |
| 03 | P03TypeCastingDemo | 1.6 | Widening, Narrowing & ASCII |
| 04 | P04VariableSwapping | 1.6.3 | Variable Swapping Methods |
| 05 | P05EvenOddAndSignCheck | 1.7 | Sign & Parity (`if-else`) |
| 06 | P06LargestOfThreeNumbers | 1.7 | Max of 3 (`if-else` & `?:`) |
| 07 | P07MenuDrivenCalculator | 1.7 | Calculator (`switch-case`) |
| 08 | P08FactorialAndTable | 1.7 | Factorial & Table (`for` loop) |
| 09 | P09ReverseNumberAndPalindrome | 1.7 | Digit Reverse & Palindrome |
| 10 | P10ArmstrongAndPrimeCheck | 1.7 | Armstrong & Prime Check |
| 11 | P11FibonacciSeries | 1.7 | Fibonacci Sequence |
| 12 | P12NestedLoopPatterns | 1.7 | Star & Number Patterns |
| 13 | P13ArraySumAndAverage | 1.8 | 1D Array Statistics |
| 14 | P14ReverseArrayInPlace | 1.8 | In-Place Array Reversal |
| 15 | P15LinearSearchArray | 1.8 | Linear Search in Array |
| 16 | P16BubbleSortArray | 1.8 | Bubble Sorting Algorithm |
| 17 | P17MatrixAdditionSubtraction | 1.8 | 2D Matrix Addition |
| 18 | P18MatrixMultiplication | 1.8 | 2D Matrix Multiplication |
| 19 | P19CommandLineArguments | 1.9 | Terminal `String[] args` |
| 20 | P20ScannerInputDemo | 1.9 | User Input (`Scanner`) |
| 21 | [P21BufferedReaderInputDemo](#21-p21bufferedreaderinputdemo) | 1.9 | `BufferedReader` & Input |
| 22 | P22DataInputStreamDemo | 1.9 | Legacy `DataInputStream` |
| 23 | P23RectangleOOP | 1.1 | Class, Objects & Methods |
| 24 | P24MethodOverloading | 1.1 | Method Overloading |

<div style="page-break-after: always;"></div>

---

## 1. Syntax, Data Types & Variables

### 01. P01BasicStructureAndComments
> **Topic:** 1.4 Structure of Java Program & 1.6.1 Comments  
> **Concept:** Every Java application requires a `main` method. Java supports single-line (`//`), multi-line (`/* */`), and Javadoc (`/** */`) comments.

```java
public class P01BasicStructureAndComments {
    public static void main(String[] args) {
        // Single-line comment
        System.out.println("STUDENT INFORMATION SYSTEM");

        /* Multi-line comment: Print student details */
        System.out.println("Name       : John Doe");
        System.out.println("Roll No    : 101");
        System.out.println("Course     : CSE");
    }
}
```
**Output:**
```text
STUDENT INFORMATION SYSTEM
Name       : John Doe
Roll No    : 101
Course     : CSE
```

---

### 02. P02PrimitiveDataTypes
> **Topic:** 1.6.1 Data Types & 1.6.3 Variables  
> **Concept:** Java has 8 primitive types (`byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`). Memory sizes can be inspected using wrapper constants like `Integer.BYTES`.

```java
public class P02PrimitiveDataTypes {
    public static void main(String[] args) {
        byte byteVar = 100;
        short shortVar = 30000;
        int intVar = 2000000;
        long longVar = 9876543210L;

        float floatVar = 5.75f;
        double doubleVar = 19.9999;
        char charVar = 'A';
        boolean booleanVar = true;

        System.out.println("byte   : " + byteVar + " (" + Byte.BYTES + "B)");
        System.out.println("int    : " + intVar + " (" + Integer.BYTES + "B)");
        System.out.println("double : " + doubleVar + " (" + Double.BYTES + "B)");
        System.out.println("char   : " + charVar + " (" + Character.BYTES + "B)");
        System.out.println("boolean: " + booleanVar);
    }
}
```
**Output:**
```text
byte   : 100 (1B)
int    : 2000000 (4B)
double : 19.9999 (8B)
char   : A (2B)
boolean: true
```

---

### 03. P03TypeCastingDemo
> **Topic:** 1.6 Basic concepts in Java - Type Casting  
> **Concept:** Widening (small to large) is automatic. Narrowing (large to small) requires explicit cast `(int)`. Characters cast to ASCII integer codes.

```java
public class P03TypeCastingDemo {
    public static void main(String[] args) {
        // Implicit (Widening)
        int numInt = 100;
        double numDouble = numInt;

        // Explicit (Narrowing)
        double valDouble = 99.99;
        int valInt = (int) valDouble;

        // ASCII Character Conversion
        char ch = 'A';
        int ascii = ch;

        System.out.println("Implicit int to double: " + numDouble);
        System.out.println("Explicit double to int: " + valInt);
        System.out.println("Char 'A' ASCII Code   : " + ascii);
    }
}
```
**Output:**
```text
Implicit int to double: 100.0
Explicit double to int: 99
Char 'A' ASCII Code   : 65
```

---

### 04. P04VariableSwapping
> **Topic:** 1.6.3 Variables & Arithmetic Operators  
> **Concept:** Swapping values can be done using a third temporary variable or using arithmetic operations (`x = x + y`).

```java
public class P04VariableSwapping {
    public static void main(String[] args) {
        // Method 1: Using Temporary Variable
        int a = 10, b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Method 1 (Temp)   : a = " + a + ", b = " + b);

        // Method 2: Without Temporary Variable
        int x = 50, y = 100;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Method 2 (No Temp): x = " + x + ", y = " + y);
    }
}
```
**Output:**
```text
Method 1 (Temp)   : a = 20, b = 10
Method 2 (No Temp): x = 100, y = 50
```

<div style="page-break-after: always;"></div>

---

## 2. Control Flow Statements

### 05. P05EvenOddAndSignCheck
> **Topic:** 1.7 Control Flow Statements - Conditional Branching  
> **Concept:** Use `if-else-if` to check sign. Use remainder operator `% 2 == 0` to determine parity.

```java
public class P05EvenOddAndSignCheck {
    public static void main(String[] args) {
        int number = -14;

        if (number > 0) {
            System.out.println(number + " is POSITIVE");
        } else if (number < 0) {
            System.out.println(number + " is NEGATIVE");
        } else {
            System.out.println("Number is ZERO");
        }

        if (number % 2 == 0) {
            System.out.println(number + " is EVEN");
        } else {
            System.out.println(number + " is ODD");
        }
    }
}
```
**Output:**
```text
-14 is NEGATIVE
-14 is EVEN
```

---

### 06. P06LargestOfThreeNumbers
> **Topic:** 1.7 Control Flow Statements - Nested `if-else` & Ternary  
> **Concept:** Finds maximum value using nested `if` statements or compact ternary operator syntax `(cond) ? val1 : val2`.

```java
public class P06LargestOfThreeNumbers {
    public static void main(String[] args) {
        int a = 45, b = 89, c = 67;

        // Nested if-else
        int largestIf;
        if (a >= b) {
            largestIf = (a >= c) ? a : c;
        } else {
            largestIf = (b >= c) ? b : c;
        }

        // Ternary Shorthand
        int max = (a >= b && a >= c) ? a : ((b >= c) ? b : c);

        System.out.println("Largest (Nested if): " + largestIf);
        System.out.println("Largest (Ternary)  : " + max);
    }
}
```
**Output:**
```text
Largest (Nested if): 89
Largest (Ternary)  : 89
```

---

### 07. P07MenuDrivenCalculator
> **Topic:** 1.7 Control Flow Statements - `switch-case`  
> **Concept:** Evaluates an operator character to execute matching arithmetic block. Uses `break` to prevent fallthrough.

```java
public class P07MenuDrivenCalculator {
    public static void main(String[] args) {
        double a = 20.0, b = 5.0;
        char op = '*';

        switch (op) {
            case '+': System.out.println("Sum : " + (a + b)); break;
            case '-': System.out.println("Diff: " + (a - b)); break;
            case '*': System.out.println("Prod: " + (a * b)); break;
            case '/': 
                if (b != 0) System.out.println("Quot: " + (a / b));
                else System.out.println("Error: Div by 0");
                break;
            default: System.out.println("Invalid operator"); break;
        }
    }
}
```
**Output:**
```text
Prod: 100.0
```

---

### 08. P08FactorialAndTable
> **Topic:** 1.7 Control Flow Statements - `for` Loop  
> **Concept:** Demonstrates loop accumulation for factorial ($N!$) and iteration for multiplication table.

```java
public class P08FactorialAndTable {
    public static void main(String[] args) {
        int n = 5;

        // Factorial
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(n + "! = " + fact);

        // Multiplication Table
        System.out.println("Table of " + n + ":");
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
```
**Output:**
```text
5! = 120
Table of 5:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
```

---

### 09. P09ReverseNumberAndPalindrome
> **Topic:** 1.7 Control Flow Statements - `while` Loop  
> **Concept:** Extract digits using `% 10` and reduce number using `/ 10` inside `while` loop. Check if original equals reversed.

```java
public class P09ReverseNumberAndPalindrome {
    public static void main(String[] args) {
        int original = 12321;
        int num = original;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = (reversed * 10) + digit;
            num /= 10;
        }

        System.out.println("Reversed: " + reversed);
        if (original == reversed) {
            System.out.println("Result  : PALINDROME");
        } else {
            System.out.println("Result  : NOT PALINDROME");
        }
    }
}
```
**Output:**
```text
Reversed: 12321
Result  : PALINDROME
```

---

### 10. P10ArmstrongAndPrimeCheck
> **Topic:** 1.7 Control Flow Statements - Number Analysis  
> **Concept:** Sum of cubed digits tests Armstrong property ($153 = 1^3+5^3+3^3$). Testing factors up to $\sqrt{N}$ checks Primality.

```java
public class P10ArmstrongAndPrimeCheck {
    public static void main(String[] args) {
        int num = 153;

        // Armstrong Check
        int temp = num, sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += (d * d * d);
            temp /= 10;
        }
        System.out.println("Armstrong: " + (sum == num));

        // Prime Check
        int p = 29;
        boolean isPrime = p > 1;
        for (int i = 2; i <= Math.sqrt(p); i++) {
            if (p % i == 0) { isPrime = false; break; }
        }
        System.out.println("Prime 29 : " + isPrime);
    }
}
```
**Output:**
```text
Armstrong: true
Prime 29 : true
```

---

### 11. P11FibonacciSeries
> **Topic:** 1.7 Control Flow Statements - Loop Iteration  
> **Concept:** Sequence where each term is the sum of previous two terms (`c = a + b`).

```java
public class P11FibonacciSeries {
    public static void main(String[] args) {
        int terms = 7, a = 0, b = 1;
        System.out.print("Fibonacci: " + a + ", " + b);

        for (int i = 3; i <= terms; i++) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}
```
**Output:**
```text
Fibonacci: 0, 1, 1, 2, 3, 5, 8
```

---

### 12. P12NestedLoopPatterns
> **Topic:** 1.7 Control Flow Statements - Nested Loops  
> **Concept:** Outer loop manages rows, inner loop manages columns for pattern printing.

```java
public class P12NestedLoopPatterns {
    public static void main(String[] args) {
        int rows = 4;
        System.out.println("Star Pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```
**Output:**
```text
Star Pattern:
* 
* * 
* * * 
* * * * 
```

<div style="page-break-after: always;"></div>

---

## 3. Arrays in Java

### 13. P13ArraySumAndAverage
> **Topic:** 1.8 Arrays in Java - 1D Array Basics  
> **Concept:** Iterate array elements to accumulate sum, compute average, and track min/max.

```java
public class P13ArraySumAndAverage {
    public static void main(String[] args) {
        int[] arr = { 23, 45, 12, 67, 89 };
        int sum = 0, min = arr[0], max = arr[0];

        for (int num : arr) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        double avg = (double) sum / arr.length;
        System.out.println("Sum: " + sum + " | Avg: " + avg);
        System.out.println("Min: " + min + " | Max: " + max);
    }
}
```
**Output:**
```text
Sum: 236 | Avg: 47.2
Min: 12 | Max: 89
```

---

### 14. P14ReverseArrayInPlace
> **Topic:** 1.8 Arrays in Java - Two-Pointer Reversal  
> **Concept:** Uses two pointers (`left`, `right`) moving toward center to swap elements in-place.

```java
public class P14ReverseArrayInPlace {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.print("Reversed: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
```
**Output:**
```text
Reversed: 50 40 30 20 10 
```

---

### 15. P15LinearSearchArray
> **Topic:** 1.8 Arrays in Java - Searching Algorithms  
> **Concept:** Inspects array elements sequentially from index 0 until matching target key is found.

```java
public class P15LinearSearchArray {
    public static void main(String[] args) {
        int[] arr = { 15, 42, 8, 99, 63 };
        int key = 99, foundIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                foundIndex = i;
                break;
            }
        }
        System.out.println("Key " + key + " Index: " + foundIndex);
    }
}
```
**Output:**
```text
Key 99 Index: 3
```

---

### 16. P16BubbleSortArray
> **Topic:** 1.8 Arrays in Java - Bubble Sort  
> **Concept:** Repeatedly swaps adjacent out-of-order elements so larger numbers bubble up to the end.

```java
public class P16BubbleSortArray {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
```
**Output:**
```text
Sorted: 12 22 25 34 64 
```

---

### 17. P17MatrixAdditionSubtraction
> **Topic:** 1.8 Arrays in Java - 2D Arrays  
> **Concept:** 2D array matrix addition: `sum[i][j] = a[i][j] + b[i][j]`.

```java
public class P17MatrixAdditionSubtraction {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] sum = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
```
**Output:**
```text
6	8	
10	12	
```

---

### 18. P18MatrixMultiplication
> **Topic:** 1.8 Arrays in Java - Matrix Multiplication  
> **Concept:** Computes row-by-column dot products using 3 nested loops.

```java
public class P18MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{7, 8}, {9, 1}, {2, 3}};
        int[][] res = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
```
**Output:**
```text
31	19	
85	55	
```

<div style="page-break-after: always;"></div>

---

## 4. Input Methods & OOP Basics

### 19. P19CommandLineArguments
> **Topic:** 1.9 Accepting Input - Command Line Arguments  
> **Concept:** Reads parameters passed to `main(String[] args)` and parses numbers using `Integer.parseInt()`.

```java
public class P19CommandLineArguments {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Pass arguments: Name Age Marks");
            return;
        }
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double pct = Double.parseDouble(args[2]);

        System.out.println(name + ", Age: " + age + ", " + pct + "%");
    }
}
```
**Output:**
```text
Pass arguments: Name Age Marks
```

---

### 20. P20ScannerInputDemo
> **Topic:** 1.9 Accepting Input - `java.util.Scanner`  
> **Concept:** Reads user keyboard input interactively using `sc.nextLine()` and `sc.nextInt()`.

```java
import java.util.Scanner;

public class P20ScannerInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Hello, " + name);
        sc.close();
    }
}
```
**Output:**
```text
Enter Name: John
Hello, John
```

---

### 21. P21BufferedReaderInputDemo
> **Topic:** 1.9 Accepting Input - `BufferedReader`  
> **Concept:** High-performance buffered input reading with `try-catch` exception handling for `IOException`.

```java
import java.io.*;

public class P21BufferedReaderInputDemo {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        try {
            System.out.print("Enter ID: ");
            int id = Integer.parseInt(br.readLine());
            System.out.println("ID: " + id);
        } catch (IOException e) {
            System.out.println("IO Error");
        }
    }
}
```
**Output:**
```text
Enter ID: 101
ID: 101
```

---

### 22. P22DataInputStreamDemo
> **Topic:** 1.9 Accepting Input - Legacy `DataInputStream`  
> **Concept:** Demonstrates legacy input reading using `DataInputStream.readLine()`.

```java
import java.io.*;

@SuppressWarnings("deprecation")
public class P22DataInputStreamDemo {
    public static void main(String[] args) {
        DataInputStream dis = new DataInputStream(System.in);
        try {
            System.out.print("Enter Radius: ");
            float r = Float.parseFloat(dis.readLine());
            System.out.println("Area: " + (Math.PI * r * r));
        } catch (IOException e) {
            System.out.println("Error reading input");
        }
    }
}
```
**Output:**
```text
Enter Radius: 5
Area: 78.53981633974483
```

---

### 23. P23RectangleOOP
> **Topic:** 1.1 OOP Concepts - Classes & Objects  
> **Concept:** Defines a class blueprint with private attributes, constructor, and methods. Creates objects with `new`.

```java
class Rectangle {
    private double length, width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double calculateArea() {
        return length * width;
    }
}

public class P23RectangleOOP {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10.5, 5.0);
        System.out.println("Area: " + rect.calculateArea());
    }
}
```
**Output:**
```text
Area: 52.5
```

---

### 24. P24MethodOverloading
> **Topic:** 1.1 OOP Concepts - Method Overloading  
> **Concept:** Methods sharing the same name but different parameter signatures (Compile-Time Polymorphism).

```java
public class P24MethodOverloading {
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double area(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        System.out.println("Circle Area   : " + area(5.0));
        System.out.println("Rectangle Area: " + area(10.0, 4.0));
    }
}
```
**Output:**
```text
Circle Area   : 78.53981633974483
Rectangle Area: 40.0
```
