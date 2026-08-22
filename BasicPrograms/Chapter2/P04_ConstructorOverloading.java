// Topic 2.4: Constructors and Constructor Overloading
// Demonstrates default constructor, parameterized constructors, and overloading.

class ShapeRectangle {
    double length;
    double width;

    // 1. Default Constructor (No arguments)
    ShapeRectangle() {
        length = 1.0;
        width = 1.0;
        System.out.println("Default Constructor invoked.");
    }

    // 2. Single-parameter Constructor (Square creation)
    ShapeRectangle(double side) {
        length = side;
        width = side;
        System.out.println("Single-parameter Constructor (Square) invoked.");
    }

    // 3. Two-parameter Constructor (Custom rectangle creation)
    ShapeRectangle(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Two-parameter Constructor invoked.");
    }

    // Method to calculate area
    double calculateArea() {
        return length * width;
    }

    // Method to display dimensions and area
    void display() {
        System.out.println("Dimensions : " + length + " x " + width);
        System.out.println("Area       : " + calculateArea());
        System.out.println("-----------------------------------");
    }
}

public class P04_ConstructorOverloading {
    public static void main(String[] args) {
        System.out.println("=== 2.4 Constructors & Overloading Demo ===\n");

        // Object 1 using Default Constructor
        System.out.println("Creating r1:");
        ShapeRectangle r1 = new ShapeRectangle();
        r1.display();

        // Object 2 using Single-parameter Constructor
        System.out.println("Creating r2 (Square side = 5):");
        ShapeRectangle r2 = new ShapeRectangle(5.0);
        r2.display();

        // Object 3 using Two-parameter Constructor
        System.out.println("Creating r3 (Length = 10, Width = 4):");
        ShapeRectangle r3 = new ShapeRectangle(10.0, 4.0);
        r3.display();
    }
}
