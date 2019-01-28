package xiancheng.day05__ThreadMethod.threadMethod;

public class MyThread extends Thread {
    private int num = 10;


    @Override
    public void run() {
        for (int i = 1; i <= num; i++) {
            Thread thread = Thread.currentThread();
            String name = thread.getName();
            System.out.println(name);
        }
    }
}
