import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.print("Enter the target sum: ");
            int target = scanner.nextInt();

            boolean found = false;
            System.out.println("Indices of pairs that sum up to " + target + ":");
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] + arr[j] == target) {
                        System.out.println(i + " " + j);
                        found = true;
                    }
                }
            }

            if (!found) {
                System.out.println("No two numbers sum up to the target.");
            }
        }
    }
}