package lecture0524;
/*이름과 나이를 입력하여 출력하는 프로그램을 작성
* 조건 : 부모클래스: Age, Age의 역할: 나이를 입력받아서 반환하는 클래스
*       자식클래스: Question4, 이름을 입력받아서, 이름과 나이를 출력
* <상속을 이용하여 문제를 풀어라!!!>*/

import java.util.Scanner;

/*class Age {
    public static int age() {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요.");
        int age = sc.nextInt();

        return age;
    }
}*/

//          child class <-상속  parents class
public class Question4 extends Age{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요.");
        String name = sc.next();

//        Age a = new Age();
        int old = age();
        System.out.println(name + "님의 나이는 " + old + "살 입니다.");
    }
}
