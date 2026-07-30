// Ultra-Simple Encapsulation Example

class Person {
    private String name; // 1. Hide variable with 'private'

    // 2. Getter (Read)
    public String getName() {
        return name;
    }

    // 3. Setter (Write)
    public void setName(String newName) {
        this.name = newName;
    }
}

public class SimpleEncapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Rahul");
        System.out.println("Name is: " + p.getName());
    }
}
