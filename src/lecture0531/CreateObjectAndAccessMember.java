package lecture0531;

class CreateObjectAndAccessMemberA {
    public int a = 3;
    protected int b = 4;
    int c = 5;
    private int d = 6;
    void abc() {
        System.out.println("A 클래스 메서드 abc()");
    }

    class CreateObjectAndAccessMemberB {
        void bcd() {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        }
    }
}
public class CreateObjectAndAccessMember {
    public static void main(String[] args) {
        //아우터 클래스 객체 생성
        CreateObjectAndAccessMemberA a = new CreateObjectAndAccessMemberA();
        //이너 클래스 객체 생성
        CreateObjectAndAccessMemberA.CreateObjectAndAccessMemberB b = a.new CreateObjectAndAccessMemberB();
        b.bcd();
    }
}
