package lecture0531;

class TypecastingA {
    int m = 3;

    void abc() {
        System.out.println("A class");
    }
}

class TypecastingB extends TypecastingA {
    int n = 4;

    void bcd() {
        System.out.println("B class");
    }
}

public class Typecasting {
    public static void main(String[] args) {
        try {
            TypecastingA aa = new TypecastingA();
            System.out.println(aa.m);
            aa.abc();

            TypecastingB bb = new TypecastingB();
            System.out.println(bb.m);
            System.out.println(bb.n);

            TypecastingA ab = new TypecastingB();
            System.out.println(ab.m);
            ab.abc();
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다: " + e.getMessage());
        } finally {
            System.out.println("예외 처리 완료");
        }
    }
}
