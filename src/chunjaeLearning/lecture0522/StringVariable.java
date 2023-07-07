package lecture0522;

public class StringVariable {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello"); //object

        boolean res1 = (str1 == str2);
        boolean res2 = str1.equals(str2);
        System.out.println(res1);
        System.out.println(res2);
    }
}
