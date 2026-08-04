public class Array1d {
    public static void main(String[] args) {
        // 1. Declare and initialize a 1D (One-Dimensional) Array
        int[] numbers = {10, 20, 30, 40, 50};

        // 2. Accessing individual elements using index (index starts at 0)
        System.out.println("First element (index 0): " + numbers[0]);
        System.out.println("Third element (index 2): " + numbers[2]);

        // 3. Finding the total number of elements (Length of array)
        System.out.println("Array Length: " + numbers.length);

        System.out.println("\n--- Loop 1: Using Standard For Loop ---");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + " = " + numbers[i]);
        }

        System.out.println("\n--- Loop 2: Using Enhanced For Loop (For-Each) ---");
        for (int num : numbers) {
            System.out.println("Value: " + num);
        }
    }
}
