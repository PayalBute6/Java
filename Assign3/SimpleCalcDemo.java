import java.util.Scanner;

interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);
}

class SimpleCalc implements Calculator {
    @Override
    public int add(int a, int b) 
    {
         return a + b; 
    }
    @Override
    public int subtract(int a, int b) 
    {
         return a - b; 
    }
}

public class SimpleCalcDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new SimpleCalc();

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = calc.add(num1, num2);
        int diff = calc.subtract(num1, num2);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
        
        sc.close();
    }
}
