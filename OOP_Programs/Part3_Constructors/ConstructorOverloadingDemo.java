package OOP_Programs.Part3_Constructors;

/**
 * Chapter 2.4 - Constructors and Constructor Overloading
 * Demonstrates parameterless constructor, parameterized constructor,
 * and constructor overloading with different parameter lists.
 */
class OverloadStudent {
    private int roll;
    private String name;
    private int marks;

    // Constructor 1: Parameterless
    public OverloadStudent() {
        this.roll = 0;
        this.name = "Unknown";
        this.marks = 0;
    }

    // Constructor 2: Single-parameter (int)
    public OverloadStudent(int roll) {
        this.roll = roll;
        this.name = "Unknown";
        this.marks = 0;
    }

    // Constructor 3: Two-parameters (int, String)
    public OverloadStudent(int roll, String name) {
        this.roll = roll;
        this.name = name;
        this.marks = 0;
    }

    // Constructor 4: Three-parameters (int, String, int)
    public OverloadStudent(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Roll: " + roll + ", Name: " + name + ", Marks: " + marks);
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        System.out.println("=== Chapter 2.4: Constructor Overloading Demo ===");

        OverloadStudent s1 = new OverloadStudent();
        OverloadStudent s2 = new OverloadStudent(101);
        OverloadStudent s3 = new OverloadStudent(102, "Rahul");
        OverloadStudent s4 = new OverloadStudent(103, "Priya", 95);

        System.out.print("s1 (No Args): ");
        s1.display();

        System.out.print("s2 (1 Arg):   ");
        s2.display();

        System.out.print("s3 (2 Args):  ");
        s3.display();

        System.out.print("s4 (3 Args):  ");
        s4.display();
    }
}
