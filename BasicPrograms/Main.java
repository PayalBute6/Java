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
        // Assign the value "Rahul" to the 'name' variable of object s1
        s1.name = "Rahul";
        s1.name = "Rashi";
        // Assign the integer value 101 to the 'rollNo' variable of object s1
        s1.rollNo = 101;
        // Assign the integer value 90 to the 'marks' variable of object s1
        s1.marks = 90;

        // Output the value of s1.name ("Rahul") to the terminal
        System.out.println(s1.name);
        // Output the value of s1.rollNo (101) to the terminal
        System.out.println(s1.rollNo);
        // Output the value of s1.marks (90) to the terminal
        System.out.println(s1.marks);

        // Invoke the study() method on object s1 to execute its body
        s1.study();
    }
}