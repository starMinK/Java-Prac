package lecture0602;

import java.util.Scanner;

/*문제
 * 1.구구단 문제를 출제하여야 한다
 * 2. 답을 제출하는 시간을 제한한다.
 * 3. 구구단을 끝내고 싶으면 Exit 를 입력한다.
 * 4. Runnable 또는 Thread 를 상속받아 사용해야만 한다.
 * 5. join() 을 사용해야한다.
 * */
class MultiplicationGame implements Runnable {
    private volatile boolean running = true;

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        try {
            while (running) {
                // 구구단 문제 출제
                int num1 = (int) (Math.random() * 9) + 1;
                int num2 = (int) (Math.random() * 9) + 1;
                int answer = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = ?");

                // 답 제출 및 시간 제한 설정
                Thread timerThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(5000); // 5초 제한 시간 설정
                            if (running) {
                                System.out.println("시간이 초과되었습니다!");
                                stopGame();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
                timerThread.start();

                String userInput = scanner.nextLine();
                if (userInput.equalsIgnoreCase("exit")) {
                    stopGame();
                    break;
                }

                int userAnswer;
                try {
                    userAnswer = Integer.parseInt(userInput);
                } catch (NumberFormatException e) {
                    System.out.println("올바른 숫자를 입력해주세요!");
                    continue;
                }

                // 정답 확인
                if (userAnswer == answer) {
                    System.out.println("정답입니다!");
                } else {
                    System.out.println("틀렸습니다. 정답은 " + answer + "입니다.");
                }

                timerThread.interrupt();
            }
        } finally {
            scanner.close();
        }
    }

    public void stopGame() {
        running = false;
    }
}

public class ThreadQuestion5 {
    public static void main(String[] args) {
        MultiplicationGame game = new MultiplicationGame();
        Thread gameThread = new Thread(game);
        gameThread.start();

        try {
            gameThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("구구단 게임이 종료되었습니다.");
    }
}
