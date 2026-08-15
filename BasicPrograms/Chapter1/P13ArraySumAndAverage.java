/**
 * Topic: 1.8 Arrays in Java - 1D Array Basics
 * 
 * Question 13:
 * Write a Java program to initialize a 1D array of integers, compute the sum and average
 * of its elements, and find the minimum and maximum values in the array.
 */

public class P13ArraySumAndAverage {

    public static void main(String[] args) {
        int[] numbers = { 23, 45, 12, 67, 89, 34, 90, 11 };

        System.out.println("==========================================");
        System.out.println("      1D ARRAY STATISTICAL ANALYSIS       ");
        System.out.println("==========================================");
        System.out.print("Array Elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Total Elements : " + numbers.length);
        System.out.println("Sum of Elements: " + sum);
        System.out.println("Average Value  : " + average);
        System.out.println("Minimum Value  : " + min);
        System.out.println("Maximum Value  : " + max);
        System.out.println("==========================================");
    }
}
