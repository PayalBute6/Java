package Part2_Methods;

class Calculator {

    // Method to add two numbers
    double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two numbers
    double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two numbers
    double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two numbers with validation
    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }
}

public class Program06_Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double num1 = 20.0;
        double num2 = 5.0;

        System.out.println("=== Calculator Operations ===");
        System.out.println(num1 + " + " + num2 + " = " + calc.add(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + calc.subtract(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + calc.multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + calc.divide(num1, num2));

        // Edge case: division by zero
        System.out.println("\n--- Testing Division by Zero ---");
        calc.divide(10.0, 0.0);
    }
}
