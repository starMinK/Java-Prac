package lecture0524;

import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {
    private static ArrayList<Integer> divide(int num) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                arr.add(i);
            }
        }
        return arr;
    }

    private static int sum(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (Integer integer : arrayList) {
            sum += integer;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("약수의 정보가 궁금한 숫자를 입력하세요.");
            int num = sc.nextInt();
            ArrayList<Integer> arr = divide(num);
            System.out.print(num + "의 약수: ");
            for (Integer integer : arr) {
                System.out.print(integer + " ");
            }
            System.out.println();
            int sum = sum(arr);
            System.out.println("약수의 총 합: " + sum + "\n약수의 개수: " + arr.size());


            System.out.println("종료하시겠습니까? y/n");
            String repeat = sc.next();
            if (repeat.equals("y")) {
                System.out.println("종료됩니다.");
                System.exit(0);
            }
        }
    }
}
