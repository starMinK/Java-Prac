package lecture0605;

import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student other) {
        // 점수를 기준으로 내림차순 정렬
        return other.score - this.score;
    }
}

public class TreeSetQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Student> studentSet = new TreeSet<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("이름을 입력하세요: ");
            String name = scanner.nextLine();
            System.out.print("성적을 입력하세요: ");
            int score = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거

            Student student = new Student(name, score);
            studentSet.add(student);
        }

        // 최고점수와 최고점수를 받은 학생 출력
        Student highestScoreStudent = studentSet.first();
        System.out.println("최고점수: " + highestScoreStudent.getScore());
        System.out.println("최고 점수 사용자: " + highestScoreStudent.getName());
    }
}

