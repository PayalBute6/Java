import SY.SYMarks;
import TY.TYMarks;
import java.util.Scanner;

/*
 * Set B - a
 * Create n objects of Student class (having rollNumber, name, SYMarks and TYMarks). 
 * Add the marks of SY and TY computer subjects and calculate the Grade(‘A’ for >= 70, ‘B’ 
 * for >= 60, ‘C’for >= 50 , Pass Class for > =40 else “FAIL”) and display the result of the student in proper format.
 */

class Student {
    private int rollNumber;
    private String name;
    private SYMarks syMarks;
    private TYMarks tyMarks;

    public Student(int rollNumber, String name, SYMarks syMarks, TYMarks tyMarks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.syMarks = syMarks;
        this.tyMarks = tyMarks;
    }

    public void displayResult() {
        int totalComputerMarks = syMarks.ComputerTotal + tyMarks.Theory + tyMarks.Practicals; 
        
        double percentage = (double) totalComputerMarks / 3; 
        String grade = "";
        
        if (percentage >= 70) {
            grade = "A";
        } else if (percentage >= 60) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else if (percentage >= 40) {
            grade = "Pass Class";
        } else {
            grade = "FAIL";
        }

        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Computer Total: " + totalComputerMarks);
        System.out.println("Grade: " + grade);
        System.out.println("-------------------------");
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        Student[] students = new Student[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int roll = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.println("Enter SY Marks (Computer, Maths, Electronics):");
            SYMarks sy = new SYMarks(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            
            System.out.println("Enter TY Marks (Theory, Practicals):");
            TYMarks ty = new TYMarks(scanner.nextInt(), scanner.nextInt());
            scanner.nextLine();
            
            students[i] = new Student(roll, name, sy, ty);
        }
        
        System.out.println("\n--- Student Results ---");
        for (Student s : students) {
            s.displayResult();
        }
        
        scanner.close();
    }
}
