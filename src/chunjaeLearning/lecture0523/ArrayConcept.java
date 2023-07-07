package lecture0523;

public class ArrayConcept {
    public static void main(String[] args) {
        int[][] a = new int[2][3];
        a[0][0] = 100;
        a[0][1] = 100;
        a[0][2] = 100;
        a[1][0] = 100;
        a[1][1] = 100;
        a[1][2] = 100;

        System.out.println("a의 배열의 크기가 = " + a.length);
        System.out.println("a[0]의 배열의 크기가 = " + a[0].length);
        System.out.println("a[1]의 배열의 크기가 = " + a[1].length);

        int[][] score = new int[][] {
                {10,20,30},
                {10,20,30},
                {10,20,40},
                {10,20,30}
        };

        System.out.println("===========================");
        System.out.println("번호: 자바 스프링 스프링부트 총점");
        System.out.println("===========================");

        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            System.out.print((i+1) + "  :   ");
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + "    ");
                sum += score[i][j];
            }
            System.out.print(sum);
            System.out.println();
        }
        System.out.println("===========================");
    }
}