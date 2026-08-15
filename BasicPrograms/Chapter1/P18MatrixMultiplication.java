/**
 * Topic: 1.8 Arrays in Java - 2D Array Multiplication
 * 
 * Question 18:
 * Write a Java program to perform Matrix Multiplication between two 2D matrices
 * after verifying dimension compatibility (cols of A == rows of B).
 */

public class P18MatrixMultiplication {

    public static void main(String[] args) {
        // Matrix A: 2x3
        int[][] matrixA = {
            { 1, 2, 3 },
            { 4, 5, 6 }
        };

        // Matrix B: 3x2
        int[][] matrixB = {
            { 7, 8 },
            { 9, 1 },
            { 2, 3 }
        };

        int r1 = matrixA.length;
        int c1 = matrixA[0].length;
        int r2 = matrixB.length;
        int c2 = matrixB[0].length;

        System.out.println("==========================================");
        System.out.println("        2D MATRIX MULTIPLICATION          ");
        System.out.println("==========================================");

        if (c1 != r2) {
            System.out.println("Matrix Multiplication not possible! Columns of A (" + c1 + ") != Rows of B (" + r2 + ")");
            return;
        }

        // Resulting matrix dimensions will be r1 x c2 (2x2)
        int[][] productMatrix = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    productMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("Product Matrix (A x B):");
        for (int[] row : productMatrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
        System.out.println("==========================================");
    }
}
