/**
 * Topic: 1.7 Control Flow Statements - Nested Loops
 * 
 * Question 12:
 * Write a Java program to print the following patterns using nested loops:
 * Pattern A: Star Triangle
 * *
 * * *
 * * * *
 * * * * *
 * 
 * Pattern B: Number Pyramid
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 */

public class P12NestedLoopPatterns {

    public static void main(String[] args) {
        int rows = 5;

        System.out.println("==========================================");
        System.out.println("       NESTED LOOP PATTERN PRINTING       ");
        System.out.println("==========================================");

        // Pattern A: Right-angled Star Triangle
        System.out.println("Pattern A: Star Triangle");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern B: Number Triangle
        System.out.println("\nPattern B: Number Triangle");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("==========================================");
    }
}
