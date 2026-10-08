// Interface
interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);
}

// Class implementing interface
class SimpleCalc implements Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

public class SimpleCalcDemo {
    public static void main(String[] args) {
        SimpleCalc calc = new SimpleCalc();

        int sum = calc.add(50, 15);
        int diff = calc.subtract(50, 15);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
    }
}
