package xiancheng2.day03_SaleTicket3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SaleTicket implements Runnable {

    private int total = 10;//定义票的总数

    private int i = 1;//定义当前卖出的票号

    Lock lock = new ReentrantLock();

    @Override
    public void run() {

        for(; i <= total;){

            //打开对象锁，从这行代码往下开始都是被锁上的代码
            //直到遇到unlock方法
            lock.lock();//锁定代码

            if(i <= total){
                System.out.println(Thread.currentThread().getName() + " -> " + i);//卖出当前的票
                i++;//修改票号

                //让一个线程卖完一张票之后延时1秒释放锁
                //达到每隔1秒有一个窗口卖出一张票的效果
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            lock.unlock();//解除锁定代码
            //在lock()和unlock()之间的代码被称为同步代码

            //当前的线程卖出一张票之后，让该线程休眠1秒，使别的线程有机会卖票
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
