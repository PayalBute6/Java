import Operation.Addition;
import Operation.Maximum;
import java.util.Scanner;

/*
 * Set B - e
 * Demo to test Operation package classes.
 */

public class OperationDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Addition addObj = new Addition();
        Maximum maxObj = new Maximum();

        System.out.println("Enter two integers for addition:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Addition of " + a + " and " + b + ": " + addObj.add(a, b));

        System.out.println("Enter two floats for subtraction:");
        float f1 = scanner.nextFloat();
        float f2 = scanner.nextFloat();
        System.out.println("Subtraction of " + f1 + " and " + f2 + ": " + addObj.subtract(f1, f2));

        System.out.println("Enter two integers to find maximum:");
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        System.out.print("Maximum of " + m1 + " and " + m2 + ": ");
        maxObj.max(m1, m2);
        
        scanner.close();
    }
}
