package lecture0602;

/*
 * 문제
 * Thread 클래스를 상속 받아서, 메세지를 출력, 1~100사이의 합을 출력하는 프로그램을 작성하시오
 *
 * 조건
 * 0. 멀티스레드를 이용하여 홍길동, 전우치, 이순신 데이터를 스레드 이름으로 작성한다.
 * 1. main 클래스: ThreadQuestion2
 * 2. Runnable 인터페이스 상속 이용
 * 3. 메세지: "이것이 보이면 스레드가 잘 실행된 모습입니다.
 * 4. 상속받아 처리할 클래스명은 ThreadQuestion2A 입니다.
 * 5. 1~100 사이의 합계 구하기
 * */
class ThreadQuestion2A implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable이 잘 실행되었습니다.");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(Thread.currentThread().getName() + "의 1부터 100까지의 합: " + sum);
    }
}

public class ThreadQuestion2 {
    public static void main(String[] args) {
        Runnable hong = new ThreadQuestion2A();
        Runnable jeun = new ThreadQuestion2A();
        Runnable lee = new ThreadQuestion2A();

        Thread hongThread = new Thread(hong, "홍길동");
        Thread jeunThread = new Thread(jeun, "전우치");
        Thread leeThread = new Thread(lee, "이순신");

        hongThread.start();
        jeunThread.start();
        leeThread.start();
    }
}