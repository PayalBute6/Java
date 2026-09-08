import java.util.Scanner;

/**
 * Simple demonstration of single inheritance: Vehicle (super class) and Car (subclass).
 */
public class CarDemo {
    /** Super class with basic vehicle info. */
    static class Vehicle {
        String company;
        double price;
        Vehicle(String company, double price) {
            this.company = company;
            this.price = price;
        }
    }

    /** Car adds seats and type, and can display all info. */
    static class Car extends Vehicle {
        int seats;
        String type;
        Car(String company, double price, int seats, String type) {
            super(company, price);
            this.seats = seats;
            this.type = type;
        }
        void display() {
            System.out.println("Company: " + company);
            System.out.println("Price  : $" + price);
            System.out.println("Seats  : " + seats);
            System.out.println("Type   : " + type);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Company: ");
        String company = sc.nextLine().trim();
        System.out.print("Price: ");
        double price = Double.parseDouble(sc.nextLine().trim());
        System.out.print("Seats: ");
        int seats = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Type (e.g., Sedan): ");
        String type = sc.nextLine().trim();
        Car car = new Car(company, price, seats, type);
        System.out.println("\n--- Car Information ---");
        car.display();
        sc.close();
    }
}
