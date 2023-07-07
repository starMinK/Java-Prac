package chapter2.ch08;

public class Person {
    int heigth;
    int weight;
    String zender;
    String name;
    int age;


    public Person(int heigth, int weight, String zender, String name, int age) {
        this.heigth = heigth;
        this.weight = weight;
        this.zender = zender;
        this.name = name;
        this.age = age;
    }

    public String personInfo() {
        return "키가" + heigth + "이고, 몸무게가 " + weight + "킬로인" + zender + "가 있습니다."
                + "이름은" + name + "이고 나이는" + age + "세 입니다.";
    }
}
