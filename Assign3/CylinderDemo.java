interface Operation {
    double PI = 3.142; // constant
    void area();
    void volume();
}

class Cylinder implements Operation {
    double radius;
    double height;
    
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    @Override
    public void area() {
        double area = 2 * PI * radius * (radius + height);
        System.out.println("Surface Area of Cylinder: " + area);
    }
    
    @Override
    public void volume() {
        double vol = PI * radius * radius * height;
        System.out.println("Volume of Cylinder: " + vol);
    }
}

public class CylinderDemo {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(5.0, 10.0);
        System.out.println("Cylinder with Radius 5.0 and Height 10.0:");
        cyl.area();
        cyl.volume();
    }
}
