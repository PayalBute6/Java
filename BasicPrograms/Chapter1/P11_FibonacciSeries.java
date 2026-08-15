/**
 * Topic: 1.7 Control Flow Statements - Loops (do-while / for)
 * 
 * Question 11:
 * Write a Java program to generate and display the Fibonacci series up to N terms
 * (0, 1, 1, 2, 3, 5, 8, 13, 21...).
 */

public class P11_FibonacciSeries {

    public static void main(String[] args) {
        int terms = 10;

        System.out.println("==========================================");
        System.out.println("         FIBONACCI SERIES GENERATOR       ");
        System.out.println("==========================================");
        System.out.println("Generating first " + terms + " terms:");

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print(firstTerm + ", " + secondTerm);

        for (int i = 3; i <= terms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println("\n==========================================");
    }
}
