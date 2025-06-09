abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();
    }
}
