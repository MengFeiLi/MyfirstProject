package xiancheng.day02______Thread_______2;

public class MyTest {
    public static void main(String[] args) {
        //创建MyRunnable的对象
        MyRunnable runnable = new MyRunnable();
        //基于MyRunnable的对象创建线程对象
        Thread thread = new Thread(runnable);
        //启动线程
        thread.start();//当该子线程运行起来之后，CPU会调用MyRunnable中的run（）

        //在主线程中添加一个for循环
        for (int i=0;i<10;i++){
            System.out.println("运行在主线程中的代码:"+i);
        }
    }
}
