package lecture0519;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            num = sc.nextInt();

            if (num < 0) {
                System.out.println("음수입니다. 다시 입력해주세요.");
                continue;
            }

            if (num % 2 == 0) {
                System.out.println("짝수입니다. 실행을 종료합니다.");
            } else {
                System.out.println("홀수입니다. 실행을 종료합니다.");
            }
        } while (num < 0);
    }
}
