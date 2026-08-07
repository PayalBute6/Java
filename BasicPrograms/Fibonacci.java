package BasicPrograms;

public class Fibonacci {

    public static void main(String[] args) {
        int count = 10; // Number of terms to generate
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series of " + count + " terms:");

        for (int i = 1; i <= count; i++) {
            System.out.print(firstTerm + (i < count ? ", " : ""));

            // Calculate next term in series
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
    }
}
