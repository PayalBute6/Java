// Topic 2.1: Defining your own classes
// Example showing how to define a class, instantiate objects, set data, and call methods.

class Student {
    // Instance variables (State)
    int rollNo;
    String name;
    double marks;

    // Method to initialize student data
    void setStudentData(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    // Method to display student details (Behavior)
    void displayStudentData() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
        System.out.println("-------------------------");
    }
}

public class P01_DefiningClasses {
    public static void main(String[] args) {
        System.out.println("=== 2.1 Defining Your Own Classes Demo ===\n");

        // 1. Creating first object of Student class
        Student s1 = new Student();
        s1.setStudentData(101, "Rahul Sharma", 88.5);

        // 2. Creating second object of Student class
        Student s2 = new Student();
        s2.setStudentData(102, "Priya Patel", 92.0);

        // Displaying details of both objects
        System.out.println("Details of Student 1:");
        s1.displayStudentData();

        System.out.println("Details of Student 2:");
        s2.displayStudentData();
    }
}
