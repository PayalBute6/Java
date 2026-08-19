class Student { 
    int roll; 
    String name; 
    
    // Parameterless Constructor 
    Student() { 
        roll = 0; 
        name = "Unknown"; 
    } 
    
    // Parameterized Constructor 
    Student(int r, String n) { 
        roll = r; 
        name = n; 
    } 
    
    void display() { 
        System.out.println("Roll: " + roll + ", Name: " + name); 
    } 
} 

public class ConstructorExample { 
    public static void main(String[] args) { 
        Student s1 = new Student();               // Calls parameterless constructor 
        Student s2 = new Student(101, "Prashant"); // Calls parameterized constructor 

        s1.display(); 
        s2.display(); 
    } 
}
