package BasicPrograms.Loops;

public class LoopMasterDemo {

    public static void main(String[] args) {

        System.out.println("=== 1. FOR LOOP (Known Iterations) ===");
        // Syntax: for (initialization; condition; update)
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop Count: " + i);
        }

        System.out.println("\n=== 2. WHILE LOOP (Entry-Controlled) ===");
        // Syntax: while (condition)
        int j = 1;
        while (j <= 5) {
            System.out.println("While Loop Count: " + j);
            j++;
        }

        System.out.println("\n=== 3. DO-WHILE LOOP (Exit-Controlled - Runs at least ONCE) ===");
        // Syntax: do { ... } while (condition);
        int k = 10; // Condition (k <= 5) is false right away, but it still executes once!
        do {
            System.out.println("Do-While Count (runs even if condition is false): " + k);
            k++;
        } while (k <= 5);

        System.out.println("\n=== 4. ENHANCED FOR LOOP (For-Each for Arrays) ===");
        // Syntax: for (type element : array)
        String[] fruits = {"Apple", "Banana", "Cherry", "Mango"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
