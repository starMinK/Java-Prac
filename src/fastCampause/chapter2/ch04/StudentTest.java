package chapter2.ch04;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentID = 12345;
        studentLee.setStudentName("LEE");
        studentLee.address = "soul";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentID = 11111;
        studentKim.studentName = "KIM";
        studentKim.address = "daegu";

        studentKim.showStudentInfo();
        System.out.println(studentKim);
        System.out.println(studentLee);

    }
}