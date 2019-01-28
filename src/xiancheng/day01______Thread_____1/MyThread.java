package xiancheng.day01______Thread_____1;


//创建Thread的子类
public class MyThread extends Thread {
    //重写父类的run()方法,定义线程额功能


    @Override
    public void run() {
        //定义线程的功能
        for (int i=0;i<10;i++){
            System.out.println("在子线程中运行的代码"+i);
        }
    }
}
