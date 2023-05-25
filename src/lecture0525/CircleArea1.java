package lecture0525;

import java.util.Scanner;

public class CircleArea1 {
    static Scanner sc = new Scanner(System.in);
    public static double area() {
        double r = sc.nextDouble();
        return r * r * Math.PI;
    }
}