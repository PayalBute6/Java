package OOP_Programs.Part5_Abstraction;

import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    // Abstract method area() to be implemented by subclasses
    public abstract double area();
}

// Concrete subclass Circle extending abstract class Shape
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method area()
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}

// Main class to execute and test the program
public class CircleAreaDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Radius must be a numerical value.");
            scanner.close();
            return;
        }

        double radius = scanner.nextDouble();

        if (radius < 0) {
            System.out.println("Radius cannot be negative.");
            scanner.close();
            return;
        }

        // Upcasting: Referring to Circle object using abstract class Shape reference
        Shape circle = new Circle(radius);

        System.out.printf("%n--- Circle Area Calculation ---%n");
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Calculated Area (π * r²): %.4f%n", circle.area());

        scanner.close();
    }
}
