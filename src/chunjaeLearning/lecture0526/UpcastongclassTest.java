package lecture0526;

public class UpcastongclassTest {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();
        s.delete();
        System.out.println();
        Circle c = new Circle();
        c.draw();
        c.delete();
        c.sayCircle();
        System.out.println();
        Circle c1 = new Circle();
        c1.draw();
        c1.delete();
        System.out.println();
    }
}
