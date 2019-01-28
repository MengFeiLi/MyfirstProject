package xiancheng.day02______Thread_______2.runnable;

public class MyTest {
    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable();

        Thread thread = new Thread(runnable);

        thread.start();

        for (int i = 0; i < 10; i++) {
        System.out.println("主线程" + i);
        }


        }

        }
