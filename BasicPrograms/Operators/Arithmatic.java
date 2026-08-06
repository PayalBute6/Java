public class Arithmatic {
    public static void main(String args[]) {
        // Variable Initializations
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;

        // --- Basic Arithmetic Operations ---
        // Addition (+)
        System.out.println(a + b); // Output: 30  (10 + 20)

        // Subtraction (-)
        System.out.println(a - b); // Output: -10 (10 - 20)

        // Multiplication (*)
        System.out.println(a * b); // Output: 200 (10 * 20)

        // Division (/): returns the quotient
        System.out.println(b / a); // Output: 2   (20 / 10)

        // Modulus (%): returns the remainder of division
        System.out.println(b % a); // Output: 0   (20 % 10 -> remainder is 0)
        System.out.println(c % a); // Output: 5   (25 % 10 -> remainder is 5)

        // --- Increment (++) & Decrement (--) Operations ---
        
        // Post-increment (a++): Uses current value in expression first, then increments 'a' by 1
        System.out.println(a++); // Output: 10 (Prints original value 10, then 'a' becomes 11)

        // Post-decrement (a--): Uses current value in expression first, then decrements 'a' by 1
        System.out.println(a--); // Output: 11 (Prints current value 11, then 'a' becomes 10)

        // Post-increment on 'd'
        System.out.println(d++); // Output: 25 (Prints original value 25, then 'd' becomes 26)

        // Pre-increment (++d): Increments 'd' by 1 first, then uses new value in expression
        System.out.println(++d); // Output: 27 ('d' is incremented from 26 to 27, then prints 27)

        // Post-increment on 'a'
        System.out.println(a++); // Output: 10 (Prints current value 10, then 'a' becomes 11)

        // Pre-increment on 'a'
        System.out.println(++a); // Output: 12 ('a' is incremented from 11 to 12, then prints 12)
    }
}