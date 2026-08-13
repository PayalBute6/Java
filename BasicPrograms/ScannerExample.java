import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Instantiate Scanner object connected to System.in
        Scanner scanner = new Scanner(System.in);

        // Reading String input (word/token)
        System.out.print("Enter Name : ");
        String name = scanner.nextLine();

        // Reading integer input directly without explicit parsing
        System.out.print("Enter Age : ");
        int age = scanner.nextInt();

        // Reading double input
        System.out.print("Enter Salary : ");
        double salary = scanner.nextDouble();

        // Output results
        System.out.println("\n--- User Details ---");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : $" + salary);

        // Close scanner resource
        scanner.close();
    }
}
