package chapter2.ch06;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student();

        System.out.println(student.showStudentInfo());

        Student studentKim = new Student(12345, "Kim", 3);
        System.out.println(studentKim.showStudentInfo());
    }
}
