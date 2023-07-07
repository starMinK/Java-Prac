package lecture0523;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생수를 입력하세요.");
        int student = sc.nextInt();
        int[][] score = new int[student][3];

        for (int i = 0; i < score.length; i++) {
            System.out.println(i + 1 + "번째 학생의 성적을 자바 스프링 JSP 순서대로 입력해 주세요.");
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = sc.nextInt();
            }
        }

        System.out.println("===================================");
        System.out.println("번호:\t자바\t\t스프링\tJSP\t\t총점");
        System.out.println("===================================");
        int[] sum = new int[student];
        for (int i = 0; i < score.length; i++) {
            System.out.print(i + ":\t\t");
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + "\t\t");
                sum[i] += score[i][j];
            }
            System.out.print(sum[i]);
            System.out.println();
        }
        int average = 0;
        for (int i = 0; i < sum.length; i++) {
            average += (sum[i] / 3);
        }
        System.out.println("평균: " + average / student);
    }
}
