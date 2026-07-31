abstract class VehicleDemo {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends VehicleDemo {
    @Override
    void start() {
        System.out.println("Car started");
    }
}

class Bike extends VehicleDemo {
    @Override
    void start() {
        System.out.println("Bike started");
    }
}

class Bus extends VehicleDemo {
    @Override
    void start() {
        System.out.println("Bus started");
    }
}

// Public class matching filename VehicleAbstract.java (Entry Point)
public class VehicleAbstract {
    public static void main(String[] args) {
        // =========================================================================
        // APPROACH 1: Using Parent Class Reference Variable (Upcasting / Polymorphism)
        // =========================================================================
        // A single parent reference variable 'v' can hold any object extending VehicleDemo.
        VehicleDemo v;

        v = new Car();
        v.start();
        v.stop();

        v = new Bike();
        v.start();
        v.stop();

        v = new Bus();
        v.start();
        v.stop();

        /*
         * =========================================================================
         * ALTERNATIVE APPROACHES (If we don't use a parent reference variable):
         * =========================================================================
         * 
         * 1. Using Child-Specific Reference Variables:
         * --------------------------------------------
         * Car c = new Car();
         * c.start();
         * c.stop();
         * 
         * Bike b = new Bike();
         * b.start();
         * b.stop();
         * 
         * Bus bus = new Bus();
         * bus.start();
         * bus.stop();
         * 
         * Note: Each reference variable is locked to its specific child type. 
         * You cannot reassign 'c = new Bike();' (type mismatch error).
         * 
         * 2. Using Anonymous Objects (No variable at all):
         * ------------------------------------------------
         * new Car().start();
         * new Car().stop(); // Note: Creates a 2nd new object instance in memory!
         * 
         * 3. Using Polymorphic Array (Best Practice with Parent Reference):
         * -----------------------------------------------------------------
         * VehicleDemo[] fleet = { new Car(), new Bike(), new Bus() };
         * for (VehicleDemo vehicle : fleet) {
         *     vehicle.start();
         *     vehicle.stop();
         * }
         */
    }
}