package lecture0601;

import lecture0525.CircleArea1;
import lecture0525.CircleArea2;

import java.util.InputMismatchException;

public class CircleAreaException extends CircleArea1 {
    public static void main(String[] args) {
        try {
            System.out.printf("%4.2f\n", area());
            System.out.println(CircleArea2.area());
        } catch (InputMismatchException e) {
            System.out.println("only int can typed");
        }finally {
            System.out.println("Exception handling complete");
        }
    }
}
