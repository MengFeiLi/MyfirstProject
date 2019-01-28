package xiancheng.day08___StopThread2.StopThread;

public class MyThread extends Thread {

    @Override
    public void run() {


        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
//            e.printStackTrace();
            System.out.println("子线程被打断");
        }
    }
}
