import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// Program to accept 'n' country names and display them in descending order (Z to A)
public class CountrySortDescending {
    public static void main(String[] args) {
        // Create Scanner object for reading keyboard input
        Scanner scanner = new Scanner(System.in);

        // 1. Accept the total number of countries (n)
        System.out.print("Enter the number of countries: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character after nextInt()

        // 2. Declare a String array of size 'n' to store country names
        String[] countries = new String[n];

        // 3. Input 'n' country names from user
        System.out.println("\nEnter " + n + " country names:");
        for (int i = 0; i < n; i++) {
            System.out.print("Country " + (i + 1) + ": ");
            countries[i] = scanner.nextLine();
        }

        // 4. Sort the array of country names in DESCENDING order (Z to A)
        // Arrays.sort() with Collections.reverseOrder() sorts Strings in reverse alphabetical order
        Arrays.sort(countries, Collections.reverseOrder());

        // 5. Display the country names in descending order
        System.out.println("\n--- Country Names in Descending Order (Z to A) ---");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + countries[i]);
        }

        // Close scanner resource
        scanner.close();
    }
}
