/**
 * Topic: 1.6.1 Data Types & 1.6.3 Variables
 * 
 * Question 2:
 * Write a Java program to declare and initialize variables of all 8 primitive data types
 * (byte, short, int, long, float, double, char, boolean), print their values,
 * and print their size in bytes using wrapper class constants.
 */

public class P02PrimitiveDataTypes {

    public static void main(String[] args) {
        // 1. Integer types (Integral numbers)
        byte byteVar = 100;
        short shortVar = 30000;
        int intVar = 2000000;
        long longVar = 9876543210L; // Note the 'L' suffix for long literal

        // 2. Floating-point types (Decimal numbers)
        float floatVar = 5.75f;    // Note the 'f' suffix for float literal
        double doubleVar = 19.9999;

        // 3. Character type
        char charVar = 'A';

        // 4. Boolean type
        boolean booleanVar = true;

        System.out.println("==========================================");
        System.out.println("   JAVA PRIMITIVE DATA TYPES & SIZES     ");
        System.out.println("==========================================");

        System.out.println("byte    : Value = " + byteVar + " | Size = " + Byte.BYTES + " byte(s) (" + Byte.SIZE + " bits)");
        System.out.println("short   : Value = " + shortVar + " | Size = " + Short.BYTES + " byte(s) (" + Short.SIZE + " bits)");
        System.out.println("int     : Value = " + intVar + " | Size = " + Integer.BYTES + " byte(s) (" + Integer.SIZE + " bits)");
        System.out.println("long    : Value = " + longVar + " | Size = " + Long.BYTES + " byte(s) (" + Long.SIZE + " bits)");
        System.out.println("float   : Value = " + floatVar + " | Size = " + Float.BYTES + " byte(s) (" + Float.SIZE + " bits)");
        System.out.println("double  : Value = " + doubleVar + " | Size = " + Double.BYTES + " byte(s) (" + Double.SIZE + " bits)");
        System.out.println("char    : Value = " + charVar + " | Size = " + Character.BYTES + " byte(s) (" + Character.SIZE + " bits)");
        System.out.println("boolean : Value = " + booleanVar + " | Size = 1 bit (JVM dependent)");
        System.out.println("==========================================");
    }
}
