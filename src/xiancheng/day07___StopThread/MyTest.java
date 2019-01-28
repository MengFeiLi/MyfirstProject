package xiancheng.day07___StopThread;

public class MyTest {

    public static void main(String[] args) {


        MyThread thread = new MyThread();
        thread.start();

        //让主线程休眠1秒
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("主线程休眠完毕，尝试停止子线程");
        //在主线程休眠1秒之后，去停止子线程的运行
//		thread.stop();//不建议用该过时的方法去停止线程，通常是采用设置标志值控制线程的停止
        thread.setFlag(false);//终止子线程的运行

        //同一个线程正常执行完毕或者是半途被终止之后都不能再次被启动
//		thread.start();
    }

}
