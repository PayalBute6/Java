package Part5_Abstraction;

/**
 * Abstract class Vehicle representing the base template for all types of vehicles.
 * Demonstrates:
 * 1. Abstract method start() - no implementation in Vehicle class, must be overridden by subclasses.
 * 2. Non-abstract method stop() - common implementation shared across all subclasses.
 */
abstract class Vehicle {
    private String brand;
    private String model;

    // Constructor of abstract class
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    // Abstract method (No body): Forces subclasses to provide specific start logic
    public abstract void start();

    // Concrete (non-abstract) method: Common functionality inherited by all vehicles
    public void stop() {
        System.out.println(brand + " " + model + " has come to a complete stop.");
    }

    public void displayInfo() {
        System.out.println("Vehicle Details: " + brand + " " + model);
    }
}

// Concrete Subclass 1: Car
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    // Overriding abstract start() method
    @Override
    public void start() {
        System.out.println(getBrand() + " " + getModel() + " (Car) starts using key ignition / push start button.");
    }
}

// Concrete Subclass 2: Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, boolean hasSidecar) {
        super(brand, model);
        this.hasSidecar = hasSidecar;
    }

    // Overriding abstract start() method
    @Override
    public void start() {
        System.out.println(getBrand() + " " + getModel() + " (Motorcycle) starts using kick-start or self-start button.");
    }
}

// Concrete Subclass 3: ElectricScooter
class ElectricScooter extends Vehicle {
    private int batteryPercentage;

    public ElectricScooter(String brand, String model, int batteryPercentage) {
        super(brand, model);
        this.batteryPercentage = batteryPercentage;
    }

    // Overriding abstract start() method
    @Override
    public void start() {
        System.out.println(getBrand() + " " + getModel() + " (Electric Scooter) starts silently with keyless card. Battery: " + batteryPercentage + "%.");
    }
}

/**
 * Main Class to demonstrate Abstract Class concept in Java.
 */
public class Program14_AbstractVehicle {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("      JAVA ABSTRACT CLASS & METHOD DEMONSTRATION  ");
        System.out.println("==================================================\n");

        // Note: Abstract class cannot be instantiated directly:
        // Vehicle v = new Vehicle("Generic", "Vehicle"); // Error: Vehicle is abstract

        // Creating subclass objects using abstract class reference (Polymorphism)
        Vehicle myCar = new Car("Tesla", "Model 3", 4);
        Vehicle myBike = new Motorcycle("Yamaha", "MT-15", false);
        Vehicle myScooter = new ElectricScooter("Ather", "450X", 88);

        // Demonstrating Car operations
        myCar.displayInfo();
        myCar.start(); // Calls Car's implementation of start()
        myCar.stop();  // Calls Vehicle's concrete stop() method
        System.out.println("--------------------------------------------------");

        // Demonstrating Motorcycle operations
        myBike.displayInfo();
        myBike.start(); // Calls Motorcycle's implementation of start()
        myBike.stop();  // Calls Vehicle's concrete stop() method
        System.out.println("--------------------------------------------------");

        // Demonstrating Electric Scooter operations
        myScooter.displayInfo();
        myScooter.start(); // Calls ElectricScooter's implementation of start()
        myScooter.stop();  // Calls Vehicle's concrete stop() method
        System.out.println("--------------------------------------------------");

        // Demonstrating Polymorphic array execution
        System.out.println(">>> Iterating through Vehicle Fleet (Polymorphism) <<<\n");
        Vehicle[] fleet = { myCar, myBike, myScooter };

        for (Vehicle vehicle : fleet) {
            vehicle.start();
            vehicle.stop();
            System.out.println();
        }
    }
}
