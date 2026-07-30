// Ultra-Simple Abstraction Example

// 1. Abstract Class (Hides HOW things work)
abstract class Animal {
    abstract void makeSound(); // No body, just the method name!
}

// 2. Child Class (Provides the actual code)
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks!");
    }
}

public class SimpleAbstraction {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();
    }
}
