package lecture0526;

import java.util.Stack;

public class SampleConcept {
    public static void main(String[] args) {
        try {
            Stack<String> stack = new Stack<String>();
            stack.push("홍길동");
            stack.push("김규민");
            stack.push("최성현");

            System.out.println(stack.size());

            stack.push("박수연");
            stack.push("최세진");

            System.out.println("스택의 크기: " + stack.size());

            stack.pop();
            System.out.println(stack.size());
            System.out.println(stack);

            while (!stack.isEmpty()) {
                System.out.println(stack.size() + " : " + stack.pop());
            }
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다: " + e.getMessage());
        }
    }
}
