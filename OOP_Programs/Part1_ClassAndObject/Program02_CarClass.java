package Part1_ClassAndObject;

class Car {
    String brand;
    String model;
    double price;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("-------------------------");
    }
}

public class Program02_CarClass {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.model = "Camry";
        c1.price = 26400.00;

        Car c2 = new Car();
        c2.brand = "Tesla";
        c2.model = "Model 3";
        c2.price = 38990.00;

        System.out.println("--- Car 1 Details ---");
        c1.display();

        System.out.println("--- Car 2 Details ---");
        c2.display();
    }
}
