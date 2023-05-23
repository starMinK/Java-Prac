package lecture0522;

import java.lang.management.MemoryType;

public class Arrays {
    public static void main(String[] args) {
        int[] myintarray = {100, 23, 42, 12, 4};

        int sum = 0;

        for (int i : myintarray) {
            sum += i;
        }
        System.out.println("합계는 : " + sum);

        for (int value : myintarray) {

        }

        boolean[]array5 = new boolean[3];
        int[] array6 = new int[5];
        double[] array7 = new double[7];
        String[] array8 = new String[9];
    }
}
