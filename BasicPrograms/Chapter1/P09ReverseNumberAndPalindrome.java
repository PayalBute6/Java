/**
 * Topic: 1.7 Control Flow Statements - While Loop
 * 
 * Question 9:
 * Write a Java program to:
 * 1. Reverse a given integer using a while loop.
 * 2. Check if the original number is a Palindrome (reads same forwards and backwards).
 */

public class P09ReverseNumberAndPalindrome {

    public static void main(String[] args) {
        int originalNum = 12321;
        int num = originalNum;
        int reversedNum = 0;

        System.out.println("==========================================");
        System.out.println("     REVERSE NUMBER & PALINDROME CHECK    ");
        System.out.println("==========================================");
        System.out.println("Original Number: " + originalNum);

        // Extract last digit and construct reversed number
        while (num > 0) {
            int digit = num % 10;          // Extract last digit
            reversedNum = (reversedNum * 10) + digit; // Append to reverse
            num = num / 10;               // Remove last digit
        }

        System.out.println("Reversed Number: " + reversedNum);

        // Check if palindrome
        if (originalNum == reversedNum) {
            System.out.println("Result: " + originalNum + " is a PALINDROME number.");
        } else {
            System.out.println("Result: " + originalNum + " is NOT a palindrome number.");
        }
        System.out.println("==========================================");
    }
}
