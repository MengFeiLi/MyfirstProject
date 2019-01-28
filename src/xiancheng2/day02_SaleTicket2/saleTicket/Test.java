package xiancheng2.day02_SaleTicket2.saleTicket;

public class Test {
    public static void main(String[] args) {
        SaleTicket saleTicket = new SaleTicket();

        Thread thread1 = new Thread(saleTicket);
        thread1.start();
        Thread thread2 = new Thread(saleTicket);
        thread2.start();
        Thread thread3 = new Thread(saleTicket);
        thread3.start();
    }
}
