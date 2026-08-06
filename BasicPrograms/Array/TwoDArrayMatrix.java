// Program to demonstrate a 3x3 2D Array (Matrix) in Java using nested loops
public class TwoDArrayMatrix { 
    public static void main(String args[]) { 
        // Declaring and initializing a 3x3 2D array (3 rows, 3 columns)
        int arr[][] = {
            {11, 22, 33}, 
            {44, 55, 66}, 
            {77, 88, 99}
        }; 

        System.out.println("2D Array (3x3 Matrix) elements:\n");

        // Outer loop for rows (i = 0 to 2)
        for (int i = 0; i < 3; i++) { 
            // Inner loop for columns (j = 0 to 2)
            for (int j = 0; j < 3; j++) { 
                // Display each 2D array element with a space
                System.out.print(arr[i][j] + " ");  
            } 
            // Newline after completing each row
            System.out.println(); 
        } 
    } 
}
