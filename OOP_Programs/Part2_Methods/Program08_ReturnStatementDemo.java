package Part2_Methods;

public class Program08_ReturnStatementDemo {

    // Simple method returning a number
    public static int getSquare(int number) {
        return number * number; // returns square of the number
    }

    public static void main(String[] args) {
        int result = getSquare(5);
        System.out.println("Square of 5 is: " + result); // Output: Square of 5 is: 25
    }
}
