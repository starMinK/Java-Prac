package lecture0523;

import java.util.Scanner;

public class ScoreArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] score = new int[3][5];

        for (int i = 0; i < score.length; i++) {
            System.out.println(i + 1 + "번째 학생의 성적을 국, 수, 사, 과, 영 순대로 입력해 주세요.");
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = sc.nextInt();
            }
        }

        System.out.println("============================");
        System.out.println("번호: 국어 수학 사회 과학 영어 총점");
        System.out.println("============================");
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + "   ");
                sum += score[i][j];
            }
            System.out.print(sum);
            System.out.println();
        }
    }
}
