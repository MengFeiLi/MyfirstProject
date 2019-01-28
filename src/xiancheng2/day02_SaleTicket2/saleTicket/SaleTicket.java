package xiancheng2.day02_SaleTicket2.saleTicket;

public class SaleTicket implements Runnable {

    private int num = 10;
    private int i = 1;

    @Override
    public void run() {
        for (; i <= num; ) {
            sale();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    public synchronized void sale() {
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
}
