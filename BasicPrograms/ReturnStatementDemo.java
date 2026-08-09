package BasicPrograms;

public class ReturnStatementDemo {

    // 1. Returns a value (int)
    public static int add(int a, int b) {
        return a + b; // Returns 8
    }

    // 2. Returns NOTHING (void)
    public static void printMessage() {
        System.out.println("This method returns nothing!");
        return; // Returns NOTHING and exits the method
    }

    public static void main(String[] args) {
        // Method returning a value
        int answer = add(5, 3);
        System.out.println("Answer: " + answer);

        // Method returning nothing
        printMessage();
    }
}
