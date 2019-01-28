package xiancheng.day05__ThreadMethod;

import java.lang.Thread.State;

public class MyTest {

    public static void main(String[] args) {

        MyThread thread = new MyThread();

        //判断线程是否处于活动状态
        boolean alive = thread.isAlive();
        System.out.println("在线程启动之前，活跃状态 -> " + alive);
        //获取线程启动之前的状态
        State state = thread.getState();
        System.out.println("在线程启动之前，线程的状态 -> " + state.name());
        //设置线程的名称
        thread.setName("t1");
        //设置线程为守护线程(当程序运行完成之后，如果守护线程的代码还没有执行完，那么该守护线程也会直接被终止掉)
        thread.setDaemon(true);//true表示是守护线程      false表示不是(默认值)
        //启动线程
        thread.start();


        System.out.println("当线程启动之后，活跃状态 -> " + thread.isAlive());
        System.out.println("当线程启动之后，线程的状态值 -> " + thread.getState().name());

        //直接调用线程的run方法(并不会开辟子线程)
        //run方法中的代码直接在调用run方法的位置所在的线程中执行
//		thread.run();

        MyThread thread1 = new MyThread();
//		thread1.start();

//		for(int i = 0; i < 10; i++){
//			//获取当前的线程对象
//			Thread currentThread = Thread.currentThread();
//			//获取当前的线程的名字
//			String name = currentThread.getName();
//			System.out.println(name + " -----> " +i);
//		}


    }

}
