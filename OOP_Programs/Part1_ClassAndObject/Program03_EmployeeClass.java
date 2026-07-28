package Part1_ClassAndObject;

class Employee {
    String name;
    int id;
    double salary;

    void showDetails() {
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Monthly Salary: $" + salary);
        System.out.println("Annual Salary : $" + (salary * 12));
        System.out.println("-----------------------------------");
    }
}

public class Program03_EmployeeClass {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 501;
        emp1.name = "Alice Smith";
        emp1.salary = 6500.00;

        Employee emp2 = new Employee();
        emp2.id = 502;
        emp2.name = "Bob Johnson";
        emp2.salary = 7200.00;

        System.out.println("=== Employee Details ===");
        emp1.showDetails();
        emp2.showDetails();
    }
}
