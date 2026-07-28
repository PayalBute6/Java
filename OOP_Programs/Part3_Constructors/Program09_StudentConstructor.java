package Part3_Constructors;

class Student {
    String name;
    int rollNo;

    // Parameterized Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Method to display student details
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number : " + rollNo);
        System.out.println("-------------------------");
    }
}

public class Program09_StudentConstructor {
    public static void main(String[] args) {
        // Initializing objects directly using constructor
        Student s1 = new Student("Rahul", 101);
        Student s2 = new Student("Sneha", 102);

        System.out.println("=== Student Records (Constructor Initialized) ===");
        s1.display();
        s2.display();
    }
}
