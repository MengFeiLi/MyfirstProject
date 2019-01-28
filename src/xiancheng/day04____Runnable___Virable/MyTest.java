package xiancheng.day04____Runnable___Virable;

public class MyTest {
    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable();

        //创建3个线程
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        //启动线程开始卖票
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
