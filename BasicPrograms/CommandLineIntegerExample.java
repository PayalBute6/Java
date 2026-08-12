// Concise example: Passing Integer Command Line Arguments in Java
public class CommandLineIntegerExample {
    public static void main(String[] args) {
        // Convert String arguments to integers using Integer.parseInt()
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Calculate and print the sum
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
