package Part1_ClassAndObject;

class Student {
    String name;
    int rollNo;
}

public class Program01_StudentClass {
    public static void main(String[] args) {
        // Creating an object of Student class
        Student s1 = new Student();

        // Assigning values to instance variables
        s1.name = "Rahul";
        s1.rollNo = 101;

        // Displaying the attributes
        System.out.println("Student Name: " + s1.name);
        System.out.println("Roll Number: " + s1.rollNo);
    }
}
