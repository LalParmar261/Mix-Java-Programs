package casting;

public class Upcasting {
	public static void main(String[] args) {
        Dog myDog = new Dog();
        Animal myAnimal = myDog; // Upcasting
        myAnimal.eat(); // Works fine, calls the method from Animal class
        // myAnimal.bark(); // Error: Cannot call bark() on Animal reference
    }
}
class Animal {
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

