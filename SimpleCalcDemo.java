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

        int sum = calc.add(num1, num2);
        int difference = calc.subtract(num1, num2);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        
        scanner.close();
    }
}
