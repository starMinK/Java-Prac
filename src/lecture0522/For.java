package lecture0522;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type num to repeat time: ");

        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.println(i + ": repeat");
        }
    }
}
