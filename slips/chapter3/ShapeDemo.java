// Abstract Class
abstract class Shape {
    int dim1;
    int dim2;

    abstract void printArea();
}

// Rectangle
class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        dim1 = length;
        dim2 = width;
    }

    void printArea() {
        int area = dim1 * dim2;
        System.out.println("Area of Rectangle is: " + area);
    }
}

// Triangle
class Triangle extends Shape {
    public Triangle(int base, int height) {
        dim1 = base;
        dim2 = height;
    }

    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle is: " + area);
    }
}

// Circle
class Circle extends Shape {
    public Circle(int radius) {
        dim1 = radius;
        dim2 = 0; // Not used
    }

    void printArea() {
        double area = 3.14 * dim1 * dim1;
        System.out.println("Area of Circle is: " + area);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 5);
        rect.printArea();

        Shape tri = new Triangle(10, 8);
        tri.printArea();

        Shape circ = new Circle(7);
        circ.printArea();
    }
}
