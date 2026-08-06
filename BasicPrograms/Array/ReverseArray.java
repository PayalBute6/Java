import java.util.Scanner;

// Program to accept array elements from the user and display them in reverse order
public class ReverseArray {
    public static void main(String[] args) {
        // Create Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // 1. Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // 2. Declare array of the specified size
        int[] arr = new int[size];

        // 3. Accept array elements from user input
        System.out.println("\nEnter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // 4. Display original array elements
        System.out.print("\nOriginal Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        // 5. Display array elements in REVERSE order
        // Loop starts from the last index (size - 1) down to index 0
        System.out.print("\nReversed Array: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Close scanner resource
        sc.close();
    }
}
