/**
 * Represents a number and provides methods to check
 * whether the number is positive, negative, zero, odd or even.
 */
public class MyNumber {

    private int num;

    /**
     * Default constructor initializes the number to 0.
     */
    MyNumber() {
        num = 0;
    }

    /**
     * Parameterized constructor initializes the number
     * to the given value.
     *
     * @param num the value of the number
     */
    MyNumber(int num) {
        this.num = num;
    }

    /**
     * Checks whether the number is negative.
     *
     * @return true if the number is negative, otherwise false
     */
    boolean isNegative() {
        return num < 0;
    }

    /**
     * Checks whether the number is positive.
     *
     * @return true if the number is positive, otherwise false
     */
    boolean isPositive() {
        return num > 0;
    }

    /**
     * Checks whether the number is zero.
     *
     * @return true if the number is zero, otherwise false
     */
    boolean isZero() {
        return num == 0;
    }

    /**
     * Checks whether the number is odd.
     *
     * @return true if the number is odd, otherwise false
     */
    boolean isOdd() {
        return num % 2 != 0;
    }

    /**
     * Checks whether the number is even.
     *
     * @return true if the number is even, otherwise false
     */
    boolean isEven() {
        return num % 2 == 0;
    }

    /**
     * Main method to test MyNumber.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        MyNumber obj = new MyNumber(n);

        System.out.println("Number: " + n);
        System.out.println("Negative: " + obj.isNegative());
        System.out.println("Positive: " + obj.isPositive());
        System.out.println("Zero: " + obj.isZero());
        System.out.println("Odd: " + obj.isOdd());
        System.out.println("Even: " + obj.isEven());
    }
}