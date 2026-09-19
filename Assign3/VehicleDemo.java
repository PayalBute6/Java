import java.util.Scanner;

class BaseVehicle {
    String company;
    double price;

    public BaseVehicle(String company, double price) {
        this.company = company;
        this.price = price;
    }

    public void display() {
        System.out.println("Company: " + company + " | Price: " + price);
    }
}

class LightMotorVehicle extends BaseVehicle {
    double mileage;

    public LightMotorVehicle(String company, double price, double mileage) {
        super(company, price);
        this.mileage = mileage;
    }

    @Override
    public void display() {
        System.out.print("[LMV] ");
        super.display();
        System.out.println("Mileage: " + mileage + " kmpl");
    }
}

class HeavyMotorVehicle extends BaseVehicle {
    double capacityInTons;

    public HeavyMotorVehicle(String company, double price, double capacityInTons) {
        super(company, price);
        this.capacityInTons = capacityInTons;
    }

    @Override
    public void display() {
        System.out.print("[HMV] ");
        super.display();
        System.out.println("Capacity: " + capacityInTons + " tons");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        BaseVehicle[] vehicles = new BaseVehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nVehicle " + (i + 1));
            System.out.print("Enter type of vehicle (1 for LMV, 2 for HMV): ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Company Name: ");
            String company = sc.nextLine();
            
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            if (type == 1) {
                System.out.print("Enter Mileage (kmpl): ");
                double mileage = sc.nextDouble();
                vehicles[i] = new LightMotorVehicle(company, price, mileage);
            } else if (type == 2) {
                System.out.print("Enter Capacity (tons): ");
                double capacity = sc.nextDouble();
                vehicles[i] = new HeavyMotorVehicle(company, price, capacity);
            } else {
                System.out.println("Invalid type, defaulting to base vehicle.");
                vehicles[i] = new BaseVehicle(company, price);
            }
        }

        System.out.println("\n--- Vehicle Information ---");
        for (int i = 0; i < n; i++) {
            vehicles[i].display();
            System.out.println();
        }

        sc.close();
    }
}
