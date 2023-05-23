package lecture0522;

public class WhileControlStatement {
    public static void main(String[] args) {
        int a = 0;
        while (a < 10) {
            System.out.println(a + " ");
            a++;
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ");
        }
        System.out.println();

        int b = 10;
        while (b > 0) {
            System.out.println(b + " ");
            b--;
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.println(i + " ");
        }
        System.out.println();

    }
}
