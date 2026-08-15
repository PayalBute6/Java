/**
 * Topic: 1.7 Control Flow Statements - Nested if-else & Ternary Operator
 * 
 * Question 6:
 * Write a Java program to find the largest among three numbers using:
 * 1. Nested if-else statements.
 * 2. Ternary Operator (? :).
 */

public class P06LargestOfThreeNumbers {

    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 89;
        int num3 = 67;

        System.out.println("==========================================");
        System.out.println("     LARGEST OF THREE NUMBERS DEMO        ");
        System.out.println("==========================================");
        System.out.println("Numbers: num1 = " + num1 + ", num2 = " + num2 + ", num3 = " + num3);

        // Method 1: Using Nested if-else
        int largestIf;
        if (num1 >= num2) {
            if (num1 >= num3) {
                largestIf = num1;
            } else {
                largestIf = num3;
            }
        } else {
            if (num2 >= num3) {
                largestIf = num2;
            } else {
                largestIf = num3;
            }
        }
        System.out.println("Method 1 (Nested if-else): Largest = " + largestIf);

        // Method 2: Using Ternary Operator (? :)
        int largestTernary = (num1 >= num2 && num1 >= num3) ? num1 : ((num2 >= num3) ? num2 : num3);
        System.out.println("Method 2 (Ternary Op)    : Largest = " + largestTernary);
        System.out.println("==========================================");
    }
}
