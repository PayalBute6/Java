class Student {

    String name;
    int rollNo;
    int marks;

    void study() {
        System.out.println("Student is studying");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.rollNo = 101;
        s1.marks = 90;

        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.marks);

        s1.study();
    }
}