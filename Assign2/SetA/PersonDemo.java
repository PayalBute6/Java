
import java.util.Scanner;

/*
 * Set A - d
 * Write a program to define class Person with data members as Personname,Aadharno, Panno. Accept 
 * information for 5 objects and display appropriate information (use this keyword). 
 */
class Person {

    String Personname;
    String Aadharno;
    String Panno;

    public Person(String personname, String aadharno, String panno) {
        this.Personname = personname;
        this.Aadharno = aadharno;
        this.Panno = panno;
    }

    public void display() {
        System.out.println("Name: " + Personname);
        System.out.println("Aadhar No: " + Aadharno);
        System.out.println("PAN No: " + Panno);
    }
}

public class PersonDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] p = new Person[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter information for Person " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Aadhar No: ");
            String aadhar = sc.nextLine();
            System.out.print("PAN No: ");
            String pan = sc.nextLine();

            p[i] = new Person(name, aadhar, pan);
        }

        System.out.println("\n--- Person Information ---");
        for (int i = 0; i < 5; i++) {
            p[i].display();
        }

        sc.close();
    }
}
