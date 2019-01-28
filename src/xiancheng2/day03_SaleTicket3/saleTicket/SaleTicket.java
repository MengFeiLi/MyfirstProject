package xiancheng2.day03_SaleTicket3.saleTicket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SaleTicket implements Runnable {

    private int num = 10;
    private int i = 1;
    Lock l = new ReentrantLock();

    @Override
    public void run() {

        for (; i <= num; ) {
            l.lock();
            if (i <= num) {
                System.out.println(Thread.currentThread().getName() + "---" + i);
                i++;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            l.unlock();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
