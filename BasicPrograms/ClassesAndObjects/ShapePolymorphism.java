// Run-time Polymorphism Example using Shapes (Method Overriding)

// Step 1: Parent Class
class Shape {
    void draw() {
        System.out.println("Drawing a generic shape...");
    }
}

// Step 2: Child Class 1 (Circle overrides draw)
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle ⭕");
    }
}

// Step 3: Child Class 2 (Rectangle overrides draw)
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle 🟦");
    }
}

// Step 4: Child Class 3 (Triangle overrides draw)
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle 🔺");
    }
}

// Step 5: Main Class
public class ShapePolymorphism {
    public static void main(String[] args) {
        // One parent reference variable
        Shape myShape;

        // Pointing to Circle object
        myShape = new Circle();
        myShape.draw(); // Runs Circle's draw() at RUNTIME

        // Pointing to Rectangle object
        myShape = new Rectangle();
        myShape.draw(); // Runs Rectangle's draw() at RUNTIME

        // Pointing to Triangle object
        myShape = new Triangle();
        myShape.draw(); // Runs Triangle's draw() at RUNTIME
    }
}
