package xiancheng.day02______Thread_______2;

public class MyRunnable implements Runnable {
    //此方法中的代码决定了通过MyRunnable创建的线程的功能



    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("在子线程中运行的代码:"+i);
        }
    }
}
