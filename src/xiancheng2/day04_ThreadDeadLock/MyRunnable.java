package xiancheng2.day04_ThreadDeadLock;

public class MyRunnable implements Runnable {

    private String lock1 = "a";//对象锁1

    private String lock2 = "b";//对象锁2

    private int flag;//表示线程应该调用哪个方法（100 表示t1 应该a()    200表示t2 应该b()）

    public void setFlag(int flag){
        this.flag = flag;
    }

    @Override
    public void run() {

        if(flag == 100){//线程t1在运行
            a();
        }else if(flag == 200){//线程t2
            b();
        }

    }

    public void a(){
        synchronized(lock1){
            System.out.println(Thread.currentThread().getName() + "进入方法a");
            System.out.println(Thread.currentThread().getName() + "准备进入方法b");

            //睡眠时间大于主线程中的睡眠时间，目的是保证线程1还没把方法a执行完之前，把线程2启动
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            b();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void b(){
        synchronized(lock2){

            System.out.println(Thread.currentThread().getName() + "进入方法b");
            System.out.println(Thread.currentThread().getName() + "准备进入方法a");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            a();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
