// Program to demonstrate a do-while loop in Java (prints Count from 1 to 10)
public class DoWhileDemo { 
    public static void main(String[] args) { 
        // 1. Initialization: initialize counter variable starting at 1
        int cnt = 1; 

        // 2. do-while loop: An exit-controlled loop that executes the body AT LEAST ONCE before checking the condition
        do { 
            // Print the current count value
            System.out.println("Count is: " + cnt); 
            
            // Increment: increase counter variable by 1 in each iteration
            cnt++; 
        } while (cnt < 11); // 3. Condition check: continues loop as long as cnt is less than 11 (i.e. cnt = 1 to 10)
    } 
}
 