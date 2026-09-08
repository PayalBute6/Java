import java.util.Scanner;

/**
 * Simple inheritance demo: Vehicle (super class) and two subclasses – LightMotorVehicle and HeavyMotorVehicle.
 * The program asks for the number of vehicles, then for each vehicle asks its type (L/H) and the relevant data.
 * Finally it prints a concise table of the entered information.
 */
public class VehicleDemo {
    /** Super class containing basic vehicle details. */
    class Vehicle {
        String company;
        double price;
        Vehicle(String company, double price) {
            this.company = company;
            this.price = price;
        }
        void displayHeader() {
            System.out.printf("%-15s %-10s %-12s %-12s%n", "Company", "Price", "Mileage", "Capacity");
        }
        void displayRow() {
            System.out.printf("%-15s %-10.2f %-12s %-12s%n", company, price, "-", "-");
        }
    }
    class LightMotorVehicle extends Vehicle {
        double mileage;
        LightMotorVehicle(String company, double price, double mileage) {
            super(company, price);
            this.mileage = mileage;
        }
        @Override
        void displayRow() {
            System.out.printf("%-15s %-10.2f %-12.2f %-12s%n", company, price, mileage, "-");
        }
    }
    static class HeavyMotorVehicle extends Vehicle {
        double capacity;
        HeavyMotorVehicle(String company, double price, double capacity) {
            super(company, price);
            this.capacity = capacity;
        }
        @Override
        void displayRow() {
            System.out.printf("%-15s %-10.2f %-12s %-12.2f%n", company, price, "-", capacity);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vehicles: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        Vehicle[] vehicles = new Vehicle[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nVehicle " + (i + 1) + ":");
            System.out.print("Type (L for Light, H for Heavy): ");
            String type = sc.nextLine().trim().toUpperCase();
            System.out.print("Company: ");
            String company = sc.nextLine().trim();
            System.out.print("Price: ");
            double price = Double.parseDouble(sc.nextLine().trim());
            if (type.equals("L")) {
                System.out.print("Mileage: ");
                double mileage = Double.parseDouble(sc.nextLine().trim());
                vehicles[i] = new LightMotorVehicle(company, price, mileage);
            } else if (type.equals("H")) {
                System.out.print("Capacity (tons): ");
                double capacity = Double.parseDouble(sc.nextLine().trim());
                vehicles[i] = new HeavyMotorVehicle(company, price, capacity);
            } else {
                System.out.println("Invalid type – skipping entry.");
                i--;
            }
        }
        System.out.println("\n=== Vehicle Information ===");
        if (n > 0) vehicles[0].displayHeader();
        for (Vehicle v : vehicles) {
            v.displayRow();
        }
        sc.close();
    }
}