package lecture0524;

class Top {
    public int a;
    public int b;

    public int sum(int x, int y) {
        return x + y;
    }
}

public class TopMain {
    public static void main(String[] args) {
        Top t = new Top();
        t.a = 100;
        t.b = 200;
        int s = t.sum(3, 5);

        System.out.println("a는: " + t.a);
        System.out.println("b는: " + t.b);

        System.out.println("t.sum(3,5)의 결과는: " + t.sum(3,5));
        System.out.println("s는: " + s);
    }
}
