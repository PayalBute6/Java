class Employee {
    int id;
    String name;
    String deptname;
    double salary;

    // Static member to count objects
    static int count = 0;

    // Default Constructor
    Employee() {
        this.id = 0;
        this.name = "Unknown";
        this.deptname = "None";
        this.salary = 0.0;
        count++;
    }

    // Parameterized Constructor using 'this' keyword
    Employee(int id, String name, String deptname, double salary) {
        this.id = id;
        this.name = name;
        this.deptname = deptname;
        this.salary = salary;
        count++;
    }

    // Static method without return value
    static void displayCount() {
        System.out.println("Object count: " + count);
    }

    // Method to display object contents
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Dept: " + deptname + ", Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Prashant", "IT", 55000);
        Employee.displayCount();

        Employee e2 = new Employee(102, "Rahul", "HR", 60000);
        Employee.displayCount();

        Employee e3 = new Employee(103, "Priya", "Finance", 65000);
        Employee.displayCount();

        System.out.println();
        e1.display();
        e2.display();
        e3.display();
    }
}
