/**
 * Topic: 1.1 Object Oriented Programming Concepts & 1.4 Structure of Java Program
 * 
 * Question 23:
 * Write a Java program defining a Rectangle class with attributes length and width,
 * methods calculateArea() and calculatePerimeter(), and instantiate multiple Rectangle
 * objects in the main method.
 */

class Rectangle {
    // Instance variables (State)
    private double length;
    private double width;

    // Constructor to initialize state
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Member methods (Behavior)
    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public void displayDetails(String rectName) {
        System.out.println(rectName + " [Length=" + length + ", Width=" + width + "]");
        System.out.println("  -> Area     : " + calculateArea());
        System.out.println("  -> Perimeter: " + calculatePerimeter());
    }
}

public class P23RectangleOOP {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("       CLASS & OBJECT (RECTANGLE DEMO)    ");
        System.out.println("==========================================");

        // Creating instances (objects) of Rectangle class
        Rectangle rect1 = new Rectangle(10.5, 5.0);
        Rectangle rect2 = new Rectangle(7.0, 3.5);

        rect1.displayDetails("Rectangle 1");
        System.out.println();
        rect2.displayDetails("Rectangle 2");

        System.out.println("==========================================");
    }
}
