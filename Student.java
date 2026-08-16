import java.util.Scanner;

class Student
{
    int rollNo;
    String name;
    double marks;

    void display()
    {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        System.out.print("Enter Roll No: ");
        s1.rollNo = sc.nextInt();

        System.out.print("Enter Name: ");
        s1.name = sc.next();

        System.out.print("Enter Marks: ");
        s1.marks = sc.nextDouble();

        s1.display();
    }
}
