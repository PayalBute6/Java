// Topic 2.7: Creating, Accessing, and Using Packages
// Demonstrates importing and accessing a user-defined package (mypack.Calculator).

import mypack.Calculator;

public class P08_PackagesDemo {
    public static void main(String[] args) {
        System.out.println("=== 2.7 Creating, Accessing & Using Packages Demo ===\n");

        // Instantiating class from 'mypack' package
        Calculator calc = new Calculator();

        int a = 20, b = 5;

        System.out.println("Numbers: a = " + a + ", b = " + b);
        System.out.println("--------------------------------");
        System.out.println("Addition       : " + calc.add(a, b));
        System.out.println("Subtraction    : " + calc.subtract(a, b));
        System.out.println("Multiplication : " + calc.multiply(a, b));
        System.out.println("Division       : " + calc.divide(a, b));
    }
}
