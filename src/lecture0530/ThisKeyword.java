package lecture0530;

class ThisKeywordA {
    int m;
    int n;

    void init(int m, int n) {
        m = m;
        n = n;
    }
}

class ThisKeywordB {
    int m;
    int n;

    void init(int m, int n) {
        this.m = m;
        this.n = n;
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        ThisKeywordA a = new ThisKeywordA();
        a.init(2, 3);
        System.out.println(a.m);
        System.out.println(a.n);

        ThisKeywordB b = new ThisKeywordB();
        b.init(2, 3);
        System.out.println(b.m);
        System.out.println(b.n);
    }
}
