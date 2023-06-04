package lecture0530;

import java.util.Scanner;

public class InterfaceAdderSample implements CalAdder, CalSuber, CalMuler {
    public static void main(String[] args) {
        InterfaceAdderSample si = new InterfaceAdderSample();
        try {
            si.adder();
            System.out.println("=====================================");
            si.suber();
            System.out.println("=====================================");
            si.muler();
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다: " + e.getMessage());
        }
    }

    @Override
    public void adder() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("첫 번째 숫자를 입력하세요.");
            int x = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요.");
            int y = sc.nextInt();
            System.out.println("덧셈의 결과: " + (x + y));
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다: " + e.getMessage());
        }
    }

    @Override
    public void suber() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("첫 번째 숫자를 입력하세요.");
            int x = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요.");
            int y = sc.nextInt();
            System.out.println("뺄셈의 결과: " + (x - y));
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다: " + e.getMessage());
        }
    }

    @Override
    public void muler() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("첫 번째 숫자를 입력하세요.");
            int x = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요.");
            int y = sc.nextInt();
            System.out.println("곱셈의 결과: " + (x * y));
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다: " + e.getMessage());
        }
    }
}
