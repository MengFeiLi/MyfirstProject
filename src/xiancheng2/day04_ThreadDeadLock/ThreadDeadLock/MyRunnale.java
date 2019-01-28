package xiancheng2.day04_ThreadDeadLock.ThreadDeadLock;

public class MyRunnale implements Runnable {

    private String lock1 = "a";

    private String lock2 = "b";

    private int falg;


    public void setFalg(int falg) {
        this.falg = falg;
    }

    @Override
    public void run() {
        if (falg == 100) {
            a();
        } else if (falg == 200) {
            b();
        }
    }

    public  void a() {
        synchronized(lock1) {
            System.out.println(Thread.currentThread().getName() + "a的名字");
            System.out.println(Thread.currentThread().getName() + "进入b方法");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            b();
        }

    }

    public void b() {
        synchronized(lock2) {
            System.out.println(Thread.currentThread().getName() + "b的名字");
            System.out.println(Thread.currentThread().getName() + "进入a方法");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a();
        }
    }
}
