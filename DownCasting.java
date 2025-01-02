package casting;

public class DownCasting {
	public static void main(String[] args) {
        Animal1 myAnimal = new Dog1(); // Upcasting
        Dog1 myDog = (Dog1) myAnimal; // Downcasting
        myDog.bark(); // Works fine, calls the method from Dog class

        // Unsafe downcast example
        Animal1 anotherAnimal = new Animal1();
        // Dog anotherDog = (Dog) anotherAnimal; // Runtime error: ClassCastException
    }
}
class Animal1 {
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Dog1 extends Animal1 {
    public void bark() {
        System.out.println("Dog barks");
    }
}

