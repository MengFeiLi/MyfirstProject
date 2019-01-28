package xiancheng.day05__ThreadMethod.threadMethod;


public class MyTest {
    public static void main(String[] args) {
//
//        MyThread thread1 = new MyThread("00----------");
//        MyThread thread2 = new MyThread("11---");
//        MyThread thread3 = new MyThread("22------");
//
//        thread1.start();
//        boolean alive = thread1.isAlive();//判断线程是否处于活跃状态
//        System.out.println(alive);
//        thread2.start();
//        thread3.start();
//        Type t = Type.NEW;
//        System.out.println(t.ordinal());

        eat(Type.NEW);

    }

//枚举
    public static void eat(Type k){
        switch (k){
            case NEW:
                System.out.println("吃苹果");
                break;
            case BLOCKED:
                System.out.println("吃hn");
                break;
            case QQQ:
                System.out.println("吃苹果ddsfsj");
                break;
            case RUNNABLE:
                System.out.println("吃苹果-----");
                break;
                default:
                    break;
        }
    }

}
