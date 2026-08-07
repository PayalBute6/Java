package BasicPrograms;

public class IfDemo {

    public static void main(String[] args) {
        int score = 85;

        System.out.println("--- Example 1: Condition is TRUE ---");
        // Condition (score >= 50) evaluates to true (85 >= 50)
        if (score >= 50) {
            System.out.println("Congratulations! You passed the test.");
        }

        System.out.println("\n--- Example 2: Condition is FALSE ---");
        // Condition (score < 40) evaluates to false (85 < 40)
        if (score < 40) {
            System.out.println("Sorry, you failed the test."); // SKIPPED!
        }

        System.out.println("\n--- Example 3: Checking multiple IF statements ---");
        int age = 20;

        if (age >= 18) {
            System.out.println("You are an adult (Age: " + age + ")");
        }

        if (age >= 60) {
            System.out.println("You qualify for Senior Citizen discount."); // SKIPPED!
        }

        System.out.println("\nProgram finished successfully.");
    }
}
