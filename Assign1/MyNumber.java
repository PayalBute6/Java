/**
 * The MyNumber class represents an integer number and provides methods 
 * to test various mathematical properties of the number such as whether it is 
 * negative, positive, zero, odd, or even.
 * 
 * @author Java Learner
 * @version 1.0
 */
public class MyNumber {

    /**
     * Private integer data member.
     */
    private int number;

    /**
     * Default constructor initializing the data member to 0.
     */
    public MyNumber() {
        this.number = 0;
    }

    /**
     * Parameterized constructor initializing the data member to the specified value.
     * Uses 'this' keyword to resolve variable shadow.
     * 
     * @param number the integer value to set
     */
    public MyNumber(int number) {
        this.number = number;
    }

    /**
     * Checks if the number is negative.
     * 
     * @return true if number is less than 0, false otherwise
     */
    public boolean isNegative() {
        return this.number < 0;
    }

    /**
     * Checks if the number is positive.
     * 
     * @return true if number is greater than 0, false otherwise
     */
    public boolean isPositive() {
        return this.number > 0;
    }

    /**
     * Checks if the number is zero.
     * 
     * @return true if number is equal to 0, false otherwise
     */
    public boolean isZero() {
        return this.number == 0;
    }

    /**
     * Checks if the number is odd.
     * 
     * @return true if number is odd, false otherwise
     */
    public boolean isOdd() {
        return this.number % 2 != 0;
    }

    /**
     * Checks if the number is even.
     * 
     * @return true if number is even, false otherwise
     */
    public boolean isEven() {
        return this.number % 2 == 0;
    }

    /**
     * Main method to test MyNumber class using command line arguments.
     * Converts string argument to integer using Integer.parseInt().
     * 
     * @param args command line arguments (expects an integer as args[0])
     */
    public static void main(String[] args) {
        int val = 0;

        if (args.length > 0) {
            try {
                // Convert string command-line argument to integer
                val = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer format! Using default value 0.");
            }
        } else {
            System.out.println("No command-line argument passed. Usage: java MyNumber <number>");
            System.out.println("Using default value 0 for demonstration.");
        }

        // Create MyNumber object
        MyNumber numObj = new MyNumber(val);

        System.out.println("\n==============================================");
        System.out.println("          MYNUMBER TEST RESULTS               ");
        System.out.println("==============================================");
        System.out.println("Value Tested   : " + val);
        System.out.println("isNegative()   : " + numObj.isNegative());
        System.out.println("isPositive()   : " + numObj.isPositive());
        System.out.println("isZero()       : " + numObj.isZero());
        System.out.println("isOdd()        : " + numObj.isOdd());
        System.out.println("isEven()       : " + numObj.isEven());
        System.out.println("==============================================");
    }
}
