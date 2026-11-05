// Define a class named Student which acts as a blueprint for student objects
class Student {

    // Instance variable (attribute) to store the student's name
    String name;
    // Instance variable (attribute) to store the student's roll number
    int rollNo;
    // Instance variable (attribute) to store the student's marks
    int marks;

    // Method defining a behavior: what a Student object can do
    void study() {
        // Prints a message to the console indicating that the student is studying
        System.out.println("Student is studying");
    }
}

// Public class Main containing the main entry point of the application
public class Main {
    // Main method where the execution of the Java program begins
    public static void main(String[] args) {
        // Create (instantiate) a new Student object in memory using the 'new' keyword
        Student s1 = new Student();
        // Assign attributes to object s1
        s1.name = "Rahul";
        s1.rollNo = 101;
        s1.marks = 90;

        // Create a second Student object to demonstrate multiple instances
        Student s2 = new Student();
        // Assign attributes to object s2
        s2.name = "Rashi";
        s2.rollNo = 102;
        s2.marks = 95;

        // Output details of s1
        System.out.println("--- Student 1 Details ---");
        System.out.println("Name   : " + s1.name);
        System.out.println("Roll No: " + s1.rollNo);
        System.out.println("Marks  : " + s1.marks);
        s1.study();

        // Output details of s2
        System.out.println("\n--- Student 2 Details ---");
        System.out.println("Name   : " + s2.name);
        System.out.println("Roll No: " + s2.rollNo);
        System.out.println("Marks  : " + s2.marks);
        s2.study();
    }
}
