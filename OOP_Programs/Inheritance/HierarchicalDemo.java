class Vehicle {
    String company="Tata Motors";
    void displayVehicle() {
        System.out.println("Company: " + company);
    }
}
class Car extends Vehicle {
    int seats=4;
    void displayCar() {
        displayVehicle();
        System.out.println("Car Seats: " + seats);
    }
}
class Bike extends Vehicle {
    int wheels=2;
    void displayBike() {
        displayVehicle();
        System.out.println("Bike Wheels: " + wheels);
    }
}
class Bus extends Vehicle {
    int capacity=50;
    void displayBus() {
        displayVehicle();
        System.out.println("Bus Capacity: " + capacity);
    }
}
public class HierarchicalDemo {
    public static void main(String args[]) {
    

        Car c = new Car();
        System.out.println("\nCar Information:");
        c.displayCar();

        Bike b = new Bike();
        System.out.println("\nBike Information:");
        b.displayBike();

        Bus bs = new Bus();
        System.out.println("\nBus Information:");
        bs.displayBus();
    }
}
