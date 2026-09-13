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
        Calculator calc = new SimpleCalc();
        System.out.println("Addition (10 + 5): " + calc.add(10, 5));
        System.out.println("Subtraction (10 - 5): " + calc.subtract(10, 5));
    }
}
