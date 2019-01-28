package xiancheng.day04____Runnable___Virable.virble;

public class MyTest{
    public static void main(String[] args) {

        MyRunnable runnable1 = new MyRunnable("窗口一---------");
        MyRunnable runnable2 = new MyRunnable("窗口二----------------");
        MyRunnable runnable3 = new MyRunnable("窗口三---");

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}