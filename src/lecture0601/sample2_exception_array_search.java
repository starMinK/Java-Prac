package lecture0601;

import java.util.Scanner;

/*문제> 원하는 점수를 찾아서 그 index와 점수를 출력하세요.
 * 그리고, 계속처리를 원하면 반복 처리되도록 해주세요.
 * 
 */
public class sample2_exception_array_search {

	static int num;	
	static Scanner sc = new Scanner(System.in);	
	static int count;

	public static void main(String args[]) {
		// 배열참조변수.length: 배열의 길이 구하기
		
		boolean run = true;

		while (run) {
			float sum=0;
			
			try {
				System.out.println("처리할 데이터의 갯수를 입력해 주세요.");
				num = sc.nextInt();
				float[] a = new float[num];
				count = a.length;

				System.out.println(num + "개의 실수형 데이터를 입력해 주세요.");
				for (int i = 0; i < count; i++) {
					float score = sc.nextFloat();
					a[i] = score;

					sum += a[i];
				}
				for (float k : a) {
					System.out.println(k);
				}

				System.out.printf("총점: %5.2f", sum);
				System.out.println();				

				System.out.println("검색할 점수를 입력해 주세요.");
				float searchi = sc.nextFloat();
				
				for (int i = 0; i < count; i++) {

					if (a[i] == searchi) {
						System.out.println(searchi + "는 index로 " + i + "번째에 저장돼있습니다.");
					}else {
						System.out.println("찾는 데이터가 존재하지 않습니다.");
					}
				}
				
				if (run) {
					System.out.println("Continue?(yes/no)");
					String str = sc.next();

					if (str.equals("yes")) {
						sc.nextLine();
					} else {
						System.out.println("프로그램 종료!!!");
						System.exit(0);
					}
				}
			} catch (Exception e) {
				System.out.println("처리할 데이터의 갯수는 정수형을 입력하고, 실제 데이터는 실수형으로 입력해 주세요.~~");
			}
			continue;//sc.nextLine();
		}		
	}// main end
}// class end
