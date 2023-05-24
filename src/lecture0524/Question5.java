package lecture0524;

/*2개의 숫자를 입력받아서 가감승제산 (메소드 이용)을 하는 프로그램을 작성.
 * 조건:
 *   부모 클래스 = 두수를 입력받아서 가감승제를 하는 클래스
 *   자식 클래스 = 가감승제산 메소드를 호출하여, 결과를 출력하는 클래스
 *   상속을 이용한 프로그램을 작성
 *   가금승제산 메소드
 *   ----------------
 *      클래스
 *   덧셈: Caladder();
 *   뺄샘: Calsuber();
 *   곱셈: Calmuler();
 *   나눗셈 몫: Caldiver1();
 *   나눗셈 나머지: Caldiver2();
 * ------------------
 *      메서드
 *   덧셈: adder();
 *   뺄샘: suber();
 *   곱셈: muler();
 *   나눗셈 몫: diver1();
 *   나눗셈 나머지: diver2();
 *   ------------------
 *   상속을 활용하라.
 * */

import java.util.Scanner;

public class Question5 extends Caladder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계산할 두 수를 입력하세요.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + adder(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + suber(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + muler(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + diver1(num1, num2));
        System.out.println(num1 + " % " + num2 + " = " + diver2(num1, num2));
    }
}
