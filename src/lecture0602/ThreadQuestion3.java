package lecture0602;
/*
* 문제
* 이름과 시간(sleep:일시정지 시간)을 입력 받아서 5번 반복하여 이름과 시간을 출력하는 프로그램을 작성
* Runnable 인터페이스 혹은 Thread 클래스를 적용
* 1~100사이의 합계 구하기*/

import java.util.Scanner;

class ThreadQuestion3A extends Thread {
    Scanner sc = new Scanner(System.in);
    @Override
    public void run() {
        System.out.println("반복 주기(초 단위)를 입력하세요.");
        int delay = sc.nextInt();
        int time = 0;
        for (int i = 0; i < 5; i++) {
            time += delay * 1000;
            System.out.println(time + "초 경과");
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
public class ThreadQuestion3 {
    public static void main(String[] args) {
        Thread thread = new ThreadQuestion3A();
        thread.setName("이름");
        thread.start();
    }
}
