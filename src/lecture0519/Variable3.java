package lecture0519;

class SansuStatic {
    public static final int MAN = 1;
    public static final int WOMAN = 2;
}

public class Variable3 {
    /*
    final: 상수의 경우에 데이터 수정이 불가함

    static: main영역과 field영역의 변수들끼리 데이터 공유하고자 할 때 사용한다.
    서로 다른 클래스에서 데이터를 공유하고자 할 때 사용

    클래스명.클래스변수명 : 다른 클래스에 존재하는 클래스변수의 값을 참조하고자 접근하는 방식
    */
        public final static int MEN = 3;
        public final static int WOMEN = 4;

        public static void main(String[] args) {
            int people1 = WOMEN;
            switch (people1) {
                case 3 :
                    System.out.println("남");
                    break;
                case 4:
                    System.out.println("여");
                    break;
            }

            int people2 = SansuStatic.WOMAN;
            switch (people2) {
                case 1 :
                    System.out.println("남");
                    break;
                case 2:
                    System.out.println("여");
                    break;
            }
        }
    }

