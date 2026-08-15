/**
 * Topic: 1.9 Accepting Input - Command Line Arguments
 * 
 * Question 19:
 * Write a Java program to accept user inputs passed via Command Line Arguments (String[] args),
 * convert numeric arguments using Integer.parseInt() and Double.parseDouble(),
 * and display the student's name, age, and percentage.
 * 
 * Execution example:
 * java P19_CommandLineArguments "Alice" 20 88.5
 */

public class P19_CommandLineArguments {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("     COMMAND LINE ARGUMENTS DEMO          ");
        System.out.println("==========================================");

        if (args.length < 3) {
            System.out.println("Usage Note: Please pass 3 arguments -> Name (String), Age (int), Marks (double)");
            System.out.println("Defaulting to sample values for demonstration:");
            String name = "Alice";
            int age = 20;
            double percentage = 88.5;
            displayInfo(name, age, percentage);
            return;
        }

        // Parse command line string arguments
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double percentage = Double.parseDouble(args[2]);

        displayInfo(name, age, percentage);
    }

    private static void displayInfo(String name, int age, double percentage) {
        System.out.println("Student Name : " + name);
        System.out.println("Age          : " + age + " years");
        System.out.println("Percentage   : " + percentage + "%");
        System.out.println("==========================================");
    }
}
