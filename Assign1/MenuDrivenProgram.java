import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Display Menu
            System.out.println("\n1. Calculate Volume of Cylinder");
            System.out.println("2. Find Factorial of a Number");
            System.out.println("3. Check if Number is Armstrong");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Formula: Volume = π * r * r * h
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();

                    System.out.print("Enter height: ");
                    double height = sc.nextDouble();

                    double volume = 3.14159 * radius * radius * height;
                    System.out.println("Volume of Cylinder = " + volume);
                    break;

                case 2:
                    // Factorial Calculation
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();

                    long fact = 1;
                    for (int i = 1; i <= num; i++) {
                        fact = fact * i;
                    }
                    System.out.println("Factorial of " + num + " = " + fact);
                    break;

                case 3:
                    // Armstrong Number Calculation
                    System.out.print("Enter a number: ");
                    int number = sc.nextInt();

                    int temp = number;
                    int sum = 0;

                    while (temp > 0) {
                        int remainder = temp % 10;
                        sum = sum + (remainder * remainder * remainder);
                        temp = temp / 10;
                    }

                    if (sum == number) {
                        System.out.println(number + " is an Armstrong number.");
                    } else {
                        System.out.println(number + " is NOT an Armstrong number.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please choose between 1 and 4.");
            }

        } while (choice != 4);

        sc.close();
    }
}
