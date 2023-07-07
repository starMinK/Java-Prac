package lecture0519;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = 3000;
        int sum = 0;
        int i = 0;

        while (sum <= end) {
            i++;
            sum += i;
        }
        System.out.println(sum + "입니다.");
        System.out.println(i + "입니다.");

        sum = 0;
        for (int j = 0; true; j++) {
            sum += j;
            if (sum > end) {
                System.out.println(sum);
                System.out.println(j);
                break;
            }
        }

        sum = 0;
        try {
            System.out.println("시작 숫자를 입력하세요: ");
            i = sc.nextInt();
            System.out.println("종료 제한을 입력하세요: ");
            end = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
            System.exit(0);
        }

        do {
            i++;
            sum += i;
        } while (sum < end);
        System.out.println(sum);
        System.out.println(i);
    }
}
