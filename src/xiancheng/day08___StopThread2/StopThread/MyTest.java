package xiancheng.day08___StopThread2.StopThread;

public class MyTest {
    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        thread.interrupt();
    }
}
