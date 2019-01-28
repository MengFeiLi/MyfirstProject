package xiancheng2.day04_ThreadDeadLock;

public class Test {

    public static void main(String[] args) {

        MyRunnable run = new MyRunnable();

        Thread t1 = new Thread(run);
        run.setFlag(100);//表示应该调用a()
        t1.start();

        //让主线程睡眠1秒，延时启动线程2
        //保证线程1能够先进入方法a中执行
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Thread t2 = new Thread(run);
        run.setFlag(200);//表示应该调用b()
        t2.start();
    }

}
