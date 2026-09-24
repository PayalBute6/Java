package CustomerPack;

/*
 * Set C - b
 * Create four member variables for Customer class. Assign public, private, protected and default access 
 * modifiers respectively to these variables. Try to access these variables from other classes (Same package 
 * and Different package) 
 */

public class Customer {
    public String publicVar = "Public Variable";
    private String privateVar = "Private Variable";
    protected String protectedVar = "Protected Variable";
    String defaultVar = "Default Variable";

    public void display() {
        System.out.println("Inside Customer class:");
        System.out.println(publicVar);
        System.out.println(privateVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
    }
}
