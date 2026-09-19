import java.util.Scanner;
import string_operation.Comp;
import string_operation.Con;

/*
 * Set C - a
 * Demo for string_operation package.
 */

public class StringOperationDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Con conObj = new Con();
        Comp compObj = new Comp();

        System.out.println("--- Concatenation ---");
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        conObj.concatenate(str1, str2);

        System.out.println("\n--- Comparison ---");
        System.out.print("Enter first string to compare: ");
        String cmp1 = sc.nextLine();
        System.out.print("Enter second string to compare: ");
        String cmp2 = sc.nextLine();
        compObj.compare(cmp1, cmp2);
        
        sc.close();
    }
}
