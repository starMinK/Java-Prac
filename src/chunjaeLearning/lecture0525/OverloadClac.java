package lecture0525;

public class OverloadClac {
    public int plus(int a, int b) {
        return a + b;
    }

    public float plus(float a, float b) {
        return a + b;
    }

    public double plus(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        OverloadClac oc = new OverloadClac();
        int i = oc.plus(3, 5);
        float j = oc.plus(0.1f, 0.2f);
        double k = oc.plus(0.5, 0.7);
        System.out.println("int 합: " + i);
        System.out.println("float 합: " + j);
        System.out.println("double 합: " + k);
    }
}
