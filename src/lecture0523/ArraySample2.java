package lecture0523;

import java.util.Scanner;

public class ArraySample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 길이를 입력: ");
        int num = sc.nextInt();
        int[] a = new int[num];
        int sum = 0;

        System.out.println(num + "개의 데이터를 입력: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println("합계: " + sum);
    }
}
