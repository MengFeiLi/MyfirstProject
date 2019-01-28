package xiancheng2.day04_ThreadDeadLock.ThreadDeadLock;

public class Test {
    public static void main(String[] args) {
        MyRunnale runnale = new MyRunnale();

        Thread thread1 = new Thread(runnale);
        runnale.setFalg(100);
        thread1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread2 = new Thread(runnale);
        runnale.setFalg(200);
        thread2.start();
    }
}
