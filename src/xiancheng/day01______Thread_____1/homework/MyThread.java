package xiancheng.day01______Thread_____1.homework;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程运行的代码" + i);
        }
    }
}
