package lecture0526;

import java.util.Scanner;

public class GenericCalc {
    public static void main(String[] args) {
        GenericSample1<Integer> gInt = new GenericSample1<Integer>(3);
        GenericSample1<Double> gDouble = new GenericSample1<Double>(3);

        Scanner sc = new Scanner(System.in);
        int java = sc.nextInt();
        int jsp = sc.nextInt();
        int spring = sc.nextInt();

        gInt.Data(java,jsp,spring);
        gInt.addData();
        gInt.printData();

        double dJava = sc.nextDouble();
        double dJsp = sc.nextDouble();
        double dSpring = sc.nextDouble();

        gDouble.Data(dJava,dJsp,dSpring);
        gDouble.addData();
        gDouble.printData();
    }
}
