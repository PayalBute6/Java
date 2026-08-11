// Class declaration: CommandLineExample serves as the container for our program
public class CommandLineExample {

    // Main method: entry point of the Java application
    // 'String[] args' receives any arguments passed from the command line interface
    public static void main(String[] args) {

        // Print the total number of command line arguments passed using 'args.length'
        System.out.println("Total arguments passed: " + args.length);

        // For loop: iterates from index 0 up to args.length - 1 to access each argument
        for (int i = 0; i < args.length; i++) {

            // Access and print the argument at index 'i' using 'args[i]'
            System.out.println(args[i]);
        }
    }
}

