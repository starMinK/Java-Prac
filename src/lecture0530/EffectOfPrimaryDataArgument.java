package lecture0530;

public class EffectOfPrimaryDataArgument {
    public static void main(String[] args) {
        int a = 3;
        try {
            int result1 = twice(a);
            System.out.println(result1);
            int result2 = twice(a);
            System.out.println(result2);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다: " + e.getMessage());
        } finally {
            System.out.println("finally 블록");
        }
    }

    private static int twice(int a) {
        try {
            a *= 2;
            return a;
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다: " + e.getMessage());
            return a;
        }
    }
}
