package xiancheng2.day02_SaleTicket2;

public class SaleTicket implements Runnable {

    private int total = 10;//总票数

    private int i = 1;//当前卖出的票号

    @Override
    public void run() {

        for (; i <= total; ) {

            sale();

//            //一个线程卖出一次票之后，让该线程休眠一秒，给别的线程卖票的机会
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //用同步方法实现线程的同步
    public synchronized void sale() {//卖票

        if (i <= total) {
            //卖当前的票
            System.out.println(Thread.currentThread().getName() + " -> " + i);
            //修改票号
            i++;
        }

//        让一个线程延时1秒打开对象锁，以达到多个线程交替执行的效果
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
