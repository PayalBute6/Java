public class CommandLineExample {
    public static void main(String[] args) {
        System.out.println("Total arguments passed: " + args.length);

        // Printing each argument passed
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}
