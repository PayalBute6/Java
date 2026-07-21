public class ConstructorDemo {
    // Default constructor
    public ConstructorDemo() {
        System.out.println("This is the default constructor.");
    }

    // Parameterized constructor
    public ConstructorDemo(String message) {
        System.out.println("Parameterized constructor: " + message);
    }

    public static void main(String[] args) {
        // Create an instance using the default constructor
        ConstructorDemo ObjD = new ConstructorDemo();

        // Create an instance using the parameterized constructor
        ConstructorDemo ObjP = new ConstructorDemo("Hello, world!");
    }
}
