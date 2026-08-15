/**
 * Topic: 1.8 Arrays in Java - Searching Algorithms
 * 
 * Question 15:
 * Write a Java program to perform Linear Search on a 1D array to find a target key.
 * Display the target's index position if found, or report if it is absent.
 */

public class P15_LinearSearchArray {

    public static void main(String[] args) {
        int[] dataset = { 15, 42, 8, 99, 63, 27, 74 };
        int targetKey = 99;

        System.out.println("==========================================");
        System.out.println("          LINEAR SEARCH IN ARRAY          ");
        System.out.println("==========================================");
        System.out.println("Target Key to Search: " + targetKey);

        int foundIndex = -1;
        for (int i = 0; i < dataset.length; i++) {
            if (dataset[i] == targetKey) {
                foundIndex = i;
                break; // Exit loop early once target is found
            }
        }

        if (foundIndex != -1) {
            System.out.println("Result: Key " + targetKey + " FOUND at index " + foundIndex + " (Position " + (foundIndex + 1) + ").");
        } else {
            System.out.println("Result: Key " + targetKey + " NOT FOUND in the array.");
        }
        System.out.println("==========================================");
    }
}
