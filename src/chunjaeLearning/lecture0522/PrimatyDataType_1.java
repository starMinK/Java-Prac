package lecture0522;

public class PrimatyDataType_1 {
    public static void main(String[] args) {
        int a = 100;
        System.out.println(Integer.toBinaryString(a));  //10 -> 2진수(Binary)
        /*
        10->2진수
        100 / 2 = 50 ... 0
        50 / 2 = 25 ... 0
        25 / 2 = 12 ... 1
        12 / 2 = 6 ... 0
        6 / 2 = 3 ... 0
        3 / 2 = 1 ... 1
        -> 1100100

        2진수 -> 8진수
        -> 001 100 100 = 1 4 4

        2진수 -> 16진수
        -> 0110 0100 = 6 4

        10진수 -> 8진수
        100 / 8 = 12 ... 4
        12 / 8 = 1 ... 4
        -> 144

        10진수 -> 16진수
        100 / 16 = 6 ... 4
        ->64
        */
        System.out.println(Integer.toOctalString(a));   //10 -> 8진수(Octal)
        System.out.println(Integer.toHexString(a));     //10 -> 16진수(Hex)

        System.out.println(Integer.parseInt("1010", 2));    //10 -> 2진수
        System.out.println(Integer.parseInt("12", 8));      //10 -> 8진수
        System.out.println(Integer.parseInt("a", 16));      //10 -> 16진수
    }
}
