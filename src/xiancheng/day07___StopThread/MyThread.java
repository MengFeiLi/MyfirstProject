package xiancheng.day07___StopThread;

//线程的终止：线程中的run方法中的代码全部执行完毕
public class MyThread extends Thread {

    private boolean flag = true;//在线程中定义控制线程终止的标识值

    @Override
    public void run() {

        for(int i = 0; i < 10; i++){

            if(!flag){//当flag的值为false的时候，表示要终止线程的运行
                break;
            }

            System.out.println(Thread.currentThread().getName() + " : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //提供一个公有的方法用于在线程的外部控制标志值
    public void setFlag(boolean b){
        flag = b;
    }

}
