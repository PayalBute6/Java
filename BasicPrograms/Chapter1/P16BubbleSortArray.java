/**
 * Topic: 1.8 Arrays in Java - Sorting Algorithms
 * 
 * Question 16:
 * Write a Java program to sort an array of integers in ascending order
 * using the Bubble Sort algorithm.
 */

public class P16BubbleSortArray {

    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

        System.out.println("==========================================");
        System.out.println("           BUBBLE SORT DEMO               ");
        System.out.println("==========================================");
        System.out.print("Unsorted Array: ");
        printArray(arr);

        int n = arr.length;
        // Bubble sort logic
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Optimization: If no elements were swapped, array is already sorted
            if (!swapped) break;
        }

        System.out.print("Sorted Array  : ");
        printArray(arr);
        System.out.println("==========================================");
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
