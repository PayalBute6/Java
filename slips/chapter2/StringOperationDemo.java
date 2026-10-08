import java.util.Scanner;
import string_operation. *;

public class StringOperationDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String s1 = sc.nextLine();
        
        System.out.print("Enter the second string: ");
        String s2 = sc.nextLine();
        
        System.out.println("\n--- String Operations ---");
        
        // Use the Con class from the string_operation package
        Con conObj = new Con();
        conObj.concatenate(s1, s2);
        
        // Use the Comp class from the string_operation package
        Comp compObj = new Comp();
        compObj.compare(s1, s2);
        
        sc.close();
    }
}
