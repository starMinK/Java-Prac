package lecture0523;
public class ArraySample {
    public static void main(String[] args) {
        int a = 300, b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 700;
        System.out.println("a2 = " + a);
        System.out.println("b2 = " + b);

        int[] x = {300, 400, 500};
        int[] y = x;
        System.out.println("x = " + x[0] + ", " + x[1] + ", " + x[2]);
        System.out.println("y = " + y[1] + ", " + y[1] + ", " + y[2]);

        y[0] = 700;
        System.out.println("x = " + x[0] + ", " + x[1] + ", " + x[2]);
        System.out.println("y = " + y[1] + ", " + y[1] + ", " + y[2]);
    }
}
