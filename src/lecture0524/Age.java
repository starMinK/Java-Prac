package lecture0524;

import java.util.Scanner;

public class Age {
    public static int age() {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요.");
        int age = sc.nextInt();

        return age;
    }
}
