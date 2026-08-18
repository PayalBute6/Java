// Program to demonstrate Constructors in Java:
// 1. Default / No-Argument Constructor
// 2. Parameterized Constructor
// 3. Constructor Overloading
// 4. Copy Constructor

class StudentRecord {
    private int id;
    private String name;
    private double gpa;

    // 1. Default / No-Argument Constructor
    public StudentRecord() {
        System.out.println("[Default / No-Arg Constructor called]");
        this.id = 0;
        this.name = "Not Assigned";
        this.gpa = 0.0;
    }

    // 2. Parameterized Constructor (2 parameters)
    public StudentRecord(int id, String name) {
        System.out.println("[Parameterized Constructor (2 args) called]");
        this.id = id;
        this.name = name;
        this.gpa = 0.0; // Default value
    }

    // 3. Parameterized Constructor (3 parameters - Constructor Overloading)
    public StudentRecord(int id, String name, double gpa) {
        System.out.println("[Parameterized Constructor (3 args) called]");
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // 4. Copy Constructor (Copies fields from another object)
    public StudentRecord(StudentRecord existingStudent) {
        System.out.println("[Copy Constructor called]");
        this.id = existingStudent.id;
        this.name = existingStudent.name;
        this.gpa = existingStudent.gpa;
    }

    // Display student details
    public void displayDetails() {
        System.out.println("   -> ID: " + id + ", Name: " + name + ", GPA: " + gpa);
    }
}

public class ConstructorTypesDemo {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("         DEMONSTRATION OF JAVA CONSTRUCTORS      ");
        System.out.println("=================================================\n");

        // 1. No-Argument Constructor
        System.out.println("1. Instantiating using No-Arg Constructor:");
        StudentRecord s1 = new StudentRecord();
        s1.displayDetails();

        // 2. Parameterized Constructor (2 arguments)
        System.out.println("\n2. Instantiating using Parameterized Constructor (2 args):");
        StudentRecord s2 = new StudentRecord(101, "Rahul");
        s2.displayDetails();

        // 3. Parameterized Constructor (3 arguments - Constructor Overloading)
        System.out.println("\n3. Instantiating using Parameterized Constructor (3 args):");
        StudentRecord s3 = new StudentRecord(102, "Sneha", 3.85);
        s3.displayDetails();

        // 4. Copy Constructor
        System.out.println("\n4. Instantiating using Copy Constructor (copying s3):");
        StudentRecord s4 = new StudentRecord(s3);
        s4.displayDetails();

        System.out.println("\n=================================================");
        System.out.println("CONSTRUCTOR RULES SUMMARY:");
        System.out.println("1. Same name as the class.");
        System.out.println("2. No return type (not even void).");
        System.out.println("3. Invoked automatically when object is created with 'new'.");
        System.out.println("=================================================");
    }
}
