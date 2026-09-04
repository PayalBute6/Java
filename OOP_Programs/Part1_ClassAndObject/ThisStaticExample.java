package OOP_Programs.Part1_ClassAndObject;

/**
 * Chapter 2.5 - this Keyword, Static Fields, Static Methods and Static Blocks
 * Demonstrates:
 * 1. this keyword for resolving parameter shadowing and constructor chaining this()
 * 2. Static field (shared memory)
 * 3. Static method (class-level invocation)
 * 4. Static block (executes when class is loaded into JVM)
 */
class StudentStatic {
    int roll;
    String name;
    static String college = "ABC College";

    // Static Block - Executes once when class is loaded
    static {
        System.out.println("[STATIC BLOCK] StudentStatic class loaded into memory.");
    }

    // Default Constructor using constructor chaining this()
    public StudentStatic() {
        this(0, "Unknown"); // Calls StudentStatic(int, String)
    }

    // Parameterized Constructor using 'this' keyword
    public StudentStatic(int roll, String name) {
        this.roll = roll; // this.roll = instance var, roll = parameter
        this.name = name; // this.name = instance var, name = parameter
    }

    // Static Method - Belongs to class
    public static void changeCollege(String newCollege) {
        college = newCollege;
    }

    public void display() {
        System.out.println("Roll: " + roll + ", Name: " + name + ", College: " + college);
    }
}

public class ThisStaticExample {
    public static void main(String[] args) {
        System.out.println("=== Chapter 2.5: this & Static Members Demo ===");

        // Call static method using Class Name
        StudentStatic.changeCollege("XYZ College");

        // Create objects
        StudentStatic s1 = new StudentStatic(101, "Prashant");
        StudentStatic s2 = new StudentStatic(102, "Rahul");
        StudentStatic s3 = new StudentStatic(); // Uses constructor chaining this()

        System.out.print("s1: ");
        s1.display();

        System.out.print("s2: ");
        s2.display();

        System.out.print("s3: ");
        s3.display();
    }
}
