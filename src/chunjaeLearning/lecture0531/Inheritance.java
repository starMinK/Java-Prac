package lecture0531;

class Human {
    String name;
    int age;
    void eat() {}
    void sleep() {}
}

class Student extends Human {
    int studentId;
    void goToSchool() {}
}

class Worker extends Human {
    int workerID;
    void goToWork() {}
}

public class Inheritance{
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "김현지";
        h.age = 11;
        h.eat();
        h.sleep();

        Student s = new Student();
        s.name = "김민성";
        s.age = 16;
        s.studentId = 128;
        s.eat();
        s.goToSchool();

        Worker w = new Worker();
        w.name = "봉윤정";
        w.age = 45;
        w.workerID = 128;
        w.eat();
        w.sleep();
        w.goToWork();
    }
}
