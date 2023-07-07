package lecture0519;

public class Variable5 {
    public static void main(String[] args) {
        long la = 40L;
        long lb = 50L;
        long lc = la + lb;

        System.out.println("07: " + la);
        System.out.println("08: " + lb);
        System.out.println("09: " + lc);

        float fa = 45.0f;
        float fb = 46.67f;
        float fc = fa + fb;

        double da = 12;
        double db = 45 + Float.MAX_VALUE;
        double dc = da+db;

        System.out.println("10 :" + dc);
        System.out.println("11 :" + "int 범위 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("12 :" + "float 범위 : " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
        System.out.println("13 :" + "byte 범위 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("14 :" + "short 범위 : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("15 :" + "long 범위 : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        System.out.println("16 :" + "double 범위 : " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);

        System.out.println(5 / 2);
        System.out.println((float)5 / 2);
        System.out.println((double)5 / 2);
    }
}
