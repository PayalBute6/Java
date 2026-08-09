package BasicPrograms;

import java.util.Scanner;

public class PrimeNumber {

    // Method to check if a number is prime using O(sqrt(N)) time complexity
    public static boolean isPrime(int n) {
        // Numbers <= 1 are not prime
        if (n <= 1) {
            return false;
        }

        // 2 and 3 are prime numbers
        if (n <= 3) {
            return true;
        }

        // Exclude multiples of 2 and 3
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        // Check factors from 5 up to sqrt(n)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is prime: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            scanner.close();
            return;
        }

        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a PRIME number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }

        scanner.close();
    }
}