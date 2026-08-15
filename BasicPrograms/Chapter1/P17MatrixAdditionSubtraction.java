/**
 * Topic: 1.8 Arrays in Java - 2D Arrays (Matrices)
 * 
 * Question 17:
 * Write a Java program to read two 2D matrices of dimensions M x N
 * and compute their Matrix Addition and Subtraction.
 */

public class P17MatrixAdditionSubtraction {

    public static void main(String[] args) {
        int[][] matrixA = {
            { 1, 2, 3 },
            { 4, 5, 6 }
        };

        int[][] matrixB = {
            { 7, 8, 9 },
            { 3, 2, 1 }
        };

        int rows = matrixA.length;
        int cols = matrixA[0].length;

        int[][] sumMatrix = new int[rows][cols];
        int[][] diffMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                diffMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        System.out.println("==========================================");
        System.out.println("     2D MATRIX ADDITION & SUBTRACTION     ");
        System.out.println("==========================================");

        System.out.println("Matrix A + Matrix B:");
        printMatrix(sumMatrix);

        System.out.println("\nMatrix A - Matrix B:");
        printMatrix(diffMatrix);
        System.out.println("==========================================");
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
