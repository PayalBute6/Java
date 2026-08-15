/**
 * Topic: 1.7 Control Flow Statements - Switch Case Statement
 * 
 * Question 7:
 * Write a menu-driven program in Java to perform basic arithmetic operations
 * (Addition, Subtraction, Multiplication, Division, Modulus) using switch-case.
 */

public class P07MenuDrivenCalculator {

    public static void main(String[] args) {
        double a = 20.0;
        double b = 5.0;
        char operator = '*'; // Operations: '+', '-', '*', '/', '%'

        System.out.println("==========================================");
        System.out.println("         SIMPLE SWITCH CALCULATOR         ");
        System.out.println("==========================================");
        System.out.println("Operand 1 : " + a);
        System.out.println("Operand 2 : " + b);
        System.out.println("Operation : " + operator);

        double result;
        switch (operator) {
            case '+':
                result = a + b;
                System.out.println("Result: " + a + " + " + b + " = " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("Result: " + a + " - " + b + " = " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("Result: " + a + " * " + b + " = " + result);
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result: " + a + " / " + b + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                result = a % b;
                System.out.println("Result: " + a + " % " + b + " = " + result);
                break;
            default:
                System.out.println("Invalid operator selected!");
                break;
        }
        System.out.println("==========================================");
    }
}
