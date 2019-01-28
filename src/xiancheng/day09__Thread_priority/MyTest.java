package xiancheng.day09__Thread_priority;

public class MyTest {

    public static void main(String[] args) {

//        MyThread t1 = new MyThread();
//        int priority1 = t1.getPriority();//获取线程的默认优先级
//        System.out.println("t1 priority ->　" + priority1);
//        t1.start();
//        MyThread t2 = new MyThread();
//
//        t2.setPriority(10);//设置线程的优先级
//        int priority2 = t2.getPriority();
//        System.out.println("t2 priority -> " + priority2);
//        t2.start();

        MyThread thread1 = new MyThread();

        MyThread thread2 = new MyThread();

        System.out.println(thread1.getPriority());
        thread1.start();

        thread2.setPriority(10);
        System.out.println(thread2.getPriority());
        thread2.start();

    }

}
