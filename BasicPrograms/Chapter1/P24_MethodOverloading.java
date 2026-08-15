/**
 * Topic: 1.1 OOP Concepts - Compile-Time Polymorphism (Method Overloading)
 * 
 * Question 24:
 * Write a Java program demonstrating Method Overloading by defining multiple area()
 * methods to compute the area of a Circle, Rectangle, and Triangle based on parameters.
 */

public class P24_MethodOverloading {

    // Overloaded method 1: Area of Circle (1 double parameter)
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Overloaded method 2: Area of Rectangle (2 double parameters)
    public static double area(double length, double width) {
        return length * width;
    }

    // Overloaded method 3: Area of Triangle (2 float parameters)
    public static double area(float base, float height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("      METHOD OVERLOADING DEMONSTRATION    ");
        System.out.println("==========================================");

        System.out.println("Area of Circle (r = 5.0)       : " + String.format("%.2f", area(5.0)));
        System.out.println("Area of Rectangle (10.0 x 4.0) : " + area(10.0, 4.0));
        System.out.println("Area of Triangle (base 6, h 8) : " + area(6.0f, 8.0f));

        System.out.println("==========================================");
    }
}
