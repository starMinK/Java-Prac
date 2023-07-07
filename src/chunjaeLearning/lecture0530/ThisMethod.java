package lecture0530;

class ThisMethodA {
    int m1, m2, m3, m4;
    ThisMethodA() {
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }

    ThisMethodA(int a) {
        m1 = a;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }

    ThisMethodA(int a, int b) {
        m1 = a;
        m2 = b;
        m3 = 3;
        m4 = 4;
    }

    void print() {
        System.out.print(m1 + " ");
        System.out.print(m2 + " ");
        System.out.print(m3 + " ");
        System.out.print(m4 + " ");
        System.out.println();
    }
}

class ThisMethodB {
    int m1, m2, m3, m4;

    ThisMethodB() {
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }

    ThisMethodB(int a) {
        this();
        m1 = a;
    }

    ThisMethodB(int a, int b) {
        this(a);
        m2 = b;
    }

    /*ThisMethodB(int a, int b) {
        this();
        m1 = a;
        m2 = b;
    }*/

    void print() {
        System.out.print(m1 + " ");
        System.out.print(m2 + " ");
        System.out.print(m3 + " ");
        System.out.print(m4 + " ");
        System.out.println();
    }
}
public class ThisMethod {
    public static void main(String[] args) {
        ThisMethodA a1 = new ThisMethodA();
        ThisMethodA a2 = new ThisMethodA(10);
        ThisMethodA a3 = new ThisMethodA(10, 20);

        a1.print();
        a2.print();
        a3.print();
        System.out.println();

        ThisMethodB b1 = new ThisMethodB();
        ThisMethodB b2 = new ThisMethodB(10);
        ThisMethodB b3 = new ThisMethodB(10, 20);

        b1.print();
        b2.print();
        b3.print();
    }
}
