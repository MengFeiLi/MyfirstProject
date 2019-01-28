package xiancheng2.day01_SaleTicket.saleTicket;

public class SaleTicket implements Runnable {
    private int num = 10;

    private int i=1;
    @Override
    public void run() {
        for (;i<=num;){



           synchronized (this){
               if (i<=num){
                   System.out.println(Thread.currentThread().getName()+"-----------"+i);
                   i++;
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
