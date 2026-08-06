import java.util.Scanner;

// Program to calculate Area and Perimeter of a Rectangle in Java
public class RectangleCalc {
    public static void main(String[] args) {
        // Create Scanner object to accept input from keyboard
        Scanner scanner = new Scanner(System.in);

        // 1. Accept length of the rectangle from the user
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();

        // 2. Accept breadth (width) of the rectangle from the user
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // 3. Calculate Area of Rectangle using formula: Area = length * breadth
        double area = length * breadth;

        // 4. Calculate Perimeter of Rectangle using formula: Perimeter = 2 * (length + breadth)
        double perimeter = 2 * (length + breadth);

        // 5. Display the calculated Area and Perimeter
        System.out.println("\n--- Rectangle Calculation Results ---");
        System.out.println("Length    : " + length);
        System.out.println("Breadth   : " + breadth);
        System.out.println("Area      : " + area);
        System.out.println("Perimeter : " + perimeter);

        // Close scanner resource
        scanner.close();
    }
}
