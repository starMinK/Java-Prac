package lecture0524;

import lecture0519.Hello;

import java.time.Year;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Question1 {
    private static String HelloOO(String input) {

        if (Objects.equals(input, "Hello")) {
            return (input + "반갑습니다.");
        } else if (Objects.equals(input, "stop")) {
            return ("종료됩니다.");
        } else {
            return ("Hello를 정확하게 입력해주세요.");
        }
    }

    private static void HelloOX(String input) {

        if (Objects.equals(input, "Hello")) {
            System.out.println(input + " 반갑습니다.");
        } else if (Objects.equals(input, "stop")) {
            System.out.println("종료됩니다.");
        } else {
            System.out.println("Hello를 정확하게 입력해주세요.");
        }
    }

    private static String HelloXO() {
        return "반갑습니다.";
    }

    private static void HelloXX() {
        System.out.println("Hello 반갑습니다.");
    }

    private static void repeat(int num, String txt) {
        int i = 0;
        while (i < num) {
            System.out.println(txt);
            i++;
        }
    }

    private static String[] cal(int num1, int num2) {
        String[] result = new String[5];
        result[0] = "+: " + (num1 + num2);
        result[1] = "-: " + (num1 - num2);
        result[2] = "*: " + (num1 * num2);
        result[3] = "/: " + (num1 / num2);
        result[4] = "%: " + (num1 % num2);

        return result;
    }

    public static int[] sungjukInput(int score1, int score2, int score3) {
        int[] result = {score1, score2, score3};
        return result;
    }

    public static int[] sungjukProcess(int[] scores) {
        int[] result = new int[scores.length];

        for (int score : scores) {
            result[0] += score; //평균
            result[1] += score; //총점
        }

        result[0] /= scores.length;
        return result;
    }

    public static void sungjukOutput(int[] arr) {
        System.out.println("평균: " + arr[0]);
        System.out.println("총점: " + arr[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Hello를 입력하세요.");
        System.out.println("종료하려면 stop을 입력해주세요.");*/
        /*while (true) {
            String hello = HelloOO(sc.next());
            System.out.println(hello);
            if (hello.equals("종료됩니다.")) {
                break;
            }
        }*/

        /*while (true) {
            String txt = sc.next();
            HelloOX(txt);
            if (txt.equals("stop")) {
                break;
            }
        }*/

        /* while (true) {
            String txt = sc.next();
            if (txt.equals("Hello")) {
                System.out.println(txt + HelloXO());
            } else if (txt.equals("stop")) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("Hello를 정확히 입력해주세요.");
            }
        }*/

        /*while (true) {
            String txt = sc.next();
            if (txt.equals("Hello")) {
                 HelloXX();
            } else if (txt.equals("stop")) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("Hello를 정확히 입력해주세요.");
            }
        }*/

        /*
         * Hello라는 문자열을 입력받아서 5번 출력하세요.
         * */
        /*        repeat(5,"asdw");*/

//        System.out.println(Arrays.toString(cal(4, 2)));
        /*String[] arr = cal(4, 3);
        for (String arg : arr) {
            System.out.println(arg);
        }*/
        Loop1:
        while (true) {
            System.out.println("3과목의 점수를 각각 입력하세요.");
            System.out.print("Java: ");
            int score1 = sc.nextInt();
            System.out.print("Spring: ");
            int score2 = sc.nextInt();
            System.out.print("JS: ");
            int score3 = sc.nextInt();
            sungjukOutput(sungjukProcess(sungjukInput(score1, score2, score3)));
            Loop2:
            while (true) {
                System.out.println("계속 하시겠습니까? yes/no");
                String repeat = sc.next();
                if (repeat.equals("no")) {
                    System.exit(0);
                } else if (repeat.equals("yes")) {
                    break Loop2;
                } else {
                    System.out.println("yes/no중 입력하여 주세요.");
                }
            }
        }
    }
}
