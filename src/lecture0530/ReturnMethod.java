package lecture0530;

public class ReturnMethod {
    private static void print() {
        System.out.println("Hello");
    }

    private static int data() {
        return 3;
    }

    private static double sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        print();
        System.out.println(data());
        System.out.println(sum(1, 4));
    }
}
