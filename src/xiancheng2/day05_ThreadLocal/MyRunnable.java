package xiancheng2.day05_ThreadLocal;

public class MyRunnable implements Runnable {

    //创建用于存储在多个线程之间共享变量的ThreadLocal对象
    private static ThreadLocal<Student> local = new ThreadLocal<Student>();

    @Override
    public void run() {

        Student stu = local.get();
        if(stu == null){//表示该方法被线程第一次调用
            stu = new Student();//创建学生对象
            local.set(stu);//把创建出来的学生对象存入ThreadLocal用于在多个线程之间进行共享
        }
        //基于以上的代码分析，多个线程操作的应该是同一个学生对象


        //验证多个线程所访问的学生对象是不是同一个对象
        int age = (int) (Math.random() * 100 + 1);
        System.out.println(Thread.currentThread().getName() + "修改年龄值为： " + age);



        stu.setAge(age);
        System.out.println(Thread.currentThread().getName() + "第一次读年龄为： -> " + stu.getAge());

        //让线程一第二次读取年龄值之前休眠，保证线程二一定能够把学生的年龄值修改为一个新的值
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println();
        System.out.println(Thread.currentThread().getName() + "第二次读年龄为：-> " + stu.getAge());
    }

}
