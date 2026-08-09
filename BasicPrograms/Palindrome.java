package BasicPrograms;

import java.util.Scanner;

public class Palindrome {

    // Method to check if a number is a Palindrome using integer arithmetic
    public static boolean isNumberPalindrome(int number) {
        if (number < 0) return false; // Negative numbers are not palindromes (e.g. -121 != 121-)

        int original = number;
        int reversed = 0;

        while (number > 0) {
            int remainder = number % 10;
            reversed = (reversed * 10) + remainder;
            number /= 10;
        }

        return original == reversed;
    }

    // Method to check if a String is a Palindrome using two-pointer approach
    public static boolean isStringPalindrome(String str) {
        if (str == null) return false;

        // Clean string: remove non-alphanumeric characters and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number or text to check if it's a palindrome: ");
        String input = scanner.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("Input cannot be empty.");
            scanner.close();
            return;
        }

        System.out.println("\n--- Palindrome Check ---");

        // Try parsing as integer first
        try {
            int num = Integer.parseInt(input);
            if (isNumberPalindrome(num)) {
                System.out.println("Number " + num + " is a PALINDROME.");
            } else {
                System.out.println("Number " + num + " is NOT a palindrome.");
            }
        } catch (NumberFormatException e) {
            // Treat as string/phrase
            if (isStringPalindrome(input)) {
                System.out.println("Text \"" + input + "\" is a PALINDROME.");
            } else {
                System.out.println("Text \"" + input + "\" is NOT a palindrome.");
            }
        }

        scanner.close();
    }
}