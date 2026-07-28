package Part1_ClassAndObject;

class Mobile {
    String brand;
    int ram; // in GB
    double price;

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("RAM   : " + ram + " GB");
        System.out.println("Price : $" + price);
        System.out.println("-------------------------");
    }
}

public class Program04_MobileClass {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.ram = 12;
        m1.price = 999.99;

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.ram = 8;
        m2.price = 1199.00;

        System.out.println("=== Mobile Specifications ===");
        m1.display();
        m2.display();
    }
}
