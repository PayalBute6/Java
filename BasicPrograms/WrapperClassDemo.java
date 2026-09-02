/**
 * WrapperClassDemo.java
 *
 * Demonstrates the 4 main uses of Wrapper Classes in Java:
 * 1. Primitive to Wrapper Object
 * 2. Wrapper Object to Primitive
 * 3. Primitive Number to String
 * 4. String to Primitive Number
 *
 * Covers primitive types: int, float, double and their corresponding
 * Wrapper classes: Integer, Float, Double.
 */
public class WrapperClassDemo {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("          JAVA WRAPPER CLASS DEMONSTRATION        ");
        System.out.println("==================================================\n");

        // Initial sample primitive values
        int n = 100;
        float f = 10.5f;
        double d = 25.75;

        // -----------------------------------------------------------------
        // 1. CONVERTING PRIMITIVE NUMBERS TO WRAPPER OBJECTS
        // Syntax: WrapperClass obj = new WrapperClass(primitiveValue);
        // (Note: ValueOf / Autoboxing can also be used in modern Java)
        // -----------------------------------------------------------------
        System.out.println("--- 1. Primitive to Wrapper Object ---");
        
        // A. int -> Integer
        Integer nobj = new Integer(n);
        System.out.println("Primitive int (n) = " + n + "  => Integer Object (nobj) = " + nobj);

        // B. float -> Float
        Float fobj = new Float(f);
        System.out.println("Primitive float (f) = " + f + " => Float Object (fobj) = " + fobj);

        // C. double -> Double
        Double dobj = new Double(d);
        System.out.println("Primitive double (d) = " + d + " => Double Object (dobj) = " + dobj);
        
        System.out.println();

        // -----------------------------------------------------------------
        // 2. CONVERTING WRAPPER OBJECTS TO PRIMITIVE NUMBERS
        // Syntax: primitiveValue = wrapperObj.xxxValue();
        // -----------------------------------------------------------------
        System.out.println("--- 2. Wrapper Object to Primitive ---");

        // A. Integer -> int
        int n1 = nobj.intValue();
        System.out.println("Integer Object (nobj) = " + nobj + " => Primitive int (n1) = " + n1);

        // B. Float -> float
        float f1 = fobj.floatValue();
        System.out.println("Float Object (fobj) = " + fobj + " => Primitive float (f1) = " + f1);

        // C. Double -> double
        double d1 = dobj.doubleValue();
        System.out.println("Double Object (dobj) = " + dobj + " => Primitive double (d1) = " + d1);

        System.out.println();

        // -----------------------------------------------------------------
        // 3. CONVERTING NUMBERS TO STRINGS
        // Syntax: String s = WrapperClass.toString(primitiveValue);
        // -----------------------------------------------------------------
        System.out.println("--- 3. Primitive Number to String ---");

        // A. int -> String
        String s1 = Integer.toString(n);
        System.out.println("int (100) -> String (s1) = \"" + s1 + "\"");

        // B. float -> String
        String s2 = Float.toString(f);
        System.out.println("float (10.5f) -> String (s2) = \"" + s2 + "\"");

        // C. double -> String
        String s3 = Double.toString(d);
        System.out.println("double (25.75) -> String (s3) = \"" + s3 + "\"");

        System.out.println();

        // -----------------------------------------------------------------
        // 4. CONVERTING STRINGS TO NUMBERS
        // Syntax: primitiveValue = WrapperClass.parseXxx(string);
        // -----------------------------------------------------------------
        System.out.println("--- 4. String to Primitive Number ---");

        String strInt = "100";
        String strFloat = "10.5";
        String strDouble = "25.75";

        // A. String -> int
        int n2 = Integer.parseInt(strInt);
        System.out.println("String (\"100\") -> int (n2) = " + n2 + " | Test Arithmetic (n2 + 50) = " + (n2 + 50));

        // B. String -> float
        float f2 = Float.parseFloat(strFloat);
        System.out.println("String (\"10.5\") -> float (f2) = " + f2 + " | Test Arithmetic (f2 + 4.5f) = " + (f2 + 4.5f));

        // C. String -> double
        double d2 = Double.parseDouble(strDouble);
        System.out.println("String (\"25.75\") -> double (d2) = " + d2 + " | Test Arithmetic (d2 + 10) = " + (d2 + 10));

        System.out.println("\n==================================================");
        System.out.println("              CONVERSION SUMMARY COMPLETED        ");
        System.out.println("==================================================");
    }
}
