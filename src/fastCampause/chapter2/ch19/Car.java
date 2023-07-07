package chapter2.ch19;

public class Car {
    private static int carNum = 10000;
    private int ownCarNum;

    public Car() {
        carNum++;
        ownCarNum = carNum;
    }

    public int getCarNum() {
        return ownCarNum;
    }
}
