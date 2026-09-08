import java.util.Scanner;

class Vehicle {
    String company;
    void displayVehicle() {
        System.out.println("Company: " + company);
    }
}
class Car extends Vehicle {
    int seats;
    void displayCar() {
        displayVehicle();
        System.out.println("Car Seats: " + seats);
    }
}
class Bike extends Vehicle {
    int wheels;
    void displayBike() {
        displayVehicle();
        System.out.println("Bike Wheels: " + wheels);
    }
}
class Bus extends Vehicle {
    int capacity;
    void displayBus() {
        displayVehicle();
        System.out.println("Bus Capacity: " + capacity);
    }
}
public class HierarchicalDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter company name (shared by all vehicles): ");
        String company = sc.nextLine().trim();

        System.out.print("Enter number of seats for Car: ");
        int seats = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter number of wheels for Bike: ");
        int wheels = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter passenger capacity for Bus: ");
        int capacity = sc.nextInt();
        sc.nextLine(); 

        Car c = new Car();
        c.company = company;
        c.seats = seats;

        Bike b = new Bike();
        b.company = company;
        b.wheels = wheels;

        Bus bs = new Bus();
        bs.company = company;
        bs.capacity = capacity;

        System.out.println("\nCar Information:");
        c.displayCar();
        System.out.println("\nBike Information:");
        b.displayBike();
        System.out.println("\nBus Information:");
        bs.displayBus();
        sc.close();
    }
}
