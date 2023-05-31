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
        TypecastingA aa = new TypecastingA();
        System.out.println(aa.m);
        aa.abc();

        TypecastingB bb = new TypecastingB();
        System.out.println(bb.m);
        System.out.println(bb.n);

        TypecastingA ab = new TypecastingB();   //TypecastingB 메서드 사용 못함 <- 왜??
        System.out.println(ab.m);
        ab.abc();
    }
}
