import java.util.Scanner;

interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);
}

class SimpleCalc implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}

public class SimpleCalcDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new SimpleCalc();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Addition (" + num1 + " + " + num2 + "): " + calc.add(num1, num2));
        System.out.println("Subtraction (" + num1 + " - " + num2 + "): " + calc.subtract(num1, num2));
        
        scanner.close();
    }
}
