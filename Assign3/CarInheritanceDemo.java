class Vehicle {
    String make;
    String model;
    int year;
    
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public void displayVehicleInfo() {
        System.out.println("Vehicle Make: " + make);
        System.out.println("Vehicle Model: " + model);
        System.out.println("Vehicle Year: " + year);
    }
}

class Car extends Vehicle {
    int numberOfDoors;
    
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }
    
    public void displayCarInfo() {
        displayVehicleInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

public class CarInheritanceDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2022, 4);
        System.out.println("--- Car Details ---");
        myCar.displayCarInfo();
    }
}
