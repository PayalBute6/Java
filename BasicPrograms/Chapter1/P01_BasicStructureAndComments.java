/**
 * Topic: 1.4 Structure of Java Program & 1.6.1 Comments
 * 
 * Question 1:
 * Write a Java program to display personal/student details (Name, Roll No, Course, Department)
 * demonstrating all three types of comments in Java:
 * 1. Single-line comments (//)
 * 2. Multi-line comments (/* ... * /)
 * 3. Documentation comments (/** ... * /)
 */

/**
 * The P01_BasicStructureAndComments class demonstrates the fundamental structure of a Java program.
 * Every standard Java application requires a main method inside a class.
 */
public class P01_BasicStructureAndComments {

    /**
     * Main method - The entry point of any standalone Java application.
     * @param args Command line arguments passed to the program
     */
    public static void main(String[] args) {
        // Single-line comment: Printing header information
        System.out.println("==========================================");
        System.out.println("        STUDENT INFORMATION SYSTEM        ");
        System.out.println("==========================================");

        /*
         * Multi-line comment:
         * Below section outputs student details line by line
         * using System.out.println() method.
         */
        System.out.println("Name       : John Doe");
        System.out.println("Roll No    : 101");
        System.out.println("Course     : Computer Science & Engineering");
        System.out.println("Department : Technology");
        System.out.println("==========================================");
    }
}
