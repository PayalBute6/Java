// Class declaration: MinMaxArray is the blueprint containing our program
public class MinMaxArray {

    // Main method: entry point of any standalone Java application
    public static void main(String[] args) {

        // Declare and initialize a 1D integer array named 'numbers' with 8 elements
        int[] numbers = {45, 12, 89, 3, 67, 24, 99, 15};

        // Assume the first element (index 0, which is 45) is the minimum value initially
        int min = numbers[0];

        // Assume the first element (index 0, which is 45) is the maximum value initially
        int max = numbers[0];

        // For-each loop: iterates through every element in the 'numbers' array sequentially
        for (int num : numbers) {

            // Check if the current element 'num' is greater than the current 'max'
            if (num > max) {

                // If true, update 'max' to hold this new maximum value
                max = num;
            }

            // Check if the current element 'num' is smaller than the current 'min'
            if (num < min) {

                // If true, update 'min' to hold this new minimum value
                min = num;
            }
        }

        // Print the final minimum element value to the console
        System.out.println("Minimum element: " + min);

        // Print the final maximum element value to the console
        System.out.println("Maximum element: " + max);
    }
}



