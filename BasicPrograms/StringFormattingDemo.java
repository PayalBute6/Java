/**
 * StringFormattingDemo.java
 * 
 * Complete demonstration of String Formatting concepts in Java:
 * - String.format()
 * - System.out.printf()
 * - Format specifiers (%s, %d, %f, %c, %b)
 * - Width, precision, padding, alignment, and flags
 */
public class StringFormattingDemo {

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println("          JAVA STRING FORMATTING DEMO            ");
        System.out.println("=================================================");

        String name = "Alice";
        int age = 22;
        double salary = 75450.8956;
        boolean isStudent = false;
        char grade = 'A';

        // 1. Basic Format Specifiers (%s, %d, %f, %b, %c)
        System.out.println("\n--- 1. BASIC FORMAT SPECIFIERS ---");
        String basic = String.format("Name: %s | Age: %d | Grade: %c | Student: %b", name, age, grade, isStudent);
        System.out.println(basic);

        // 2. Precision Formatting for Floating-Point Numbers (%.Nf)
        System.out.println("\n--- 2. PRECISION (DECIMAL PLACES) ---");
        System.out.printf("Default %%f (6 decimals) : %f%n", salary);
        System.out.printf("2 Decimal Places (%%.2f): %.2f%n", salary); // Rounds to 75450.90
        System.out.printf("0 Decimal Places (%%.0f): %.0f%n", salary); // Rounds to 75451

        // 3. Width & Alignment (%10s vs %-10s)
        System.out.println("\n--- 3. WIDTH AND ALIGNMENT ---");
        System.out.printf("|%15s| (Right-aligned, 15 width)%n", name);
        System.out.printf("|%-15s| (Left-aligned,  15 width)%n", name);

        // 4. Zero Padding (%0Nd) & Comma Separator (%,d)
        System.out.println("\n--- 4. ZERO PADDING & THOUSAND SEPARATORS ---");
        int empId = 42;
        long totalItems = 1250000L;
        System.out.printf("Zero-padded ID (%%06d)   : %06d%n", empId); // 000042
        System.out.printf("Comma Separator (%%,d)   : %,d%n", totalItems); // 1,250,000
        System.out.printf("Currency Format (%%,.2f) : $%,.2f%n", salary); // $75,450.90

        // 5. Positive Sign Flag (%+d)
        System.out.println("\n--- 5. POSITIVE SIGN FLAG ---");
        int pos = 150;
        int neg = -200;
        System.out.printf("Positive number (%%+d)  : %+d%n", pos);
        System.out.printf("Negative number (%%+d)  : %+d%n", neg);

        // 6. Table Layout Example using printf
        System.out.println("\n--- 6. PRINTING STRUCTURED TABLES ---");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-5s | %-12s | %-10s | %-10s%n", "ID", "NAME", "ROLE", "SALARY");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-5d | %-12s | %-10s | $%,9.2f%n", 101, "Alice", "Developer", 85000.50);
        System.out.printf("%-5d | %-12s | %-10s | $%,9.2f%n", 102, "Bob", "Designer", 62500.00);
        System.out.printf("%-5d | %-12s | %-10s | $%,9.2f%n", 103, "Charlie", "Manager", 110000.75);
        System.out.println("-------------------------------------------------");

        // 7. Java 15+ String formatted() instance method
        System.out.println("\n--- 7. JAVA 15+ formatted() INSTANCE METHOD ---");
        String formattedMsg = "User %s has %d new notifications.".formatted("Dave", 5);
        System.out.println(formattedMsg);

        System.out.println("\n=================================================");
    }
}
