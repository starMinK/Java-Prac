package lecture0530;    //A 클래스와 패키지가 같으므로 default 접근자 접근 가능
public class FieldComponent {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.m);
        System.out.println(a.n);
        a.work1();
    }
}
