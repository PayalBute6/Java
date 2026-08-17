import java.util.Scanner;

/**
 * Class representing a Doctor with details like Doctor ID, Name, and Specialization.
 */
class Doctor {
    // Data members
    private int doctorId;
    private String doctorName;
    private String doctorSpecialization;

    // Default Constructor
    public Doctor() {
    }

    // Parameterized Constructor
    public Doctor(int doctorId, String doctorName, String doctorSpecialization) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.doctorSpecialization = doctorSpecialization;
    }

    // Getters and Setters
    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSpecialization() {
        return doctorSpecialization;
    }

    public void setDoctorSpecialization(String doctorSpecialization) {
        this.doctorSpecialization = doctorSpecialization;
    }

    /**
     * Accepts Doctor details from the user using Scanner.
     */
    public void acceptData(Scanner sc) {
        System.out.print("Enter Doctor ID: ");
        this.doctorId = sc.nextInt();
        sc.nextLine(); // Consume newline character

        System.out.print("Enter Doctor Name: ");
        this.doctorName = sc.nextLine();

        System.out.print("Enter Doctor Specialization: ");
        this.doctorSpecialization = sc.nextLine();
    }

    /**
     * Displays Doctor details in tabular row format.
     */
    public void displayData() {
        System.out.printf("%-12d %-25s %-25s\n", doctorId, doctorName, doctorSpecialization);
    }
}

/**
 * Main class to instantiate an array of Doctor objects, accept input for 'n' objects, and display them.
 */
public class DoctorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of doctors (n): ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline character

        // Creating array of Doctor objects
        Doctor[] doctors = new Doctor[n];

        // Input data for 'n' doctor objects
        System.out.println("\n--- Enter Details for " + n + " Doctors ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nDoctor #" + (i + 1) + ":");
            doctors[i] = new Doctor(); // Instantiating individual object
            doctors[i].acceptData(sc);
        }

        // Display details of 'n' doctor objects
        System.out.println("\n=================================================================");
        System.out.println("                      DOCTOR DETAILS LIST                        ");
        System.out.println("=================================================================");
        System.out.printf("%-12s %-25s %-25s\n", "Doctor ID", "Doctor Name", "Specialization");
        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            doctors[i].displayData();
        }
        System.out.println("=================================================================");

        sc.close();
    }
}
