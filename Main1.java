package random;
import java.lang.reflect.*;
import java.lang.reflect.Method;

public class Main1 {
    public void sayHelloPamu1() {
        System.out.println("Pamu");
    }
    public void sayHelloPamu2() {
        System.out.println("Pamu wala!");
    }
    public static void main(String[] args) throws Exception {
        String haBosdke="sayHello";
        Class<?> clazz = Main.class; // Main class object....
        Object instance = clazz.getDeclaredConstructor().newInstance(); // create new instance if Main using default constructor.
        haBosdke+="Pamu";
        Method method = clazz.getMethod(haBosdke+"2"); // get the method name sayHelloPamu2 from Main class.
        method.invoke(instance); // invoke method on in
    }
}