/**
 * Topic: 1.6.3 Variables & Arithmetic Operators
 * 
 * Question 4:
 * Write a Java program to swap two numbers:
 * 1. Using a third temporary variable.
 * 2. Without using a third variable (using addition and subtraction).
 */

public class P04VariableSwapping {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("      VARIABLE SWAPPING DEMONSTRATION     ");
        System.out.println("==========================================");

        // --- Method 1: Using a Temporary Variable ---
        int a = 10;
        int b = 20;
        System.out.println("Method 1: Using Temporary Variable");
        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        int temp = a; // Store value of a in temp
        a = b;        // Assign value of b to a
        b = temp;     // Assign temp (original a) to b

        System.out.println("After Swapping : a = " + a + ", b = " + b);

        // --- Method 2: Without Using Temporary Variable ---
        int x = 50;
        int y = 100;
        System.out.println("\nMethod 2: Without Temporary Variable");
        System.out.println("Before Swapping: x = " + x + ", y = " + y);

        x = x + y; // x becomes 150
        y = x - y; // y becomes 150 - 100 = 50 (original x)
        x = x - y; // x becomes 150 - 50 = 100 (original y)

        System.out.println("After Swapping : x = " + x + ", y = " + y);
        System.out.println("==========================================");
    }
}
