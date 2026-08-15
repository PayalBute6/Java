/**
 * Topic: 1.6 Basic concepts in Java - Type Casting
 * 
 * Question 3:
 * Write a Java program to demonstrate Type Casting:
 * 1. Implicit Type Casting (Widening Conversion: smaller to larger type)
 * 2. Explicit Type Casting (Narrowing Conversion: larger to smaller type)
 * 3. Character to ASCII integer conversion and vice versa.
 */

public class P03_TypeCastingDemo {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("        TYPE CASTING DEMONSTRATION        ");
        System.out.println("==========================================");

        // 1. Implicit (Widening) Casting: byte -> short -> int -> long -> float -> double
        int numInt = 100;
        double numDouble = numInt; // Automatic conversion from int to double
        System.out.println("1. IMPLICIT (WIDENING) CASTING:");
        System.out.println("   Original int value    : " + numInt);
        System.out.println("   Converted double value: " + numDouble);

        // 2. Explicit (Narrowing) Casting: double -> float -> long -> int -> short -> byte
        double valDouble = 99.99;
        int valInt = (int) valDouble; // Explicit manual cast required
        System.out.println("\n2. EXPLICIT (NARROWING) CASTING:");
        System.out.println("   Original double value : " + valDouble);
        System.out.println("   Cast int value        : " + valInt + " (Decimal part truncated)");

        // 3. Character and ASCII Value conversion
        char ch = 'A';
        int asciiValue = ch; // Implicit cast char to int
        System.out.println("\n3. CHAR & ASCII CONVERSION:");
        System.out.println("   Character             : " + ch);
        System.out.println("   ASCII Value           : " + asciiValue);

        int code = 66;
        char convertedChar = (char) code; // Explicit cast int to char
        System.out.println("   ASCII Code " + code + " to Char : " + convertedChar);
        System.out.println("==========================================");
    }
}
