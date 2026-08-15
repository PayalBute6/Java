/**
 * Topic: 1.7 Control Flow Statements - For Loop
 * 
 * Question 8:
 * Write a Java program to:
 * 1. Calculate the factorial of a given number N using a for loop.
 * 2. Generate and display the multiplication table for a given number.
 */

public class P08FactorialAndTable {

    public static void main(String[] args) {
        int n = 5;

        System.out.println("==========================================");
        System.out.println("      FACTORIAL & MULTIPLICATION TABLE    ");
        System.out.println("==========================================");

        // 1. Calculate Factorial (5! = 5 * 4 * 3 * 2 * 1 = 120)
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("1. Factorial of " + n + " (" + n + "!) = " + factorial);

        // 2. Multiplication Table
        System.out.println("\n2. Multiplication Table for " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println("   " + n + " x " + i + " = " + (n * i));
        }
        System.out.println("==========================================");
    }
}
