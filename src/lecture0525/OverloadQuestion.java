package lecture0525;

public class OverloadQuestion {
    private static String calculator(int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        sb.append((num1 + num2));
        sb.append("\n");
        sb.append((num1 - num2));
        sb.append("\n");
        sb.append((num1 * num2));
        sb.append("\n");
        sb.append((num1 / num2));
        String message = sb.toString();
        return message;
    }

    private static String calculator(double num1, double num2) {
        StringBuffer sb = new StringBuffer();
        sb.append((num1 + num2));
        sb.append("\n");
        sb.append((num1 - num2));
        sb.append("\n");
        sb.append((num1 * num2));
        sb.append("\n");
        sb.append((num1 / num2));
        String message = sb.toString();
        return message;
    }
    
    public static void main(String[] args) {
        System.out.println(calculator(1, 4));
        System.out.println(calculator(1.4, 4.2));
    }
}
