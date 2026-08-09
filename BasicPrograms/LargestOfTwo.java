package BasicPrograms;

import java.util.Scanner;

public class LargestOfTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 2 numbers from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Find the largest number using simple if-else
        if (num1 > num2) {
            System.out.println(num1 + " is larger than " + num2 + ".");
        } else if (num2 > num1) {
            System.out.println(num2 + " is larger than " + num1 + ".");
        } else {
            System.out.println("Both numbers are equal (" + num1 + ").");
        }
        sc.close();
    }
}
