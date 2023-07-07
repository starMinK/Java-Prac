package lecture0601;

public class MultiCatch {
    public static void main(String[] args) {
        int num = 0;
        try {
            System.out.println(3 / 0);
            num = Integer.parseInt("10A");
        } catch (ArithmeticException e) {
            System.out.println("num can't divide by 0");
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("num can't change");
            System.out.println(e);
        } finally {
            System.out.println("shut down");
        }
        System.out.println(num);
    }
}
