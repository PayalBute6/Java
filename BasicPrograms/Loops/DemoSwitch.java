// Program to demonstrate a switch-case statement in Java
public class DemoSwitch { 
    public static void main(String args[]) { 
        // Character variable representing the day code
        char ch = 'S'; 

        // The switch statement evaluates the value of 'ch' and matches it with case labels
        switch (ch) { 
            case 'S': 
                System.out.println("Sunday"); 
                break; // 'break' terminates the switch statement after executing this case

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

            // default executes if none of the above cases match
            default:
                System.out.println("Invalid Day Code");
                break;
        } 
    } 
}