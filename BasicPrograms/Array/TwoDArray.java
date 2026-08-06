// Program to demonstrate a 2D Array in Java using nested for loops
public class TwoDArray {
    public static void main(String[] args) {
        // 2D Array initialization: 2 rows and 2 columns
        int[][] marks = {
            {70, 80}, // Row 0: index [0][0], [0][1]
            {75, 85}  // Row 1: index [1][0], [1][1]
        };

        System.out.println("2D Array elements in Rows and Columns:\n");

        // Outer for loop iterates through each Row (i)
        for (int i = 0; i < marks.length; i++) {
            // Inner for loop iterates through each Column in Row i (j)
            for (int j = 0; j < marks[i].length; j++) {
                // System.out.print keeps elements of the same row on one line
                System.out.print(marks[i][j] + "\t");
            }
            // Move to the next line after printing all columns of row i
            System.out.println();
        }
    }
}



