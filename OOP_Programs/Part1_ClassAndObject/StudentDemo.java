package OOP_Programs.Part1_ClassAndObject;

/**
 * Chapter 2.1 - Defining Your Own Classes & Objects
 * Demonstrates Class structure, Data Fields, Behavior Methods, 
 * Parameterless & Parameterized Constructors, and Object Creation.
 */
class Student {
    // Instance variables / fields
    private int rollNo;
    private String name;

    // Parameterless Constructor
    public Student() {
        this.rollNo = 0;
        this.name = "Unknown";
    }

    // Parameterized Constructor
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Method to display student details
    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }

    // Getter and Setter methods
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        System.out.println("=== Chapter 2.1: Student Class & Object Creation Demo ===");

        // Option A: Two-step declaration and instantiation
        Student s1;
        s1 = new Student();
        System.out.print("s1 (Default): ");
        s1.display();

        // Assigning values via setter methods
        s1.setRollNo(101);
        s1.setName("Rahul");
        System.out.print("s1 (Modified): ");
        s1.display();

        // Option B: One-step declaration and instantiation using Parameterized Constructor
        Student s2 = new Student(102, "Prashant");
        System.out.print("s2 (Parameterized): ");
        s2.display();
    }
}
