// 9. A car manufacturing company models a Car class that internally contains an Engine as a
// static nested class, since the engine specification does not depend on a specific car object.
// Write a Java program to implement this.
public class Car {
    String model;
    Engine engine;
    Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType);
    }
    void display() {
        System.out.println("Car Model: " + model);
        engine.display();
    }
    static class Engine {
        String type;
        Engine(String type) {
            this.type = type;
        }
        void display() {
            System.out.println("Engine Type: " + type);
        }
    }
    public static void main(String[] args) {
        Car car1 = new Car("Sedan", "V6");
        Car car2 = new Car("SUV", "V8");
        car1.display();
        car2.display();
    }
}
