package lecture0601;
/*
 * 문제
 * 7개의 데이터를 입력 받아서 숫자중에서 음수와 양수를 구분하여 출력하세요.
 *
 * 조건
 * 1. 배열 적용
 * 2. 예외처리 적용
 * 3. 음수인 경우 다음 데이터 읽기로 이동*/

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        int positiveSum = 0;
        int positiveCount = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + "번 째 정수를 입력하세요.");
            try {
                int input = sc.nextInt();
                array[i] = input;
                if (input < 0) {
                    System.out.println("음수입니다. 다음 데이터를 입력받습니다.");
                    continue;
                }
                positiveSum += input;
                positiveCount++;
            } catch (InputMismatchException e) {
                System.out.println("정수만 입력해주세요. 메서드를 종료합니다.");
                return;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("알수없는 에러입니다. 메서드를 종료합니다.");
                return;
            }
        }

        System.out.println("입력된 데이터: " + Arrays.toString(array));
        System.out.println("양수의 합계: " + positiveSum);
        System.out.println("양수의 갯수: " + positiveCount);
    }
}
