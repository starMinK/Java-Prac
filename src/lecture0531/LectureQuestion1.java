package lecture0531;

/*
문제:
    1. data는 추상클래스이거나 인터페이스 상태이다.
    2. data = 50000원이 저축되어 있다.
    3. 익명 클래스를 사용하여 5만원을 출력해라
*/
abstract class LectureQuestionA {
    int data = 50000;

    public abstract void printData();
}

class LectureQuestionB {
    LectureQuestionA inner = new LectureQuestionA() {
        @Override
        public void printData() {
            System.out.println("data: " + data);
        }
    };
}
public class LectureQuestion1 {
    public static void main(String[] args) {
        LectureQuestionB outer = new LectureQuestionB();
        outer.inner.printData();
    }
}