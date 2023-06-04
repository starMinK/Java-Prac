package lecture0526;

class Super {
    int x = 12;
    void p() {
        System.out.println("Super1 p() is called");
    }
}

class Super2 extends Super {
    int x = 24;
    void p() {
        System.out.println("Super2 p() is called");
    }
    void test() {
        System.out.println("super x = " + super.x);
        System.out.println("current x = " + x);
        super.p();
        this.p();
    }
}
public class SuperMethod {
    public static void main(String[] args) {
        try {
            Super2 s2 = new Super2();
            s2.test();
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다: " + e.getMessage());
        }
    }
}