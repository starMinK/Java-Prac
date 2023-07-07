package lecture0602;

class SMIFileThread extends Thread {
    @Override
    public void run() {
        String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(" - (자막 번호) " + strArray[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
public class CreateAndStartThread_M1C1 {
    public static void main(String[] args) {
        Thread smiFileThread = new SMIFileThread();
        smiFileThread.start();

        int[] intArray = {1, 2, 3, 4, 5};

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("(비디오 프레임) " + intArray[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
