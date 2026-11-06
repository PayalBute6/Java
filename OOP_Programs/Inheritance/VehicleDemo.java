
import java.util.Scanner;

public class VehicleDemo {

    static class Vehicle {
        String company;
        int price;

        void displayVehicle() {
            System.out.println("Company: " + company);
            System.out.println("Price  : " + price);
        }
    }

    static class Car extends Vehicle {
        String model;
        int seats;

        void displayCar() {
            displayVehicle();
            System.out.println("Model  : " + model);
            System.out.println("Seats  : " + seats);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Car c = new Car();

        System.out.print("Enter company: ");
        c.company = sc.nextLine();

        System.out.print("Enter price: ");
        c.price = sc.nextInt();
        sc.nextLine(); // Consume newline leftover from nextInt()

        System.out.print("Enter model: ");
        c.model = sc.nextLine();

        System.out.print("Enter number of seats: ");
        c.seats = sc.nextInt();

        System.out.println("\nVehicle Information:");
        c.displayCar();

        sc.close();
    }
}

