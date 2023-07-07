package lecture0602;

import java.util.Scanner;

/*
 * 문제
 * 병원에 환자가 진료를 받으러 n 명이 방문합니다.
 * 1.방문자 입력받기
 * 2. Runnable 인터페이스 또는 Thread 클래스를 사용
 * 3. 동기화 하지 않은 방식으로 환자를 진료하는 방법
 * 4. 동기화 하는 방법으로 환자를 진료하는 방법 -> 결과를 보고 판단
 * */

class Hospital implements Runnable {
    @Override
    public synchronized void run() {
        synchronized(this) {	//블럭동기화

            for(int i=8; i >= 1; i--) {
                System.out.println(Thread.currentThread().getName());//환자명
                System.out.println("dressing..." + (i * 300) + "초전...");//진료 남은 시간
            }
            System.out.println(Thread.currentThread().getName() + "진료 끝...");//환자명
        }
    }
}

public class ThreadQuestion4 {
    public static void main(String[] args) {
        Hospital st7 = new Hospital();

        Thread t1 = new Thread(st7, "1번 김규민");
        Thread t2 = new Thread(st7, "2번 박수연");
        Thread t3 = new Thread(st7, "3번 최진만");
        Thread t4 = new Thread(st7, "4번 임성현");
        Thread t5 = new Thread(st7, "5번 김동현");
        Thread t6 = new Thread(st7, "6번 임하늘");
        Thread t7 = new Thread(st7, "7번 유다희");
        Thread t8 = new Thread(st7, "8번 손진경");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }
}
