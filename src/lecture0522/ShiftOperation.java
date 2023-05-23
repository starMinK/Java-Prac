package lecture0522;

import java.util.Scanner;

public class ShiftOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type to shift");
        int x = sc.nextInt();
        int result = x << 3; //쉬프트 연산: x * (2^3)
        System.out.println("shift << 3 bit : " + result);   //100 * 2^3 == 800
    }
}
