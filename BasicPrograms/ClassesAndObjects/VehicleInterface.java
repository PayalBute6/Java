// Abstraction using Interface Example

// 1. Interface definition
interface VehicleInterfaceDemo {
    void start(); // Abstract method (implicitly public abstract)

    // Default method (Java 8+) allows interface to provide default implementation
    default void stop() {
        System.out.println("Vehicle stopped");
    }
}

// 2. Implementation Classes using 'implements' keyword
class CarInterfaceImpl implements VehicleInterfaceDemo {
    @Override
    public void start() { // Interface methods must be 'public' when implemented
        System.out.println("Car started");
    }
}

class BikeInterfaceImpl implements VehicleInterfaceDemo {
    @Override
    public void start() {
        System.out.println("Bike started");
    }
}

class BusInterfaceImpl implements VehicleInterfaceDemo {
    @Override
    public void start() {
        System.out.println("Bus started");
    }
}

// Entry Point Class matching filename VehicleInterface.java
public class VehicleInterface {
    public static void main(String[] args) {
        // =========================================================================
        // APPROACH 1: Using Interface Reference Variable (Upcasting / Polymorphism)
        // =========================================================================
        // An interface reference variable 'v' can hold any object implementing VehicleInterfaceDemo.
        VehicleInterfaceDemo v;

        v = new CarInterfaceImpl();
        v.start();
        v.stop();

        v = new BikeInterfaceImpl();
        v.start();
        v.stop();

        v = new BusInterfaceImpl();
        v.start();
        v.stop();

        /*
         * =========================================================================
         * ALTERNATIVE APPROACHES (If we don't use an interface reference variable):
         * =========================================================================
         * 
         * 1. Using Child-Specific Reference Variables:
         * --------------------------------------------
         * CarInterfaceImpl c = new CarInterfaceImpl();
         * c.start();
         * c.stop();
         * 
         * BikeInterfaceImpl b = new BikeInterfaceImpl();
         * b.start();
         * b.stop();
         * 
         * BusInterfaceImpl bus = new BusInterfaceImpl();
         * bus.start();
         * bus.stop();
         * 
         * 2. Using Polymorphic Array (Best Practice with Interface Reference):
         * ---------------------------------------------------------------------
         * VehicleInterfaceDemo[] fleet = { 
         *     new CarInterfaceImpl(), 
         *     new BikeInterfaceImpl(), 
         *     new BusInterfaceImpl() 
         * };
         * for (VehicleInterfaceDemo vehicle : fleet) {
         *     vehicle.start();
         *     vehicle.stop();
         * }
         */
    }
}
