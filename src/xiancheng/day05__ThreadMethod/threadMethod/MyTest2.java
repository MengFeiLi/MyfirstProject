package xiancheng.day05__ThreadMethod.threadMethod;

import java.lang.Thread.State;

public class MyTest2 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        boolean alive=thread.isAlive();
        System.out.println("活跃状态"+alive);

        State state =thread.getState();
        System.out.println("开启前的线程状态:"+state);

        thread.setName("t1");

//        thread.setDaemon(true);





        thread.start();

        System.out.println("活跃状态"+thread.isAlive());
        System.out.println("开启后的线程状态:"+thread.getState());

        int sum=10;
        for (int i=1;i<=sum;i++){
            Thread thread1=Thread.currentThread();
            String s=thread1.getName();
            System.out.println(s);
        }

    }
}
