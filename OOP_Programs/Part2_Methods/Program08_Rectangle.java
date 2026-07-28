package Part2_Methods;

class Rectangle {
    double length;
    double width;

    // Method to calculate Area = length * width
    double area() {
        return length * width;
    }

    // Method to calculate Perimeter = 2 * (length + width)
    double perimeter() {
        return 2 * (length + width);
    }

    // Display rectangle properties and calculated results
    void displayInfo() {
        System.out.println("Length   : " + length);
        System.out.println("Width    : " + width);
        System.out.println("Area     : " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println("-----------------------------------");
    }
}

public class Program08_Rectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 10.5;
        r1.width = 5.0;

        Rectangle r2 = new Rectangle();
        r2.length = 7.0;
        r2.width = 3.5;

        System.out.println("=== Rectangle 1 Specs ===");
        r1.displayInfo();

        System.out.println("=== Rectangle 2 Specs ===");
        r2.displayInfo();
    }
}
