import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n1. Volume of Cylinder  2. Factorial  3. Armstrong Check  4. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter radius & height: ");
                    double r = sc.nextDouble(), h = sc.nextDouble();
                    System.out.println("Volume = " + (Math.PI * r * r * h));
                    break;

                case 2:
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    long fact = 1;
                    for (int i = 1; i <= n; i++) fact *= i;
                    System.out.println("Factorial = " + fact);
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    int num = sc.nextInt(), temp = num, sum = 0, d = String.valueOf(num).length();
                    while (temp > 0) {
                        sum += Math.pow(temp % 10, d);
                        temp /= 10;
                    }
                    System.out.println(num + (sum == num ? " is Armstrong" : " is NOT Armstrong"));
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (ch != 4);

        sc.close();
    }
}
