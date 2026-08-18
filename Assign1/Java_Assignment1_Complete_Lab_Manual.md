# Java Practical Lab Assignment Manual

---

# SET A

## Set A - Question (a)
**Using `javap`, view the methods of the following classes from the lang package: `java.lang.Object`, `java.lang.String` and `java.util.Scanner`. And also compile sample program 8. Type the following command and view the bytecodes: `javap -c MyClass`.**

### Source Code (`MyClass.java`)
```java
public class MyClass {
    public static void main(String[] args) {
        System.out.println("Hello from MyClass!");
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Sum: " + c);
    }
}
```

### Commands
```bash
javap java.lang.Object
javap java.lang.String
javap java.util.Scanner
javac MyClass.java
javap -c MyClass
```

---

## Set A - Question (b)
**Write a program to calculate perimeter and area of rectangle. (Hint: area = length * breadth, perimeter = 2 * (length + breadth))**

### Source Code (`RectangleAreaPerimeter.java`)
```java
import java.util.Scanner;

public class RectangleAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);

        sc.close();
    }
}
```

### Commands & Output
```bash
javac RectangleAreaPerimeter.java
java RectangleAreaPerimeter
```

```text
Enter length of rectangle: 25
Enter breadth of rectangle: 30
Area of Rectangle = 750.0
Perimeter of Rectangle = 110.0
```

---

## Set A - Question (c)
**Write a menu driven program to perform the following operations:**  
i. Calculate the volume of the cylinder. (Hint: Volume = $\pi \times r^2 \times h$)  
ii. Find the factorial of a given number.  
iii. Check if the number is Armstrong or not.  
iv. Exit  

### Source Code (`MenuDrivenProgram.java`)
```java
import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Calculate Volume of Cylinder");
            System.out.println("2. Find Factorial of a Number");
            System.out.println("3. Check if Number is Armstrong");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double height = sc.nextDouble();
                    double volume = 3.14159 * radius * radius * height;
                    System.out.println("Volume of Cylinder = " + volume);
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    long fact = 1;
                    for (int i = 1; i <= num; i++) {
                        fact = fact * i;
                    }
                    System.out.println("Factorial of " + num + " = " + fact);
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int number = sc.nextInt();
                    int temp = number;
                    int sum = 0;
                    while (temp > 0) {
                        int remainder = temp % 10;
                        sum = sum + (remainder * remainder * remainder);
                        temp = temp / 10;
                    }
                    if (sum == number) {
                        System.out.println(number + " is an Armstrong number.");
                    } else {
                        System.out.println(number + " is NOT an Armstrong number.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please choose between 1 and 4.");
            }

        } while (choice != 4);

        sc.close();
    }
}
```

### Commands & Output
```bash
javac MenuDrivenProgram.java
java MenuDrivenProgram
```

```text
1. Calculate Volume of Cylinder
2. Find Factorial of a Number
3. Check if Number is Armstrong
4. Exit
Enter your choice (1-4): 1
Enter radius: 5
Enter height: 6
Volume of Cylinder = 471.2385

Enter your choice (1-4): 4
Exiting the program. Goodbye!
```

---

## Set A - Question (d)
**Write a Java program to generate the Fibonacci series up to n numbers.**

### Source Code (`FibonacciSeries.java`)
```java
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();

        sc.close();
    }
}
```

### Commands & Output
```bash
javac FibonacciSeries.java
java FibonacciSeries
```

```text
Enter the number of terms (n): 10
Fibonacci Series up to 10 terms: 0 1 1 2 3 5 8 13 21 34 
```

---

## Set A - Question (e)
**Write a program to check if a given number is prime or not.**

### Source Code (`PrimeCheck.java`)
```java
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }

        sc.close();
    }
}
```

### Commands & Output
```bash
javac PrimeCheck.java
java PrimeCheck
```

```text
Enter a number: 7
7 is a Prime Number.
```

---

## Set A - Question (f)
**Write a program to accept the array element and display in reverse order.**

### Source Code (`ReverseArrayDisplay.java`)
```java
import java.util.Scanner;

public class ReverseArrayDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array in reverse order: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
```

### Commands & Output
```bash
javac ReverseArrayDisplay.java
java ReverseArrayDisplay
```

```text
Enter the size of the array: 5
Enter 5 elements:
3 6 8 9 7
Array in reverse order: 7 9 8 6 3 
```

---

# SET B

## Set B - Question (a)
**Write a Java program to display the system date and time in various formats shown below:**  
* Current date is : 31/08/2021  
* Current date is : 08-31-2021  
* Current date is : Tuesday August 31 2021  
* Current date and time is : Fri August 31 15:25:59 IST 2021  
* Current date and time is : 31/08/21 15:25:59 PM +0530  
* Current time is : 15:25:59  
* Current week of year is : 35  
* Current week of month : 5  
* Current day of the year is : 243  
*(Note: Use `java.util.Date` and `java.text.SimpleDateFormat` class)*

### Source Code (`DateFormatDemo.java`)
```java
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateFormatDemo {
    public static void main(String[] args) {
        Date currentDate = new Date();

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Current date is : " + sdf1.format(currentDate));

        SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("Current date is : " + sdf2.format(currentDate));

        SimpleDateFormat sdf3 = new SimpleDateFormat("EEEE MMMM dd yyyy");
        System.out.println("Current date is : " + sdf3.format(currentDate));

        SimpleDateFormat sdf4 = new SimpleDateFormat("EEE MMMM dd HH:mm:ss z yyyy");
        System.out.println("Current date and time is : " + sdf4.format(currentDate));

        SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
        System.out.println("Current date and time is : " + sdf5.format(currentDate));

        SimpleDateFormat sdf6 = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Current time is : " + sdf6.format(currentDate));

        SimpleDateFormat sdf7 = new SimpleDateFormat("w");
        System.out.println("Current week of year is : " + sdf7.format(currentDate));

        SimpleDateFormat sdf8 = new SimpleDateFormat("W");
        System.out.println("Current week of month : " + sdf8.format(currentDate));

        SimpleDateFormat sdf9 = new SimpleDateFormat("D");
        System.out.println("Current day of the year is : " + sdf9.format(currentDate));
    }
}
```

### Commands & Output
```bash
javac DateFormatDemo.java
java DateFormatDemo
```

```text
Current date is : 17/08/2026
Current date is : 08-17-2026
Current date is : Monday August 17 2026
Current date and time is : Mon August 17 21:53:17 IST 2026
Current date and time is : 17/08/26 21:53:17 pm +0530
Current time is : 21:53:17
Current week of year is : 34
Current week of month : 4
Current day of the year is : 229
```

---

## Set B - Question (b)
**Define a class `MyNumber` having one private int data member. Write a default constructor to initialize it to 0 and another constructor to initialize it to a value (Use `this`). Write methods `isNegative`, `isPositive`, `isZero`, `isOdd`, `isEven`. Create an object in main. Use command line arguments to pass a value to the object (Hint: convert string argument to integer) and perform the above tests. Provide Javadoc comments for all constructors and methods and generate the HTML help file.**

### Source Code (`MyNumber.java`)
```java
/**
 * The MyNumber class represents an integer number and provides methods 
 * to test various mathematical properties.
 * 
 * @author Java Learner
 * @version 1.0
 */
public class MyNumber {

    private int number;

    /** Default constructor initializing data member to 0. */
    public MyNumber() {
        this.number = 0;
    }

    /**
     * Parameterized constructor initializing data member to specified value.
     * @param number the integer value to set
     */
    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isNegative() { return this.number < 0; }
    public boolean isPositive() { return this.number > 0; }
    public boolean isZero() { return this.number == 0; }
    public boolean isOdd() { return this.number % 2 != 0; }
    public boolean isEven() { return this.number % 2 == 0; }

    public static void main(String[] args) {
        int val = 0;
        if (args.length > 0) {
            val = Integer.parseInt(args[0]);
        }

        MyNumber numObj = new MyNumber(val);

        System.out.println("Value Tested   : " + val);
        System.out.println("isNegative()   : " + numObj.isNegative());
        System.out.println("isPositive()   : " + numObj.isPositive());
        System.out.println("isZero()       : " + numObj.isZero());
        System.out.println("isOdd()        : " + numObj.isOdd());
        System.out.println("isEven()       : " + numObj.isEven());
    }
}
```

### Commands & Output
```bash
javac MyNumber.java
java MyNumber 42
javadoc -d doc MyNumber.java
```

```text
Value Tested   : 42
isNegative()   : false
isPositive()   : true
isZero()       : false
isOdd()        : false
isEven()       : true
```

---

## Set B - Question (c)
**Write a menu driven program to perform the following operations on multidimensional array ie matrix:**  
i. Addition  
ii. Multiplication  
iii. Transpose of any matrix  
iv. Exit  

### Source Code (`MatrixOperations.java`)
```java
import java.util.Scanner;

public class MatrixOperations {

    public static int[][] readMatrix(Scanner sc, String name, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements for Matrix " + name + " (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Addition  2. Multiplication  3. Transpose  4. Exit");
            System.out.print("Enter choice (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter rows and columns: ");
                    int r = sc.nextInt();
                    int c = sc.nextInt();
                    int[][] a1 = readMatrix(sc, "A", r, c);
                    int[][] b1 = readMatrix(sc, "B", r, c);
                    int[][] sum = new int[r][c];
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            sum[i][j] = a1[i][j] + b1[i][j];
                        }
                    }
                    System.out.println("Result of Addition:");
                    displayMatrix(sum);
                    break;

                case 2:
                    System.out.print("Enter r1, c1: ");
                    int r1 = sc.nextInt();
                    int c1 = sc.nextInt();
                    System.out.print("Enter r2, c2: ");
                    int r2 = sc.nextInt();
                    int c2 = sc.nextInt();
                    if (c1 != r2) {
                        System.out.println("Multiplication not possible!");
                        break;
                    }
                    int[][] a2 = readMatrix(sc, "A", r1, c1);
                    int[][] b2 = readMatrix(sc, "B", r2, c2);
                    int[][] prod = new int[r1][c2];
                    for (int i = 0; i < r1; i++) {
                        for (int j = 0; j < c2; j++) {
                            for (int k = 0; k < c1; k++) {
                                prod[i][j] += a2[i][k] * b2[k][j];
                            }
                        }
                    }
                    System.out.println("Result of Multiplication:");
                    displayMatrix(prod);
                    break;

                case 3:
                    System.out.print("Enter rows and columns: ");
                    int rows = sc.nextInt();
                    int cols = sc.nextInt();
                    int[][] mat = readMatrix(sc, "A", rows, cols);
                    int[][] transpose = new int[cols][rows];
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            transpose[j][i] = mat[i][j];
                        }
                    }
                    System.out.println("Transpose Matrix:");
                    displayMatrix(transpose);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;
            }
        } while (choice != 4);
        sc.close();
    }
}
```

### Commands & Output
```bash
javac MatrixOperations.java
java MatrixOperations
```

```text
1. Addition  2. Multiplication  3. Transpose  4. Exit
Enter choice (1-4): 1
Enter rows and columns: 2 2
Enter elements for Matrix A (2x2):
2 2 3 6
Enter elements for Matrix B (2x2):
5 4 8 9

Result of Matrix Addition (A + B):
7	6	
11	15	

Enter choice (1-4): 4
Exiting...
```

---

## Set B - Question (d)
**Write a program to display the 1 to 15 tables.**

### Source Code (`MultiplicationTables1To15.java`)
```java
import java.util.Scanner;

public class MultiplicationTables1To15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tables (n): ");
        int n = sc.nextInt();

        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
```

### Commands & Output
```bash
javac MultiplicationTables1To15.java
java MultiplicationTables1To15
```

```text
Enter number of tables (n): 5
1*1=1	2*1=2	3*1=3	4*1=4	5*1=5	
1*2=2	2*2=4	3*2=6	4*2=8	5*2=10	
1*3=3	2*3=6	3*3=9	4*3=12	5*3=15	
1*4=4	2*4=8	3*4=12	4*4=16	5*4=20	
1*5=5	2*5=10	3*5=15	4*5=20	5*5=25	
1*6=6	2*6=12	3*6=18	4*6=24	5*6=30	
1*7=7	2*7=14	3*7=21	4*7=28	5*7=35	
1*8=8	2*8=16	3*8=24	4*8=32	5*8=40	
1*9=9	2*9=18	3*9=27	4*9=36	5*9=45	
1*10=10	2*10=20	3*10=30	4*10=40	5*10=50	
```

---

# SET C

## Set C - Question (a)
**What is the difference between implicit type conversion and explicit type conversion in Java? Demonstration with examples.**

### Explanation & Demonstration:
* **Implicit Conversion (Widening)**: Performed automatically by Java when converting smaller data types to larger data types (e.g., `int` to `double`). No data loss occurs.
* **Explicit Conversion (Narrowing / Casting)**: Performed manually using `(type)` when converting larger data types to smaller data types (e.g., `(int) 99.95`). Decimal digits or precision may be lost.

```java
// Example
int a = 100;
double b = a; // Implicit conversion (100.0)

double price = 99.95;
int roundedPrice = (int) price; // Explicit conversion (99)
```

---

## Set C - Question (b)
**Which data type should be used for storing a person's age, annual salary, and grade respectively? Justify your answer.**

### Explanation & Justification:
1. **Person's Age: `byte`**  
   *Justification:* Human age ranges between `0` and `120`. A `byte` stores values from `-128` to `127` using only **1 byte (8 bits)** of memory, making it highly memory-efficient.
2. **Annual Salary: `double`**  
   *Justification:* Salaries can be large numeric amounts and often include fractional decimals (e.g., `$75,500.50`). A `double` provides **64-bit precision** to prevent rounding errors.
3. **Grade: `char`**  
   *Justification:* Academic grades are single character letters such as `'A'`, `'B'`, `'C'`, `'D'`, or `'F'`. A `char` consumes **2 bytes (16 bits)** and stores single Unicode characters efficiently.

---

## Set C - Question (c)
**What modifications are required to handle invalid user choices in a menu-driven application?**

### Explanation:
1. **Add a `default` case in the `switch` statement:**  
   Catches invalid menu choices outside the valid numerical range (e.g., entering `9` when options are `1-4`).
2. **Use Input Validation (`hasNextInt()` or `try-catch`):**  
   Prevents application crashes (`InputMismatchException`) when users type non-numeric text (e.g., entering `"abc"`).

---

## Set C - Question (d)
**Compare the execution behavior of for, while, and do-while loops.**

### Comparison:
* **`for` loop**: Entry-controlled loop. Initialization, condition, and update are declared together in the loop header. Used when the number of iterations is known beforehand.
* **`while` loop**: Entry-controlled loop. Evaluates the condition *before* executing the loop body (executes 0 or more times).
* **`do-while` loop**: Exit-controlled loop. Evaluates the condition *after* executing the loop body (always executes **at least 1 time**). Ideal for menu-driven applications.

---

## Set C - Question (e)
**What modifications are required to find the second largest element in an array?**

### Explanation & Logic:
Maintain two variables `first = Integer.MIN_VALUE` and `second = Integer.MIN_VALUE`. Iterate through the array once ($O(n)$):

```java
for (int i = 0; i < arr.length; i++) {
    if (arr[i] > first) {
        second = first;   // Demote current largest to second largest
        first = arr[i];   // Update largest element
    } else if (arr[i] > second && arr[i] != first) {
        second = arr[i];  // Update second largest element
    }
}
```
