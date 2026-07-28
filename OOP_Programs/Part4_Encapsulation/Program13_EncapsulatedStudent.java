package Part4_Encapsulation;

class Student {
    private String name;
    private double marks;

    // Constructor using setter to ensure valid initialization
    public Student(String name, double marks) {
        this.name = name;
        setMarks(marks);
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Name
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Name cannot be empty!");
        }
    }

    // Getter for Marks
    public double getMarks() {
        return marks;
    }

    // Setter for Marks with Range Validation (0 - 100)
    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
            System.out.println("Marks successfully set to: " + marks);
        } else {
            System.out.println("Error: Invalid marks (" + marks + ")! Marks must be between 0 and 100.");
        }
    }

    // Display details
    public void displayStudent() {
        System.out.println("Student Name : " + name);
        System.out.println("Student Marks: " + marks);
        System.out.println("-----------------------------------");
    }
}

public class Program13_EncapsulatedStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Amit Kumar", 85.0);
        s1.displayStudent();

        System.out.println("--- Testing Valid Marks Update ---");
        s1.setMarks(92.5);
        s1.displayStudent();

        System.out.println("--- Testing Out-of-Bounds Marks Updates ---");
        s1.setMarks(105.0); // Exceeds upper limit
        s1.setMarks(-15.0); // Below lower limit

        System.out.println("\nFinal Marks preserved after invalid attempts: " + s1.getMarks());
    }
}
