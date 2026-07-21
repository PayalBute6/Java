import java.util.Scanner;
public class ReverseArray{
    public static void reverseArray(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
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

            reverseArray(arr);
            System.out.println("Reversed array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}