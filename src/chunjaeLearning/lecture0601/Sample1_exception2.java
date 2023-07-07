package lecture0601;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample1_exception2 {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		boolean run = true;

		while (run) {

			try {
				System.out.println("처리할 성적 데이터를 입력해 주세요: ");
				score = sc.nextInt();// 888

				String grade = (score >= 90) ? "A학점"
						: (score >= 80) ? "B학점" : (score >= 70) ? "C학점" : (score >= 60) ? "D학점" : "F학점";
				System.out.println("학점: " + grade);
								
				System.out.println("성적을 계속 처리하시겠습니까?(yes/no)");
				String str = sc.next();

				if (str.equals("yes")) {
					continue;
				} else {
					run = false;
					System.out.println("성적 프로그램을 종료합니다.~");
					break;
				}

			} catch (InputMismatchException e) {
				// e.printStackTrace();
				String str = "성적은 숫자만 가능합니다.";
				System.out.println(str);//
				
			} finally {				
				System.out.println("정상적으로 성적처리가 되었습니다.");
			}
			 continue;//sc.nextLine();
		}//while end

	}
}
