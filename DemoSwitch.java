
import java.util.Scanner;

public class DemoSwitch { 
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);
       // sc.close(); 
        switch (ch) { 
            case 'S': 
                System.out.println("Sunday"); 
                break; 
            case 'M': 
                System.out.println("Monday"); 
                break; 
            case 'T': 
                System.out.println("Tuesday"); 
                break; 
            case 'W': 
                System.out.println("Wednesday"); 
                break; 
            case 't': 
                System.out.println("Thursday"); 
                break; 
            case 'F': 
                System.out.println("Friday"); 
                break; 
            case 's': 
                System.out.println("Saturday"); 
                break; 
            default:
                System.out.println("Invalid Day Code");
                break;
        } 
    } 
}
