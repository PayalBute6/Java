import java.util.Scanner;

public class PersonDemo {

    // Define the Person class
    static class Person {
        String personName;
        String aadharNo;
        String panNo;

        // Constructor using the "this" keyword to differentiate between 
        // instance variables and parameters
        public Person(String personName, String aadharNo, String panNo) {
            this.personName = personName;
            this.aadharNo = aadharNo;
            this.panNo = panNo;
        }

        // Method to display person details using "this" keyword
        public void display() {
            System.out.println("Name      : " + this.personName);
            System.out.println("Aadhar No : " + this.aadharNo);
            System.out.println("PAN No    : " + this.panNo);
            System.out.println("------------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Array to store 5 Person objects
        Person[] people = new Person[5];

        System.out.println("--- Enter Details for 5 Persons ---");
        
        // Loop to accept information for 5 objects
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEntering details for Person " + (i + 1) + ":");
            
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter Aadhar Number: ");
            String aadhar = sc.nextLine();
            
            System.out.print("Enter PAN Number: ");
            String pan = sc.nextLine();
            
            // Create a new Person object and store it in the array
            people[i] = new Person(name, aadhar, pan);
        }

        // Display all the collected information
        System.out.println("\n\n--- Displaying Person Information ---");
        System.out.println("------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("Person " + (i + 1) + " Details:");
            people[i].display();
        }

        sc.close();
    }
}
