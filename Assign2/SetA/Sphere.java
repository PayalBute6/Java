import java.util.Scanner;

/*
 * Set A - e
 * Create a class Sphere, to calculate the volume and surface area of the sphere. 
 * (Hint : Surface area=4*3.14(r*r), Volume=(4/3)3.14(r*r*r)) 
 */

class Sphere {
    double radius;
    final double PI = 3.14;

    Sphere(double radius) {
        this.radius = radius;
    }

    double calculateSurfaceArea() {
        return 4 * PI * (radius * radius);
    }

    double calculateVolume() {
        return (4.0 / 3.0) * PI * (radius * radius * radius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double r = sc.nextDouble();

        Sphere sphere = new Sphere(r);
        
        System.out.println("Surface Area: " + sphere.calculateSurfaceArea());
        System.out.println("Volume: " + sphere.calculateVolume());
        
        sc.close();
    }
}
