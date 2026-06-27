import java.util.Scanner;

public class SecondLargestElement {
    public static int findSecondLargest(int[] arr) {
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            if (size < 2) {
                System.out.println("Array must contain at least 2 elements to find the second largest.");
                return;
            }

            int[] arr = new int[size];
            System.out.println("Enter " + size + " numbers:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            int secondLargest = findSecondLargest(arr);

            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("There is no second largest element (all elements might be equal).");
            } else {
                System.out.println("The second largest element is: " + secondLargest);
            }
        }
    }
}