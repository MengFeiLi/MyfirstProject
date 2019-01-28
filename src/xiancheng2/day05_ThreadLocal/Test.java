package xiancheng2.day05_ThreadLocal;

public class Test {

    public static void main(String[] args) {

        MyRunnable run = new MyRunnable();

        Thread t1 = new Thread(run);
        t1.start();

        Thread t2 = new Thread(run);
        t2.start();
    }

}
