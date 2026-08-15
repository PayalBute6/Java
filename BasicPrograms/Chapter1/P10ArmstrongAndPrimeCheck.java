/**
 * Topic: 1.7 Control Flow Statements - Number Analysis Loops
 * 
 * Question 10:
 * Write a Java program to:
 * 1. Check whether a given number is an Armstrong number (e.g., 153 = 1^3 + 5^3 + 3^3).
 * 2. Check whether a given number is a Prime number.
 */

public class P10ArmstrongAndPrimeCheck {

    public static void main(String[] args) {
        int number = 153;

        System.out.println("==========================================");
        System.out.println("     ARMSTRONG & PRIME NUMBER CHECK       ");
        System.out.println("==========================================");
        System.out.println("Input Number: " + number);

        // --- 1. Armstrong Number Check ---
        int temp = number;
        int sumOfCubes = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sumOfCubes += (digit * digit * digit);
            temp /= 10;
        }

        if (sumOfCubes == number) {
            System.out.println("1. Armstrong Check: " + number + " IS an Armstrong number.");
        } else {
            System.out.println("1. Armstrong Check: " + number + " IS NOT an Armstrong number.");
        }

        // --- 2. Prime Number Check ---
        int primeTestNum = 29;
        boolean isPrime = true;

        if (primeTestNum <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(primeTestNum); i++) {
                if (primeTestNum % i == 0) {
                    isPrime = false;
                    break; // Exit loop early if factor found
                }
            }
        }

        System.out.println("\nTesting Number for Prime: " + primeTestNum);
        if (isPrime) {
            System.out.println("2. Prime Check    : " + primeTestNum + " IS a Prime number.");
        } else {
            System.out.println("2. Prime Check    : " + primeTestNum + " IS NOT a Prime number.");
        }
        System.out.println("==========================================");
    }
}
