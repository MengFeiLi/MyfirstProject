package xiancheng2.day03_SaleTicket3;

public class Test {

    public static void main(String[] args) {

        SaleTicket sale = new SaleTicket();

        Thread t1 = new Thread(sale);
        t1.start();

        Thread t2 = new Thread(sale);
        t2.start();

        Thread t3 = new Thread(sale);
        t3.start();
    }

}
