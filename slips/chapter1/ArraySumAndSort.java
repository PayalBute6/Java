// Write a Java program to print the sum of elements of the array. Also display array elements in ascending order.

import java.util.Arrays;
import java.util.Scanner;

public class ArraySumAndSort {
    public static void main(String[] args) {
        // Step 1: Create a Scanner to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Step 2: Ask the user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        // Step 3: Create an array of that size
        int[] arr = new int[n];
        
        // Step 4: Ask the user to enter the elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Step 5: Calculate the sum of all elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("\nSum of the elements: " + sum);
        
        // Step 6: Sort the array in ascending order
        Arrays.sort(arr);
        
        // Step 7: Print the sorted array
        System.out.println("Array elements in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Print a new line at the end
        
        // Close the sc when we are done
        sc.close();
    }
}
