package xiancheng.day08___StopThread2;

public class MyThread extends Thread {

    @Override
    public void run() {

        // for(int i = 0; i < 10; i++){
        //
        // try {
        // Thread.sleep(1000);//让子线程休眠1秒，线程的休眠是可以被打断的，当线程的休眠被打断之后该方法会抛异常
        // System.out.println(Thread.currentThread().getName() + " : " + i);
        // } catch (InterruptedException e) {
        // // e.printStackTrace();
        // System.out.println("子线程的睡眠被打断");
        // }
        //
        //
        // }

        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        } catch (InterruptedException e) {
            // e.printStackTrace();
            System.out.println("子线程被中断睡眠");
        }
    }

}
