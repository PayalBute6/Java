// Topic 2.5: Use of 'this' keyword and Static Members
// Demonstrates 'this' keyword, static fields, static methods, and static block.

class CounterDemo {
    // Instance variable (unique for each object)
    int id;
    String name;

    // Static variable (shared among all objects of this class)
    static int objectCount = 0;
    static String organization;

    // Static block - runs ONCE when the class is loaded into JVM memory
    static {
        organization = "Java Training Academy";
        System.out.println("[Static Block] Class loaded. Organization initialized to: " + organization);
        System.out.println("--------------------------------------------------");
    }

    // Constructor using 'this' keyword for variable shadowing and constructor chaining
    CounterDemo() {
        // Constructor Chaining: Calls parameterized constructor using this(...)
        this(0, "Unnamed");
    }

    CounterDemo(int id, String name) {
        // 'this' refers to current object instance to distinguish instance fields from parameters
        this.id = id;
        this.name = name;

        // Increment shared static counter
        objectCount++;
    }

    // Static method - called using ClassName.methodName() without creating an object
    static void displayTotalObjects() {
        System.out.println("Total Objects Created So Far: " + objectCount);
    }

    // Instance method
    void displayInfo() {
        System.out.println("ID: " + this.id + " | Name: " + this.name + " | Org: " + organization);
    }
}

public class P05_ThisAndStatic {
    public static void main(String[] args) {
        System.out.println("=== 2.5 'this' Keyword & Static Members Demo ===\n");

        // Display initial static count using static method
        CounterDemo.displayTotalObjects();

        System.out.println("\nCreating objects...");
        CounterDemo c1 = new CounterDemo(101, "Alice");
        CounterDemo c2 = new CounterDemo(102, "Bob");
        CounterDemo c3 = new CounterDemo(); // Uses default constructor & chaining

        System.out.println("\nObject Details:");
        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();

        System.out.println();
        // Accessing shared static method via Class Name
        CounterDemo.displayTotalObjects();
    }
}
