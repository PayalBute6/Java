// Program to demonstrate Command Line Arguments in Java
public class CommandLineDemo {

    public static void main(String[] args) {
        System.out.println("=== Command Line Arguments Demo ===");
        System.out.println("Total arguments passed: " + args.length);

        if (args.length == 0) {
            System.out.println("\nNo command line arguments were passed.");
            System.out.println("Try running with arguments, e.g.:");
            System.out.println("  java CommandLineDemo Java Python 10 20");
            return;
        }

        // Print all arguments passed to main method
        System.out.println("\n--- Passed Arguments ---");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument [" + i + "]: " + args[i]);
        }

        // Try parsing numeric arguments if any are passed
        System.out.println("\n--- Evaluating Numeric Arguments ---");
        int sum = 0;
        int numericCount = 0;

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
                numericCount++;
            } catch (NumberFormatException e) {
                // Not an integer argument, skip arithmetic calculation
            }
        }

        if (numericCount > 0) {
            System.out.println("Sum of numeric arguments: " + sum);
        } else {
            System.out.println("No numeric arguments to calculate sum.");
        }
    }
}
