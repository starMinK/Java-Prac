package lecture0526;

import java.util.Scanner;

public class GenericSample {
    public static void main(String[] args) {
        GenericSample1<Integer> gInt = new GenericSample1<Integer>(15);
        GenericSample1<Double> gDouble = new GenericSample1<Double>(15);

        Scanner sc = new Scanner(System.in);
        System.out.println("put in int:");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();

        gInt.Data(x1, x2, x3);

        System.out.println("put in double:");
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double y3 = sc.nextDouble();

        gDouble.Data(y1, y2, y3);

        gInt.printData();
        gDouble.printData();
    }
}
