// Parent class (Super class)
class Animal {
    String name;

    public void eat() {
        System.out.println(name + " is eating...");
    }

    public void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

// Child class (Subclass) that inherits from Animal
class Dog extends Animal {
    String breed;

    public void bark() {
        System.out.println(name + " is barking!");
    }
}

// Another Child class
class Cat extends Animal {
    public void meow() {
        System.out.println(name + " is meowing!");
    }
}

// Main class to run the program
public class InheritanceExample {
    public static void main(String[] args) {
        // Dog object
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.breed = "Golden Retriever";
        dog.eat();   // inherited method
        dog.sleep(); // inherited method
        dog.bark();  // Dog's own method

        System.out.println();

        // Cat object
        Cat cat = new Cat();
        cat.name = "Whiskers";
        cat.eat();   // inherited method
        cat.sleep(); // inherited method
        cat.meow();  // Cat's own method
    }
}
