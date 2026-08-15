/**
 * Topic: 1.7 Control Flow Statements - Conditional Branching (if, if-else, else-if)
 * 
 * Question 5:
 * Write a Java program to:
 * 1. Check whether a given integer is Positive, Negative, or Zero.
 * 2. Check whether a given integer is Even or Odd using the modulus operator (%).
 */

public class P05_EvenOddAndSignCheck {

    public static void main(String[] args) {
        int number = -14;

        System.out.println("==========================================");
        System.out.println("     NUMBER ANALYSIS (SIGN & PARITY)      ");
        System.out.println("==========================================");
        System.out.println("Input Number: " + number);

        // 1. Checking Sign of Number using if-else-if ladder
        if (number > 0) {
            System.out.println("Sign Check   : " + number + " is POSITIVE.");
        } else if (number < 0) {
            System.out.println("Sign Check   : " + number + " is NEGATIVE.");
        } else {
            System.out.println("Sign Check   : The number is ZERO.");
        }

        // 2. Checking Even or Odd using Modulus Operator (%)
        if (number % 2 == 0) {
            System.out.println("Parity Check : " + number + " is EVEN.");
        } else {
            System.out.println("Parity Check : " + number + " is ODD.");
        }
        System.out.println("==========================================");
    }
}
