import StringOperation.Con;
import StringOperation.Comp;

public class TestStringOperation {
    public static void main(String[] args) {
        System.out.println("--- Testing Con (Concatenation) ---");
        Con concatenator = new Con();
        concatenator.concatenate("Hello, ", "World!");

        System.out.println("\n--- Testing Comp (Comparison) ---");
        Comp comparator = new Comp();
        comparator.compare("Java", "Java");
        comparator.compare("Java", "Python");
    }
}
