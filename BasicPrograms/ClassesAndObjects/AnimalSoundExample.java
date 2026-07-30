// Simple & Classic Example of Run-time Polymorphism (Method Overriding)

// Step 1: Parent Class
class Animal {
    void makeSound() {
        System.out.println("Generic sound");
    }
}

// Step 2: Child Class 1 (Dog overrides makeSound)
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Step 3: Child Class 2 (Cat overrides makeSound)
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

// Step 4: Main Class
public class AnimalSoundExample {
    public static void main(String[] args) {
        // Parent class reference variable
        Animal myAnimal;

        // 1. Assigning Dog object to Animal reference
        myAnimal = new Dog();
        myAnimal.makeSound(); // At RUNTIME, Dog's makeSound() runs

        // 2. Assigning Cat object to Animal reference
        myAnimal = new Cat();
        myAnimal.makeSound(); // At RUNTIME, Cat's makeSound() runs
    }
}
