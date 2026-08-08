package BasicPrograms;

import java.util.Scanner;

public class FibonacciRecursive {

    // Recursive method to calculate the n-th Fibonacci number (0-indexed)
    public static long fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci Series (Recursive): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a positive integer.");
            scanner.close();
            return;
        }

        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Please enter a number greater than 0.");
            scanner.close();
            return;
        }

        System.out.println("\nFibonacci Series of " + count + " terms (Recursive):");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + (i < count - 1 ? ", " : ""));
        }
        System.out.println();
        scanner.close();
    }
}
