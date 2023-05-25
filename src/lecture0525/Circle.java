package lecture0525;

public class Circle extends CircleArea1 {
    public static void main(String[] args) {
        CircleArea2 area2 = new CircleArea2();
        System.out.printf("%4.2f\n", area());
        System.out.println(area2.area());
    }
}
