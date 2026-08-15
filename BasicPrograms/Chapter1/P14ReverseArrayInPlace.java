/**
 * Topic: 1.8 Arrays in Java - Array Manipulation
 * 
 * Question 14:
 * Write a Java program to reverse the elements of a 1D array in-place
 * using the two-pointer technique (without creating a second array).
 */

public class P14ReverseArrayInPlace {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60 };

        System.out.println("==========================================");
        System.out.println("       REVERSE 1D ARRAY IN-PLACE          ");
        System.out.println("==========================================");

        System.out.print("Original Array: ");
        printArray(arr);

        // Two-pointer swap technique
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.print("Reversed Array: ");
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
