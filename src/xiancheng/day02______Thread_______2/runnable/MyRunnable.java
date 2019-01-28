package xiancheng.day02______Thread_______2.runnable;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程" + i);
        }
    }

}
