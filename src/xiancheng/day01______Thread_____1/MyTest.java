package xiancheng.day01______Thread_____1;

public class MyTest {
    public static void main(String[] args) {
        //创建线程子类对象(在本程序中开辟另外的一条执行路径【执行单元】)
        MyThread thread = new MyThread();
        //启动线程对象(在程序中真实的创建一个执行单元)
        thread.start();//(当CPU执行该线程的时候，其实调用的是该线程的run方法)

        //在主线程中也添加一个循环
        for (int i=0;i<10;i++){
            System.out.println("在主线程中运行的代码"+i);
        }
    }
}
