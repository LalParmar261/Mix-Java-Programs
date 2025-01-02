package random;

import java.lang.reflect.Constructor;

class Car {
    private String model="Toyota Corolla";
    private Car(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Car.class;
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class);
        constructor.setAccessible(true); // Bypass private access
        Car car = (Car) constructor.newInstance("callMethod");
        System.out.println("Car model: " + car.getModel());
    }
}