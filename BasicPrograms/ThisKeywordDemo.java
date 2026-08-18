// Program to demonstrate the 'this' keyword in Java:
// 1. this(...)     : Constructor chaining (invoking current class constructor)
// 2. this.variable : Differentiating instance variables from local parameters
// 3. this.method() : Invoking current class instance method

class EmployeeThis {
    int id;
    String name;

    // No-argument constructor
    EmployeeThis() {
        this(101, "Amit");       // 1. Calls parameterized constructor of current class
    }

    // Parameterized constructor
    EmployeeThis(int id, String name) {
        this.id = id;            // 2. Refers to current object's instance variable
        this.name = name;        // 2. Refers to current object's instance variable
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee ID   : " + this.id);
        System.out.println("Employee Name : " + this.name);
    }

    // Method to call display()
    void showDetails() {
        this.display();          // 3. Calls current object's display() method
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {

        // Instantiating object using default constructor
        EmployeeThis e1 = new EmployeeThis();

        // Invoking method that uses 'this.display()'
        e1.showDetails();

    }
}


