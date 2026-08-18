import java.util.Scanner;

public class MatrixOperations {

    // Helper method to input matrix elements
    public static int[][] readMatrix(Scanner sc, String name, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements for Matrix " + name + " (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    // Helper method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==============================================");
            System.out.println("          MATRIX OPERATIONS MENU              ");
            System.out.println("==============================================");
            System.out.println("1. Matrix Addition");
            System.out.println("2. Matrix Multiplication");
            System.out.println("3. Transpose of Matrix");
            System.out.println("4. Exit");
            System.out.println("==============================================");
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // i. Addition
                    System.out.print("Enter rows and columns for matrices: ");
                    int r = sc.nextInt();
                    int c = sc.nextInt();

                    int[][] a1 = readMatrix(sc, "A", r, c);
                    int[][] b1 = readMatrix(sc, "B", r, c);

                    int[][] sum = new int[r][c];
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            sum[i][j] = a1[i][j] + b1[i][j];
                        }
                    }

                    System.out.println("\nResult of Matrix Addition (A + B):");
                    displayMatrix(sum);
                    break;

                case 2:
                    // ii. Multiplication
                    System.out.print("Enter rows and columns for Matrix A: ");
                    int r1 = sc.nextInt();
                    int c1 = sc.nextInt();

                    System.out.print("Enter rows and columns for Matrix B: ");
                    int r2 = sc.nextInt();
                    int c2 = sc.nextInt();

                    if (c1 != r2) {
                        System.out.println("Error: Matrix multiplication not possible!");
                        System.out.println("Columns of Matrix A (" + c1 + ") must equal Rows of Matrix B (" + r2 + ").");
                        break;
                    }

                    int[][] a2 = readMatrix(sc, "A", r1, c1);
                    int[][] b2 = readMatrix(sc, "B", r2, c2);

                    int[][] prod = new int[r1][c2];
                    for (int i = 0; i < r1; i++) {
                        for (int j = 0; j < c2; j++) {
                            prod[i][j] = 0;
                            for (int k = 0; k < c1; k++) {
                                prod[i][j] += a2[i][k] * b2[k][j];
                            }
                        }
                    }

                    System.out.println("\nResult of Matrix Multiplication (A * B):");
                    displayMatrix(prod);
                    break;

                case 3:
                    // iii. Transpose
                    System.out.print("Enter rows and columns for Matrix: ");
                    int rows = sc.nextInt();
                    int cols = sc.nextInt();

                    int[][] mat = readMatrix(sc, "A", rows, cols);

                    int[][] transpose = new int[cols][rows];
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            transpose[j][i] = mat[i][j];
                        }
                    }

                    System.out.println("\nOriginal Matrix:");
                    displayMatrix(mat);

                    System.out.println("\nTranspose Matrix:");
                    displayMatrix(transpose);
                    break;

                case 4:
                    // iv. Exit
                    System.out.println("Exiting Matrix Operations program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select between 1 and 4.");
            }

        } while (choice != 4);

        sc.close();
    }
}
