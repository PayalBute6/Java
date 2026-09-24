import java.util.Scanner;

interface Department {
    String deptName = "Computer Science";
    String deptHead = "Dr. Smith";
    void printDeptAttributes();
}

class Hostel {
    String hostelName;
    String hostelLocation;
    int numberOfRooms;

    public Hostel(String name, String location, int rooms) {
        this.hostelName = name;
        this.hostelLocation = location;
        this.numberOfRooms = rooms;
    }

    public void printHostelAttributes() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}

class Student extends Hostel implements Department {
    String studentName;
    String regNo;
    String electiveSubject;
    double avgMarks;

    public Student(String hName, String hLoc, int hRooms, String sName, String regNo, String elective, double marks) {
        super(hName, hLoc, hRooms);
        this.studentName = sName;
        this.regNo = regNo;
        this.electiveSubject = elective;
        this.avgMarks = marks;
    }

    @Override
    public void printDeptAttributes() {
        System.out.println("Department: " + deptName);
        System.out.println("Department Head: " + deptHead);
    }

    public void printData() {
        System.out.println("--- Student Details ---");
        System.out.println("Name: " + studentName);
        System.out.println("Registration No: " + regNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
        printDeptAttributes();
        printHostelAttributes();
        System.out.println("-----------------------");
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        int studentCount = 0;

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Admit new student");
            System.out.println("2. Migrate a student");
            System.out.println("3. Display details of a student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String sName = scanner.nextLine();
                    System.out.print("Enter Registration No: ");
                    String regNo = scanner.nextLine();
                    System.out.print("Enter Elective Subject: ");
                    String elective = scanner.nextLine();
                    System.out.print("Enter Average Marks: ");
                    double marks = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Hostel Name: ");
                    String hName = scanner.nextLine();
                    System.out.print("Enter Hostel Location: ");
                    String hLoc = scanner.nextLine();
                    System.out.print("Enter Number of Rooms in Hostel: ");
                    int hRooms = scanner.nextInt();

                    students[studentCount++] = new Student(hName, hLoc, hRooms, sName, regNo, elective, marks);
                    System.out.println("Student admitted successfully.");
                    break;
                case 2:
                    System.out.print("Enter Registration No of student to migrate: ");
                    String migRegNo = scanner.nextLine();
                    boolean foundMig = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i].regNo.equals(migRegNo)) {
                            System.out.print("Enter New Hostel Name: ");
                            students[i].hostelName = scanner.nextLine();
                            System.out.print("Enter New Hostel Location: ");
                            students[i].hostelLocation = scanner.nextLine();
                            System.out.print("Enter New Number of Rooms: ");
                            students[i].numberOfRooms = scanner.nextInt();
                            System.out.println("Student migrated successfully.");
                            foundMig = true;
                            break;
                        }
                    }
                    if (!foundMig) System.out.println("Student not found!");
                    break;
                case 3:
                    System.out.print("Enter Registration No to search: ");
                    String searchRegNo = scanner.nextLine();
                    boolean foundSearch = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i].regNo.equals(searchRegNo)) {
                            students[i].printData();
                            foundSearch = true;
                            break;
                        }
                    }
                    if (!foundSearch) System.out.println("Student not found!");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
