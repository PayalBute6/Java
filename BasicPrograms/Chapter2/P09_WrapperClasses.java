// Topic 2.8: Wrapper Classes
// Demonstrates Autoboxing, Unboxing, Parsing String data, and Utility methods of Wrapper Classes.

public class P09_WrapperClasses {
    public static void main(String[] args) {
        System.out.println("=== 2.8 Wrapper Classes Demo ===\n");

        // 1. Primitive to Wrapper Object (Autoboxing)
        int primitiveInt = 42;
        Integer boxedInt = primitiveInt; // Autoboxing
        System.out.println("Primitive int        : " + primitiveInt);
        System.out.println("Autoboxed Integer    : " + boxedInt);

        // 2. Wrapper Object to Primitive (Unboxing)
        Double boxedDouble = 99.75;
        double primitiveDouble = boxedDouble; // Unboxing
        System.out.println("\nAutoboxed Double     : " + boxedDouble);
        System.out.println("Unboxed double       : " + primitiveDouble);

        // 3. Parsing String Data to Primitives using Wrapper Classes
        System.out.println("\n--- String to Primitive Parsing ---");
        String strNum = "250";
        String strDec = "45.89";
        String strBool = "true";

        int parsedInt = Integer.parseInt(strNum);
        double parsedDouble = Double.parseDouble(strDec);
        boolean parsedBool = Boolean.parseBoolean(strBool);

        System.out.println("Parsed int + 50      : " + (parsedInt + 50));
        System.out.println("Parsed double * 2    : " + (parsedDouble * 2));
        System.out.println("Parsed boolean       : " + parsedBool);

        // 4. Utility Methods of Wrapper Classes
        System.out.println("\n--- Useful Wrapper Utility Methods ---");
        System.out.println("Binary of 42         : " + Integer.toBinaryString(42));
        System.out.println("Hexadecimal of 255   : " + Integer.toHexString(255));
        System.out.println("Max value of Integer : " + Integer.MAX_VALUE);
        System.out.println("Min value of Integer : " + Integer.MIN_VALUE);

        // Character class utilities
        char ch = '9';
        System.out.println("Is '9' a digit?      : " + Character.isDigit(ch));
        System.out.println("Is '9' a letter?     : " + Character.isLetter(ch));
    }
}
