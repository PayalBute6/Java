// Simple Example of Run-time Polymorphism (Method Overriding)

// Step 1: Parent Class
class ParentCalculator {
    void add(int a, int b) {
        System.out.println("Parent Class Addition: " + (a + b));
    }
}

// Step 2: Child Class overrides the add() method
class ChildCalculator extends ParentCalculator {
    @Override
    void add(int a, int b) {
        System.out.println("Child Class Addition: " + (a + b));
    }
}

// Step 3: Main Class
public class RuntimePolymorphismAddition {
    public static void main(String[] args) {
        // Parent reference pointing to Child object
        ParentCalculator calc = new ChildCalculator();

        // Java decides at RUNTIME to call Child's add() method
        calc.add(10, 20);
    }
}
