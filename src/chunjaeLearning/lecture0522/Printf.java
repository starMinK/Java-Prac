package lecture0522;

public class Printf {
    public static void main(String[] args) {
        System.out.printf("%d\n", 12);
        System.out.printf("%o\n", 12);
        System.out.printf("%x\n", 12);
        System.out.printf("%s\n", "문자열 출력");
        System.out.printf("%f\n", 3.2582);
        System.out.printf("%4.2f\n", 3.2582);
        System.out.printf("%d와 %4.2f\n", 12, 3.2582);
    }
}
