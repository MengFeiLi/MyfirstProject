package xiancheng.day08___StopThread2;

public class MyTest {

    public static void main(String[] args) {


        MyThread thread = new MyThread();
        thread.start();


        //让主线程休眠1秒之后，在去打断子线程的睡眠
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }



            thread.interrupt();//中断线程的睡眠


    }

}
