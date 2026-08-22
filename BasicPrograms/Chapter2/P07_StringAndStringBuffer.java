// Topic 2.6.2: String Class, StringBuffer Class, and String.format()
// Demonstrates immutable Strings, mutable StringBuffer, and String formatting.

public class P07_StringAndStringBuffer {
    public static void main(String[] args) {
        System.out.println("=== 2.6.2 String, StringBuffer & String.format() Demo ===\n");

        // 1. String Class (Immutable)
        System.out.println("--- 1. String Class (Immutable) ---");
        String str1 = "Hello";
        str1.concat(" World"); // Attempting modification without reassigning
        System.out.println("After concat without assignment : " + str1); // Output remains "Hello"

        str1 = str1.concat(" World!"); // Explicit reassignment
        System.out.println("After concat with assignment    : " + str1);

        System.out.println("Length of string                : " + str1.length());
        System.out.println("Uppercase conversion            : " + str1.toUpperCase());
        System.out.println("Substring (0, 5)                : " + str1.substring(0, 5));

        // 2. StringBuffer Class (Mutable)
        System.out.println("\n--- 2. StringBuffer Class (Mutable) ---");
        StringBuffer sb = new StringBuffer("Java");
        System.out.println("Initial StringBuffer : " + sb);

        sb.append(" Programming");
        System.out.println("After append()       : " + sb);

        sb.insert(5, "Core ");
        System.out.println("After insert()       : " + sb);

        sb.reverse();
        System.out.println("After reverse()      : " + sb);
        sb.reverse(); // Revert back to original order

        // 3. Formatting String data using format() method
        System.out.println("\n--- 3. String.format() Formatting ---");
        String name = "Sneha";
        int age = 22;
        double gpa = 3.846;

        // Using format specifiers: %s (string), %d (integer), %.2f (float rounded to 2 decimals)
        String formattedString = String.format("Student Record: Name = %-8s | Age = %03d | GPA = %.2f", name, age, gpa);
        System.out.println(formattedString);

        String dateFormatted = String.format("Date Format   : %02d/%02d/%4d", 5, 9, 2026);
        System.out.println(dateFormatted);
    }
}
