package lecture0602;
/*
* 문제
* Thread 클래스를 상속 받아서, 메세지를 출력, 1~100사이의 합을 출력하는 프로그램을 작성하시오
* 1. main 클래스: ThreadQuestion
* 2. Thread 클래스를 상속에 이용
* 3. 메세지: "이것이 보이면 스레드가 잘 실행된 모습입니다.
* 4. 상속받아 처리할 클래스명은 ThreadQuestionA 입니다.*/

class ThreadQuestionA implements Runnable {
    public static final int END = 100;

    @Override
    public void run() {
        System.out.println("이것이 보이면 스레드가 잘 실행된 모습입니다.");

        int sum = 0;
        for (int i = 1; i <= END; i++) {
            sum += i;
        }
        System.out.println("1부터 100까지의 합:" + sum);
    }

}

public class ThreadQuestion {
    public static void main(String[] args) {
        Runnable threadQuestionARunnable = new ThreadQuestionA();
        Thread thread = new Thread(threadQuestionARunnable);
        thread.start();
    }
}
