package lecture0531.exceptionSample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExsaptionSample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("put in your score");
        int score = 0;
        try {
            score = sc.nextInt();
        } catch (InputMismatchException e) {
            String str = "only int can type";
            System.out.println(str);
            return;
        }finally {
            System.out.println("error exception run completely");
        }
        switch (score) {
            case 100:
            case 90:
            case 80:
                System.out.println("A");
                break;
            case 70:
                System.out.println("B");
                break;
            default:
                System.out.println("F");
                break;
        }

    }
}
