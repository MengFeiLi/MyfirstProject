package xiancheng2.day01_SaleTicket;

public class Test {

    public static void main(String[] args) {

        SaleTicket sale = new SaleTicket();

        //创建第一个窗口
        Thread t1 = new Thread(sale);
        t1.start();

        //创建第二个窗口
        Thread t2 = new Thread(sale);
        t2.start();

        //创建第三个窗口
        Thread t3 = new Thread(sale);
        t3.start();


    }

}
