import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask how many elements to store in the array
        System.out.print("Enter how many numbers you want to enter: ");
        int n = sc.nextInt();

        // Step 2: Create an array of size n
        int[] arr = new int[n];

        // Step 3: Take input from the user for the array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 4: Print elements in reverse order
        System.out.println("\nNumbers in reverse order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
