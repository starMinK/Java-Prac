package lecture0525;

import java.util.Scanner;

public class CircleArea2 {
    static Scanner sc = new Scanner(System.in);
    public static double area() {
        double r = sc.nextDouble();
        return Math.pow(r, 2) * Math.PI;
    }
}
