package lecture0605;

class DataBox {
    boolean isEmpty = true;
    int data;

    synchronized void inputData(int data) {
        if (!isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data = data;
        this.isEmpty = false;
        System.out.println("입력 데이터: " + data);
        notify();
    }

    synchronized void outputData() {
        if (isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            isEmpty = true;
            System.out.println("출력 데이터: " + data);
            notify();
        }
    }
}

public class WatingWaitNotify {
    public static void main(String[] args) {
        DataBox dataBox = new DataBox();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i < 9; i++) {
                    dataBox.inputData(i);
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i < 9; i++) {
                    dataBox.outputData();
                }
            }
        };
        t1.start();
        t2.start();
    }
}
