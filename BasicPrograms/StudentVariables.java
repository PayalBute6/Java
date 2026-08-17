class StudentVariables {

    // Instance Variable: Unique to each object (s1 has its own copy, s2 has its own copy)
    int rollNo = 101;

    // Static Variable: Shared common memory location across ALL objects of the class
    static String college = "HRM";

    // Final Variable: A constant variable whose value cannot be changed after initialization
    final String COUNTRY = "India";

    // Method to display student details
    void display() {
        // Local Variable: Declared inside method
        String name = "Rahul";

        System.out.println("Roll Number  : " + rollNo);   // Instance Variable
        System.out.println("College      : " + college);  // Static Variable
        System.out.println("Country      : " + COUNTRY);  // Final Variable
        System.out.println("-----------------------------------");
    }

    // Main method: Entry point of the Java program
    public static void main(String[] args) {

        // Object 1 Creation
        StudentVariables s1 = new StudentVariables();
        s1.rollNo = 101; // s1 gets its own rollNo = 101

        // Object 2 Creation
        StudentVariables s2 = new StudentVariables();
        s2.rollNo = 102; // s2 gets its own separate rollNo = 102

        System.out.println("=== Student 1 Details ===");
        s1.display();

        System.out.println("=== Student 2 Details ===");
        s2.display();

        // Demonstration: Changing static variable 'college' affects BOTH objects!
        System.out.println(">>> Changing static college name to 'IIT' <<<\n");
        StudentVariables.college = "IIT";

        System.out.println("s1's College : " + s1.college); // Output: IIT
        System.out.println("s2's College : " + s2.college); // Output: IIT
    }
}
