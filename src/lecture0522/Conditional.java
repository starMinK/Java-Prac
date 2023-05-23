package lecture0522;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
       /* if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
        */
        /*String score2 = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : "F";
        System.out.println(score2);*/

        switch (score/10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}
