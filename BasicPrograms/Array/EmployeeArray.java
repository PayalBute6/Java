// Program to demonstrate Array of Objects in Java
class Employee {
    int id;
    String name;
    int salary;
}

public class EmployeeArray {
    public static void main(String[] args) {
        // Creating an array of 3 Employee objects
        Employee employees[] = new Employee[3];

        // Instantiating each Employee object in the array
        employees[0] = new Employee();
        employees[1] = new Employee();
        employees[2] = new Employee();

        // Assigning values to employee 1
        employees[0].id = 101;
        employees[0].name = "Amit";
        employees[0].salary = 30000;

        // Assigning values to employee 2
        employees[1].id = 102;
        employees[1].name = "Rahul";
        employees[1].salary = 35000;

        // Assigning values to employee 3
        employees[2].id = 103;
        employees[2].name = "Sneha";
        employees[2].salary = 40000;

        // Displaying details of all employees
        System.out.println("Employee Details:");
        System.out.println("=================");

        for (int i = 0; i < 3; i++) {
            System.out.println("ID: " + employees[i].id);
            System.out.println("Name: " + employees[i].name);
            System.out.println("Salary: " + employees[i].salary);
            System.out.println();
        }
    }
}
