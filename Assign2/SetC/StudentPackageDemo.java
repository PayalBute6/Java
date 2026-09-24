import student.StudentInfo;
import student.StudentPer;
import java.util.Scanner;

/*
 * Set C - c
 * Accept student details like rollno, name, class and marks of 6 subjects from the user. 
 */

public class StudentPackageDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Roll No: ");
        int rollno = sc.nextInt();
        sc.nextLine(); // consume newline
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Class: ");
        String className = sc.nextLine();
        
        int[] marks = new int[6];
        System.out.println("Enter marks for 6 subjects:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        
        StudentPer sp = new StudentPer();
        double percentage = sp.calculatePercentage(marks);
        
        StudentInfo si = new StudentInfo();
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        si.displayInfo(rollno, className, percentage);
        
        sc.close();
    }
}
