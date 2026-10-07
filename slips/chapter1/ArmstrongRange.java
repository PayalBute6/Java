// Write a Java Program to Display Armstrong Numbers Between range. Accept range from user.

import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        
        // Check every number in the range
        for (int i = start; i <= end; i++) {
            
            int temp = i;
            int sum = 0;

            while (temp > 0) {
                int remainder = temp % 10;
                sum = sum + (remainder * remainder * remainder);
                temp = temp / 10;
            }
            
            // If the sum equals the original number, it is an Armstrong number
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println();
        sc.close();
    }
}
