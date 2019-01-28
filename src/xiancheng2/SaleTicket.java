package xiancheng2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SaleTicket implements Runnable {

    private int num = 10;//票的总个数
    private int i = 1;//初始化票号

    Lock lock = new ReentrantLock(); //new lock锁的对象

    @Override
    public void run() {


        /**对象锁
         * for (; i <= num; ) {
            synchronized (this) {
                if (i <= num) {
                    System.out.println(Thread.currentThread().getName() + "----" + i);
                    i++;
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }**/

        //方法锁的调用
//        for (;i<=num;){
//            sale();
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

       /**Lock锁
        * for (;i<=num;){
            lock.lock();
            if (i<=num){
                System.out.println(Thread.currentThread().getName()+"---"+i);
                i++;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            lock.unlock();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }**/
    }

    /**
     * 方法锁
     */
//    public synchronized void sale(){
//        if (i<=num){
//            System.out.println(Thread.currentThread().getName()+"----"+i);
//            i++;
//        }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
}
