package student;

/*
 * Set C - c
 * Write a program to create a package name student. Define class StudentInfo with a method to display 
 * information about students such as rollno, class, and percentage. 
 */

public class StudentInfo {
    public void displayInfo(int rollno, String className, double percentage) {
        System.out.println("Roll No: " + rollno);
        System.out.println("Class: " + className);
        System.out.println("Percentage: " + percentage + "%");
    }
}
