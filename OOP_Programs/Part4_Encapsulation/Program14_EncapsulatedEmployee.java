package Part4_Encapsulation;

class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor initializing employee
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        setSalary(salary);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter with negative salary protection logic
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
            System.out.println("Salary updated successfully to $" + salary);
        } else {
            System.out.println("Error: Negative salary ($" + salary + ") is rejected!");
        }
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Employee ID    : " + id);
        System.out.println("Employee Name  : " + name);
        System.out.println("Monthly Salary : $" + salary);
        System.out.println("-----------------------------------");
    }
}

public class Program14_EncapsulatedEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Siddharth Verma", 5500.00);
        emp.displayDetails();

        System.out.println("--- Testing Valid Salary Increase ---");
        emp.setSalary(6200.00);
        emp.displayDetails();

        System.out.println("--- Testing Negative Salary Rejection ---");
        emp.setSalary(-1200.00);

        System.out.println("\nPreserved Salary via getter: $" + emp.getSalary());
    }
}
