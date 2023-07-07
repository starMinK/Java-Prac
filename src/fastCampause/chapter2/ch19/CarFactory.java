package chapter2.ch19;

public class CarFactory {
    static private CarFactory instance = new CarFactory();

    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar() {
        Car car = new Car();
        return car;
    }
}
