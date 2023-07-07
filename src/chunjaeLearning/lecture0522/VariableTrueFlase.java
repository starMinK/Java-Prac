package lecture0522;

import java.util.Scanner;

public class VariableTrueFlase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("put in num1");
        int x = sc.nextInt();
        System.out.println("put in num2");
        int y = sc.nextInt();

        boolean result = x > y;
        System.out.println("Boolean = " + result);

        int z = 35;
        if (z % 2 == 1) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

        boolean res = z % 2 == 0;
        System.out.println(res);
    }
}
