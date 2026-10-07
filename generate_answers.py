import re

html_content = """<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Selected Practice Questions</title>
    <style>
        body { font-family: system-ui, -apple-system, sans-serif; line-height: 1.6; margin: 0 auto; max-width: 900px; padding: 2rem; color: #333; background-color: #fcfcfc; }
        h1 { border-bottom: 2px solid #eaeaea; padding-bottom: 0.5rem; color: #111; margin-top: 2rem; }
        h1:first-of-type { margin-top: 0; }
        .question-card { background: #fff; border: 1px solid #eaeaea; border-radius: 8px; padding: 1.5rem; margin-bottom: 1.5rem; box-shadow: 0 1px 3px rgba(0,0,0,0.05); }
        .slip-title { font-weight: 600; color: #2563eb; margin-bottom: 0.5rem; font-size: 1.1rem; }
        p { margin: 0; font-weight: 500; }
        pre { background-color: #2d2d2d; color: #cccccc; padding: 15px; border-radius: 8px; overflow-x: auto; font-family: 'Consolas', monospace; margin-top: 15px; }
        code { font-family: 'Consolas', monospace; }
        .nested-list { margin-top: 0.5rem; margin-bottom: 0.5rem; }
        .task-footer { margin-top: 0.5rem; font-style: italic; color: #555; }
    </style>
</head>
<body>

    <h1>Java Programs</h1>
    
    <div class="question-card">
        <div class="slip-title">Question 1</div>
        <p>Write a Java program to print the sum of elements of the array. Also display array elements in ascending order.</p>
<pre><code>import java.util.Arrays;

public class ArraySumSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        int sum = 0;
        
        for (int num : arr) {
            sum += num;
        }
        
        Arrays.sort(arr);
        
        System.out.println("Sum of elements: " + sum);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}</code></pre>
    </div>
    
    <div class="question-card">
        <div class="slip-title">Question 2</div>
        <p>Write a Java Program to Display Armstrong Numbers Between range. Accept range from user.</p>
<pre><code>import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start and end range: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        System.out.println("Armstrong numbers:");
        for (int i = start; i <= end; i++) {
            int num = i, sum = 0;
            int digits = String.valueOf(i).length();
            
            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, digits);
                num /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}</code></pre>
    </div>
    
    <div class="question-card">
        <div class="slip-title">Question 3</div>
        <p>Write a package for String operation which has two classes Con and Comp. Con class has to concatenate two strings and comp class compares two strings. Also display proper messages on execution.</p>
<pre><code>// File: strpack/Con.java
package strpack;
public class Con {
    public void concat(String s1, String s2) {
        System.out.println("Concatenated String: " + (s1 + s2));
    }
}

// File: strpack/Comp.java
package strpack;
public class Comp {
    public void compare(String s1, String s2) {
        if (s1.equals(s2)) System.out.println("Strings are identical.");
        else System.out.println("Strings are different.");
    }
}

// File: Main.java
import strpack.Con;
import strpack.Comp;

public class Main {
    public static void main(String[] args) {
        Con c1 = new Con();
        c1.concat("Hello ", "World");
        
        Comp c2 = new Comp();
        c2.compare("Java", "Java");
    }
}</code></pre>
    </div>
    
    <div class="question-card">
        <div class="slip-title">Question 4</div>
        <p>Write a menu driven program to perform the following operations on multidimensional array ie matrix:</p>
        <ol class="nested-list" type="i">
            <li>Addition</li>
            <li>Multiplication</li>
            <li>Transpose of any matrix</li>
            <li>Exit</li>
        </ol>
<pre><code>import java.util.Scanner;

public class MatrixMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        
        System.out.println("1.Add 2.Multiply 3.Transpose 4.Exit");
        int ch = sc.nextInt();
        
        switch (ch) {
            case 1:
                for(int i=0; i<2; i++) {
                    for(int j=0; j<2; j++) System.out.print((a[i][j] + b[i][j]) + " ");
                    System.out.println();
                }
                break;
            case 2:
                for(int i=0; i<2; i++) {
                    for(int j=0; j<2; j++) {
                        int sum = 0;
                        for(int k=0; k<2; k++) sum += a[i][k] * b[k][j];
                        System.out.print(sum + " ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for(int i=0; i<2; i++) {
                    for(int j=0; j<2; j++) System.out.print(a[j][i] + " ");
                    System.out.println();
                }
                break;
            case 4:
                System.exit(0);
        }
    }
}</code></pre>
    </div>
    
    <div class="question-card">
        <div class="slip-title">Question 5</div>
        <p>Write a program to define a class Account having members custname, accno. Define default and parameterized constructor. Create a subclass called SavingAccount with members savingbal, minbal. Create a derived class AccountDetail that extends the class SavingAccount with members, depositamt and withdrawalamt. Write a appropriate method to display customer details.</p>
<pre><code>class Account {
    String custname;
    int accno;
    Account() {}
    Account(String c, int a) { custname = c; accno = a; }
}

class SavingAccount extends Account {
    double savingbal, minbal;
    SavingAccount(String c, int a, double s, double m) {
        super(c, a);
        savingbal = s;
        minbal = m;
    }
}

class AccountDetail extends SavingAccount {
    double depositamt, withdrawalamt;
    
    AccountDetail(String c, int a, double s, double m, double d, double w) {
        super(c, a, s, m);
        depositamt = d;
        withdrawalamt = w;
    }
    
    void display() {
        System.out.println("Customer: " + custname);
        System.out.println("A/C No: " + accno);
        System.out.println("Current Balance: " + (savingbal + depositamt - withdrawalamt));
    }
}

public class Main {
    public static void main(String[] args) {
        AccountDetail acc = new AccountDetail("John", 101, 5000, 1000, 2000, 500);
        acc.display();
    }
}</code></pre>
    </div>
    
    <div class="question-card">
        <div class="slip-title">Question 6</div>
        <p>Write a class Driver with attributes license_no, name, address and age. Initialize values through the parameterized constructor. If age of Driver is less than 18 then user-defined exception should be generated &mdash;Age is below 18 years&mdash;</p>
<pre><code>class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

class Driver {
    int license_no, age;
    String name, address;
    
    Driver(int l, String n, String addr, int a) throws AgeException {
        if (a < 18) {
            throw new AgeException("Age is below 18 years");
        }
        license_no = l;
        name = n;
        address = addr;
        age = a;
        System.out.println("Driver " + name + " created successfully.");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Driver d1 = new Driver(123, "Raju", "Pune", 16);
        } catch (AgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}</code></pre>
    </div>
    
    <div class="question-card">
        <div class="slip-title">Question 7</div>
        <p>Write a program to create an abstract class named Shape that contains two integers and an empty method named <code>printArea()</code>. Provide three classes named Rectangle, Triangle and Circle such that each one of the classes extends the class Shape. Each one of the classes contain only the method <code>printArea()</code> that prints the area of the given shape. (use method overriding).</p>
<pre><code>abstract class Shape {
    int d1, d2;
    Shape(int a, int b) { d1 = a; d2 = b; }
    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int l, int w) { super(l, w); }
    void printArea() { System.out.println("Rectangle Area: " + (d1 * d2)); }
}

class Triangle extends Shape {
    Triangle(int b, int h) { super(b, h); }
    void printArea() { System.out.println("Triangle Area: " + (0.5 * d1 * d2)); }
}

class Circle extends Shape {
    Circle(int r) { super(r, r); }
    void printArea() { System.out.println("Circle Area: " + (3.14 * d1 * d1)); }
}

public class Main {
    public static void main(String[] args) {
        new Rectangle(10, 5).printArea();
        new Triangle(10, 5).printArea();
        new Circle(5).printArea();
    }
}</code></pre>
    </div>
    
    <div class="question-card">
        <div class="slip-title">Question 8</div>
        <p>Write a program which define class Employee with data member as id, name and salary Store the information of 'n' employees and display the name of employee having maximum salary (Use array of object)</p>
<pre><code>class Employee {
    int id;
    String name;
    double salary;
    
    Employee(int i, String n, double s) {
        id = i; name = n; salary = s;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] emps = {
            new Employee(1, "Alice", 45000),
            new Employee(2, "Bob", 65000),
            new Employee(3, "Charlie", 55000)
        };
        
        Employee maxEmp = emps[0];
        for (Employee e : emps) {
            if (e.salary > maxEmp.salary) {
                maxEmp = e;
            }
        }
        
        System.out.println("Employee with max salary: " + maxEmp.name);
    }
}</code></pre>
    </div>
    
    <div class="question-card">
        <div class="slip-title">Question 9</div>
        <p>Define a "Clock" class that does the following;</p>
        <ol type="a" class="nested-list">
            <li>Accept Hours, Minutes and Seconds</li>
            <li>Check the validity of numbers</li>
            <li>Set the time to AM/PM mode</li>
        </ol>
<pre><code>class Clock {
    int hh, mm, ss;
    
    Clock(int h, int m, int s) { hh = h; mm = m; ss = s; }
    
    boolean isValid() {
        return (hh >= 0 && hh < 24 && mm >= 0 && mm < 60 && ss >= 0 && ss < 60);
    }
    
    void displayAMPM() {
        if (!isValid()) {
            System.out.println("Invalid Time");
            return;
        }
        String mode = (hh >= 12) ? "PM" : "AM";
        int displayH = (hh > 12) ? hh - 12 : (hh == 0 ? 12 : hh);
        System.out.println(displayH + ":" + mm + ":" + ss + " " + mode);
    }
}

public class Main {
    public static void main(String[] args) {
        Clock c = new Clock(14, 30, 45);
        c.displayAMPM();
    }
}</code></pre>
    </div>

    <div class="question-card">
        <div class="slip-title">Question 10</div>
        <p>Write a program to accept a text file from user and display the contents of a file in reverse order and change its case.</p>
<pre><code>import java.io.File;
import java.util.Scanner;

public class FileReverseCase {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String path = sc.nextLine();
        
        Scanner fileSc = new Scanner(new File(path));
        StringBuilder text = new StringBuilder();
        while (fileSc.hasNextLine()) {
            text.append(fileSc.nextLine()).append("\\n");
        }
        
        text.reverse();
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isUpperCase(c)) {
                System.out.print(Character.toLowerCase(c));
            } else {
                System.out.print(Character.toUpperCase(c));
            }
        }
    }
}</code></pre>
    </div>
    
    <div class="question-card">
        <div class="slip-title">Question 11</div>
        <p>Write a program to read the contents of &ldquo;abc.txt&rdquo; file. Display the contents of file in uppercase as output.</p>
<pre><code>import java.io.File;
import java.util.Scanner;

public class ReadUpperCase {
    public static void main(String[] args) throws Exception {
        Scanner fileSc = new Scanner(new File("abc.txt"));
        while (fileSc.hasNextLine()) {
            System.out.println(fileSc.nextLine().toUpperCase());
        }
    }
}</code></pre>
    </div>

    <h1>HTML Programs</h1>
    
    <div class="question-card">
        <div class="slip-title">Question 1 & 2</div>
        <p>Design a College/School/Student Registration Form using HTML5 and CSS3 and apply appropriate HTML5 validation attributes.</p>
<pre><code>&lt;!DOCTYPE html&gt;
&lt;html&gt;
&lt;head&gt;
    &lt;style&gt;
        form { max-width: 400px; margin: auto; padding: 20px; border: 1px solid #ccc; border-radius: 5px; }
        input { width: 100%; padding: 8px; margin: 10px 0; box-sizing: border-box; }
        button { background: blue; color: white; padding: 10px; border: none; width: 100%; cursor: pointer; }
    &lt;/style&gt;
&lt;/head&gt;
&lt;body&gt;
    &lt;form&gt;
        &lt;h3&gt;Registration Form&lt;/h3&gt;
        &lt;label&gt;Name:&lt;/label&gt;
        &lt;input type="text" required pattern="[A-Za-z ]+" title="Letters only"&gt;
        
        &lt;label&gt;Email:&lt;/label&gt;
        &lt;input type="email" required&gt;
        
        &lt;label&gt;Age:&lt;/label&gt;
        &lt;input type="number" min="16" max="30" required&gt;
        
        &lt;button type="submit"&gt;Register&lt;/button&gt;
    &lt;/form&gt;
&lt;/body&gt;
&lt;/html&gt;</code></pre>
    </div>
    
    <div class="question-card">
        <div class="slip-title">Question 3</div>
        <p>Create a responsive webpage using CSS Flexbox for a college homepage containing header, navigation, content and footer.</p>
<pre><code>&lt;!DOCTYPE html&gt;
&lt;html&gt;
&lt;head&gt;
    &lt;style&gt;
        body { display: flex; flex-direction: column; min-height: 100vh; margin: 0; }
        header, footer { background: #333; color: white; padding: 20px; text-align: center; }
        nav { background: #555; padding: 10px; display: flex; gap: 15px; justify-content: center; }
        nav a { color: white; text-decoration: none; }
        main { flex: 1; padding: 20px; display: flex; justify-content: center; align-items: center; }
    &lt;/style&gt;
&lt;/head&gt;
&lt;body&gt;
    &lt;header&gt;College Homepage&lt;/header&gt;
    &lt;nav&gt;&lt;a href="#"&gt;Home&lt;/a&gt; &lt;a href="#"&gt;About&lt;/a&gt; &lt;a href="#"&gt;Contact&lt;/a&gt;&lt;/nav&gt;
    &lt;main&gt;&lt;h2&gt;Welcome to Our College&lt;/h2&gt;&lt;/main&gt;
    &lt;footer&gt;&copy; 2026 College. All rights reserved.&lt;/footer&gt;
&lt;/body&gt;
&lt;/html&gt;</code></pre>
    </div>
    
    <div class="question-card">
        <div class="slip-title">Question 4</div>
        <p>Create a webpage containing a button and link. Change their appearance when the mouse pointer moves over them. (Use :hover Pseudo-Class)</p>
<pre><code>&lt;!DOCTYPE html&gt;
&lt;html&gt;
&lt;head&gt;
    &lt;style&gt;
        a { text-decoration: none; color: blue; font-size: 20px; }
        a:hover { color: red; text-decoration: underline; }
        
        button { padding: 10px 20px; background: gray; color: white; border: none; cursor: pointer; }
        button:hover { background: black; transform: scale(1.1); }
    &lt;/style&gt;
&lt;/head&gt;
&lt;body&gt;
    &lt;a href="#"&gt;Hover over this link&lt;/a&gt;&lt;br&gt;&lt;br&gt;
    &lt;button&gt;Hover Me&lt;/button&gt;
&lt;/body&gt;
&lt;/html&gt;</code></pre>
    </div>
    
    <div class="question-card">
        <div class="slip-title">Question 5</div>
        <p>Create an unordered list of Programming Language names and apply different styles to the first and last list items.(Use :first-child and :last-child)</p>
<pre><code>&lt;!DOCTYPE html&gt;
&lt;html&gt;
&lt;head&gt;
    &lt;style&gt;
        li { font-size: 20px; }
        li:first-child { color: green; font-weight: bold; }
        li:last-child { color: red; font-style: italic; }
    &lt;/style&gt;
&lt;/head&gt;
&lt;body&gt;
    &lt;ul&gt;
        &lt;li&gt;Java&lt;/li&gt;
        &lt;li&gt;Python&lt;/li&gt;
        &lt;li&gt;JavaScript&lt;/li&gt;
        &lt;li&gt;C++&lt;/li&gt;
    &lt;/ul&gt;
&lt;/body&gt;
&lt;/html&gt;</code></pre>
    </div>
    
    <div class="question-card">
        <div class="slip-title">Question 6</div>
        <p>Create a webpage containing a heading and a button. When the button is clicked, change the heading text from &ldquo;Hello! Welcome&rdquo; to &ldquo;Text Changed Successfully!&rdquo;.</p>
<pre><code>&lt;!DOCTYPE html&gt;
&lt;html&gt;
&lt;body&gt;
    &lt;h1 id="heading"&gt;Hello! Welcome&lt;/h1&gt;
    &lt;button onclick="document.getElementById('heading').innerText = 'Text Changed Successfully!'"&gt;Click Me&lt;/button&gt;
&lt;/body&gt;
&lt;/html&gt;</code></pre>
    </div>
    
    <div class="question-card">
        <div class="slip-title">Question 7</div>
        <p>Create a webpage using JavaScript DOM manipulation and event handling with an image and a button. When the button is clicked, replace the displayed image with another image.</p>
<pre><code>&lt;!DOCTYPE html&gt;
&lt;html&gt;
&lt;body&gt;
    &lt;img id="myImg" src="image1.jpg" width="200" height="200"&gt;&lt;br&gt;
    &lt;button onclick="document.getElementById('myImg').src = 'image2.jpg'"&gt;Change Image&lt;/button&gt;
&lt;/body&gt;
&lt;/html&gt;</code></pre>
    </div>

    <h1>Node JS Programs</h1>
    
    <div class="question-card">
        <div class="slip-title">Question 1</div>
        <p>Write a JavaScript program to demonstrate Arrow Functions for addition, subtraction, multiplication and division.</p>
<pre><code>const add = (a, b) =&gt; a + b;
const sub = (a, b) =&gt; a - b;
const mul = (a, b) =&gt; a * b;
const div = (a, b) =&gt; a / b;

console.log("Add: " + add(10, 5));
console.log("Sub: " + sub(10, 5));
console.log("Mul: " + mul(10, 5));
console.log("Div: " + div(10, 5));</code></pre>
    </div>
    
    <div class="question-card">
        <div class="slip-title">Question 2</div>
        <p>Write a JavaScript program to swap two numbers without using a third variable using array destructuring</p>
<pre><code>let a = 10;
let b = 20;

console.log(`Before Swap: a = ${a}, b = ${b}`);

// Swap using array destructuring
[a, b] = [b, a];

console.log(`After Swap: a = ${a}, b = ${b}`);</code></pre>
    </div>
    
    <div class="question-card">
        <div class="slip-title">Question 3 </div>
        <p>Write a JavaScript program to store student information and marks in variables and generate a formatted student report using template literals</p>
<pre><code>const name = "Alice";
const rollNo = 101;
const math = 85;
const science = 92;
const english = 88;

const total = math + science + english;
const avg = total / 3;

const report = `
----- Student Report -----
Name   : ${name}
Roll No: ${rollNo}
--------------------------
Math   : ${math}
Science: ${science}
English: ${english}
--------------------------
Total  : ${total}
Average: ${avg.toFixed(2)}
`;

console.log(report);</code></pre>
    </div>

</body>
</html>
"""

with open("f:\\1.Java Practice\\Java\\selected_slips.html", "w", encoding="utf-8") as f:
    f.write(html_content)

print("HTML generated successfully!")
