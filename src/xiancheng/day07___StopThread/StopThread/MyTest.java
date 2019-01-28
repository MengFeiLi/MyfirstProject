package xiancheng.day07___StopThread.StopThread;

public class MyTest {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();



        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("----------------");
        thread.setFlag(false);
    }
}
