package chapter2.ch19;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car yourSonata = factory.createCar();
        Car mySonata = factory.createCar();
        Car ourSonata = factory.createCar();

        System.out.println(mySonata.getCarNum());
        System.out.println(yourSonata.getCarNum());
        System.out.println(ourSonata.getCarNum());
        System.out.println(mySonata.getCarNum());
    }
}
