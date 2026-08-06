public class Relational {
    public static void main(String args[]) {
        // Variable Initializations
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;

        // --- Relational (Comparison) Operators ---
        // Relational operators compare two values and return a boolean result: true or false.

        // 1. Less than (<)
        System.out.println(a < b);  // Output: true  (10 is less than 20)

        // 2. Greater than (>)
        System.out.println(c > b);  // Output: true  (25 is greater than 20)

        // 3. Less than or equal to (<=)
        System.out.println(c <= d); // Output: true  (25 is equal to 25, so condition is true)

        // 4. Greater than or equal to (>=)
        System.out.println(c >= d); // Output: true  (25 is equal to 25, so condition is true)

        // 5. Equal to (==)
        System.out.println(c == d); // Output: true  (25 is equal to 25)

        // Note: Not equal to (!=) would be: System.out.println(a != b); // Output: true (10 is not equal to 20)
    }
}
