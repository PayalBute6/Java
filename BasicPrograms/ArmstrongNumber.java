package BasicPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

    // Method to count number of digits in a given number
    public static int getDigitCount(int number) {
        int count = 0;
        int temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count == 0 ? 1 : count;
    }

    // Method to check if a number is an Armstrong number (for any number of digits)
    public static boolean isArmstrong(int number) {
        if (number < 0) return false; // Negative numbers are not Armstrong numbers

        int numberOfDigits = getDigitCount(number);
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numberOfDigits);
            temp /= 10;
        }

        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's an Armstrong number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            scanner.close();
            return;
        }

        int number = scanner.nextInt();

        int digits = getDigitCount(number);
        boolean check = isArmstrong(number);

        System.out.println("\n--- Armstrong Number Verification ---");
        System.out.println("Number of digits: " + digits);

        if (check) {
            System.out.println(number + " is an ARMSTRONG number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }

        // Display sample 3-digit and 4-digit Armstrong numbers for context
        System.out.println("\nExamples of Armstrong Numbers:");
        System.out.println("3-digit: 153, 370, 371, 407");
        System.out.println("4-digit: 1634, 8208, 9474");

        scanner.close();
    }
}
