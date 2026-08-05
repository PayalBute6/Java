public class BackslashChar {
    public static void main(String[] args) {
        System.out.println("=== Java Backslash / Escape Sequence Characters ===");

        // 1. \n - New Line
        System.out.println("\n1. New Line (\\n):");
        System.out.println("Hello\nWorld");

        // 2. \t - Horizontal Tab
        System.out.println("\n2. Horizontal Tab (\\t):");
        System.out.println("Name:\tAlice\tAge:\t22");

        // 3. \' - Single Quote
        System.out.println("\n3. Single Quote (\\'):");
        System.out.println("It\\'s a great day!");

        // 4. \" - Double Quote
        System.out.println("\n4. Double Quote (\\\"):");
        System.out.println("He said, \"Java is easy!\"");

        // 5. \\ - Backslash
        System.out.println("\n5. Backslash (\\\\):");
        System.out.println("File path: C:\\\\Users\\\\Documents");

        // 6. \b - Backspace (deletes previous character)
        System.out.println("\n6. Backspace (\\b):");
        System.out.println("ABC\bD"); // 'C' is deleted, outputs ABD

        // 7. \r - Carriage Return (returns cursor to beginning of line)
        System.out.println("\n7. Carriage Return (\\r):");
        System.out.println("Hello World\rJava"); // Overwrites "Hello" with "Java "

        // 8. \f - Form Feed (moves to next page / page break)
        System.out.println("\n8. Form Feed (\\f):");
        System.out.println("Page 1\fPage 2");
    }
}
