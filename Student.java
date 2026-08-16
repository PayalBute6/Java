class Student
{
    private int rollNo = 101;
    String name = "Amit";       // default
    protected int marks = 80;
    public String college = "ABC College";

    void display()
    {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("College: " + college);
    }

    public static void main(String[] args)
    {
        Student s = new Student();

        s.display();

        System.out.println(s.name);
        System.out.println(s.marks);
        System.out.println(s.college);

        // System.out.println(s.rollNo); // Error: private
    }
}
