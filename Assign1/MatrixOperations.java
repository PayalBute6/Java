import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MATRIX MENU ---");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Transpose");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Matrix Addition
                    System.out.print("Enter rows and columns: ");
                    int r = sc.nextInt();
                    int c = sc.nextInt();

                    int[][] a = new int[r][c];
                    int[][] b = new int[r][c];
                    int[][] sum = new int[r][c];

                    System.out.println("Enter Matrix A:");
                    for (int i = 0; i < r; i++)
                        for (int j = 0; j < c; j++)
                            a[i][j] = sc.nextInt();

                    System.out.println("Enter Matrix B:");
                    for (int i = 0; i < r; i++)
                        for (int j = 0; j < c; j++)
                            b[i][j] = sc.nextInt();

                    for (int i = 0; i < r; i++)
                        for (int j = 0; j < c; j++)
                            sum[i][j] = a[i][j] + b[i][j];

                    System.out.println("Addition:");
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++)
                            System.out.print(sum[i][j] + "\t");
                        System.out.println();
                    }
                    break;


                case 2:
                    // Matrix Multiplication
                    System.out.print("Enter rows and columns of Matrix A: ");
                    int r1 = sc.nextInt();
                    int c1 = sc.nextInt();

                    System.out.print("Enter rows and columns of Matrix B: ");
                    int r2 = sc.nextInt();
                    int c2 = sc.nextInt();

                    if (c1 != r2) {
                        System.out.println("Multiplication not possible.");
                        break;
                    }

                    a = new int[r1][c1];
                    b = new int[r2][c2];
                    int[][] product = new int[r1][c2];

                    System.out.println("Enter Matrix A:");
                    for (int i = 0; i < r1; i++)
                        for (int j = 0; j < c1; j++)
                            a[i][j] = sc.nextInt();

                    System.out.println("Enter Matrix B:");
                    for (int i = 0; i < r2; i++)
                        for (int j = 0; j < c2; j++)
                            b[i][j] = sc.nextInt();

                    for (int i = 0; i < r1; i++) {
                        for (int j = 0; j < c2; j++) {
                            for (int k = 0; k < c1; k++)
                                product[i][j] += a[i][k] * b[k][j];
                        }
                    }

                    System.out.println("Multiplication:");
                    for (int i = 0; i < r1; i++) {
                        for (int j = 0; j < c2; j++)
                            System.out.print(product[i][j] + "\t");
                        System.out.println();
                    }
                    break;


                case 3:
                    // Matrix Transpose
                    System.out.print("Enter rows and columns: ");
                    r = sc.nextInt();
                    c = sc.nextInt();

                    a = new int[r][c];

                    System.out.println("Enter Matrix:");
                    for (int i = 0; i < r; i++)
                        for (int j = 0; j < c; j++)
                            a[i][j] = sc.nextInt();

                    System.out.println("Transpose:");

                    for (int j = 0; j < c; j++) {
                        for (int i = 0; i < r; i++)
                            System.out.print(a[i][j] + "\t");
                        System.out.println();
                    }
                    break;


                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
