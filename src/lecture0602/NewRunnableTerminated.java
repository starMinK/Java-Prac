package lecture0602;

public class NewRunnableTerminated {
    public static void main(String[] args) {
        Thread.State state;

        Thread myThread = new Thread(){
            @Override
            public void run(){
                for (long i = 0; i < 100000000000L; i++){}
            }
        };
        state = myThread.getState();
        System.out.println("myThread state " + state);

        myThread.start();
        state = myThread.getState();
        System.out.println("myThread state = " + state);

        try {
            myThread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        state = myThread.getState();
        System.out.println("myThread state = " + state);
    }
}
