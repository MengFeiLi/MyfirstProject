package xiancheng.day03____Thread___Virable;

public class MyTest {
    public static void main(String[] args) {
        //3个窗口同时卖票
//        MyThread thread1 = new MyThread();//第一个窗口
//
//        MyThread thread2 = new MyThread();//第二个窗口
//
//        MyThread thread3 = new MyThread();//第三个窗口

        MyThread thread1 = new MyThread("窗口一:");//第一个窗口

        MyThread thread2 = new MyThread("窗口二:");//第二个窗口

        MyThread thread3 = new MyThread("窗口三:");//第三个窗口



        //开始卖票
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
