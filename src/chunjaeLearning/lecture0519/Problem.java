package lecture0519;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("짝수입니다.");
        }else{
            System.out.println("홀수입니다.");
        }
    }
}
