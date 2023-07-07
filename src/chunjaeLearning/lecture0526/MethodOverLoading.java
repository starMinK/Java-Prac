package lecture0526;

import java.util.Scanner;

class Person {
    String name;
    int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }
}

public class MethodOverLoading {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            int age = sc.nextInt();
            Person p1 = new Person(name);
            Person p2 = new Person(age);

            System.out.println(p1.name + "님의 나이는 " + p2.age + "살 입니다.");
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다: " + e.getMessage());
        }
    }
}
