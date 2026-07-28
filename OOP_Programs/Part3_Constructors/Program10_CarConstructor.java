package Part3_Constructors;

class Car {
    String brand;
    String model;
    double price;

    // Parameterized Constructor initializing Brand, Model, and Price
    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display car specifications
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("-------------------------");
    }
}

public class Program10_CarConstructor {
    public static void main(String[] args) {
        // Initializing car instances via parameterized constructor
        Car c1 = new Car("Ford", "Mustang", 55000.00);
        Car c2 = new Car("BMW", "M3", 76000.00);

        System.out.println("=== Car Showroom Inventory ===");
        c1.display();
        c2.display();
    }
}
