class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}
class Driver {
    int license_no, age;
    String name, address;
    Driver(int l, String n, String addr, int a) throws AgeException {
        if (a < 18) {
            throw new AgeException("Age is below 18 years");
        }
        license_no = l;
        name = n;
        address = addr;
        age = a;
        System.out.println("Driver " + name + " created successfully.");
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            Driver d1 = new Driver(123, "Raju", "Pune", 16);
        } catch (AgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}