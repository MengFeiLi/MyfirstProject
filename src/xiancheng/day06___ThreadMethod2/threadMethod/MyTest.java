package xiancheng.day06___ThreadMethod2.threadMethod;

public class MyTest {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--" + i);

            if (i == 1) {
                Thread.yield();
            }
            if (i == 2) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
