package OOP_Programs.Part1_ClassAndObject;

/**
 * Chapter 2.2 - Access Specifiers in Java
 * Demonstrates public, protected, default (package-private), and private visibility.
 */
class AccessDemo {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30; // Package-private (default)
    private int privateVar = 40;

    public void showAllInSameClass() {
        System.out.println("Inside AccessDemo (Same Class):");
        System.out.println("  Public Var: " + publicVar);
        System.out.println("  Protected Var: " + protectedVar);
        System.out.println("  Default Var: " + defaultVar);
        System.out.println("  Private Var: " + privateVar);
    }
}

public class AccessSpecifierDemo {
    public static void main(String[] args) {
        System.out.println("=== Chapter 2.2: Access Specifiers Demo ===");

        AccessDemo demo = new AccessDemo();
        demo.showAllInSameClass();

        System.out.println("\nAccessing from AccessSpecifierDemo (Same Package):");
        System.out.println("  Public Var: " + demo.publicVar);
        System.out.println("  Protected Var: " + demo.protectedVar);
        System.out.println("  Default Var: " + demo.defaultVar);
        // System.out.println(demo.privateVar); // ERROR: privateVar has private access in AccessDemo
        System.out.println("  Private Var: [Inaccessible directly outside AccessDemo class]");
    }
}
