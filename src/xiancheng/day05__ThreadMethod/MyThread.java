package xiancheng.day05__ThreadMethod;

public class MyThread extends Thread {

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            //获取当前方法运行于哪个线程的对象
            Thread thread = Thread.currentThread();
            //获取当前的线程的名称
            String name = thread.getName();
            System.out.println(name + " -> " + i);
        }
    }

}
