package lecture0605;

class YieldRunnableStateThread extends Thread {
    private int start;
    private int end;

    public YieldRunnableStateThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(getName() + ": " + i);
            Thread.yield();
        }
    }
}

public class YieldRunnableState {
    public static void main(String[] args) {
        YieldRunnableStateThread thread1 = new YieldRunnableStateThread(1, 50);
        YieldRunnableStateThread thread2 = new YieldRunnableStateThread(51, 100);
        YieldRunnableStateThread thread3 = new YieldRunnableStateThread(101, 200);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
