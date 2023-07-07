package lecture0524;

import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {
        Caladder add = new Caladder();
        Scanner sc = new Scanner(System.in);
        System.out.println("계산할 두 수를 입력하세요.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(add.adder(num1, num2));
    }
}
