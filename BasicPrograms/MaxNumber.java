import java.util.Scanner;

public class MaxNumber {

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                System.out.println("Array size must be greater than 0.");
                return;
            }

            int[] arr = new int[size];
            System.out.println("Enter " + size + " numbers:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            int max = findMax(arr);
            System.out.println("Maximum number in the array is: " + max);
        }
    }
}