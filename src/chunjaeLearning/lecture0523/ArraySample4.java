package lecture0523;

import java.util.Scanner;

public class ArraySample4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 길이를 입력: ");
        int num = sc.nextInt();
        float[] a = new float[num];
        float sum = 0;

        System.out.println(num + "개의 데이터를 입력: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextFloat();
            sum += a[i];
        }
        System.out.printf("합계: %5.2f \n\n", sum);

        System.out.print("찾으시는 점수를 입력해주세요.\n" +
                "현재 검색 가능한 점수들: ");
        for (float v : a) {
            System.out.print(v + " ");
        }
        System.out.println();

        float searchNum;
        do {
            searchNum = sc.nextFloat();
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                if (searchNum == a[i]) {
                    count++;
                    if (count > 0) {
                        System.out.println(searchNum + "은(는) " + i + "번째에 위치하고 있습니다.");
                    }else{
                        System.out.println("입력하신 수는 배열에 없습니다.");
                    }
                } else if (searchNum == 0) {
                    System.out.println("종료합니다.");
                    break;
                }
            }
        } while (searchNum != -0);
    }
}
