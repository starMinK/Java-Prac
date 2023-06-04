package lecture0519;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            try {
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
                break;
            } catch (InputMismatchException e) {
                System.out.println("올바른 정수를 입력해주세요.");
                sc.nextLine(); // 입력 버퍼 비우기
            }
        }
    }
}
