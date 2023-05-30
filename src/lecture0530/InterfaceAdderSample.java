package lecture0530;

import java.util.Scanner;

public class InterfaceAdderSample implements CalAdder, CalSuber, CalMuler  {
    public static void main(String[] args) {
        //Interface 이기 때문에 객체 생성이 불가능하다.
        //CalAdder ca = new CalAdder();
        //ca.adder();

        InterfaceAdderSample si = new InterfaceAdderSample();
        si.adder();
        System.out.println("=====================================");
        si.suber();
        System.out.println("=====================================");
        si.muler();
    }

    @Override
    public void adder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요.");
        int x = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요.");
        int y = sc.nextInt();
        System.out.println("덧셈의 결과: " + (x + y));
    }

    @Override
    public void suber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요.");
        int x = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요.");
        int y = sc.nextInt();
        System.out.println("뺄셈의 결과: " + (x - y));
    }

    @Override
    public void muler() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요.");
        int x = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요.");
        int y = sc.nextInt();
        System.out.println("곱셈의 결과: " + (x * y));
    }
}
