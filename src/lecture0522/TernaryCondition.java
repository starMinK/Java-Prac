package lecture0522;

import java.util.Scanner;

public class TernaryCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("put first int");
        int x1 = sc.nextInt();
        System.out.println("put second int");
        int y1 = sc.nextInt();

        String result = x1 > y1 ? "first int > second int" : "first int < second int";
        System.out.println(result);
    }
}
