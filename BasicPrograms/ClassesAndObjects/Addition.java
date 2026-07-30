// Demonstration of Compile-time Polymorphism (Method Overloading) in Java

// What is Method Overloading?
// Method overloading occurs when a class has multiple methods with the SAME name
// but DIFFERENT parameters (different count of arguments or different data types).
// Why is it called Compile-time Polymorphism?
// Because the compiler determines WHICH method to call at compile time 
// based on the argument types and count passed during the method call.

class Calculator {
    // Method 1: Adds two integers
    void add(int a, int b) {
        System.out.println("Sum 1: " + (a + b));
    }

    // Method 2: Overloaded to add THREE integers (different number of parameters)
    void add(int a, int b, int c) {
        System.out.println("Sum 2: " + (a + b + c));
    }

    // Method 3: Overloaded to add TWO double values (different parameter data types)
    void add(double a, double b) {
        System.out.println("Sum 3: " + (a + b));
    }
}

public class Addition {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(10, 20);
        calc.add(10, 20, 30);
        calc.add(10.5, 20.5);
    }
}
