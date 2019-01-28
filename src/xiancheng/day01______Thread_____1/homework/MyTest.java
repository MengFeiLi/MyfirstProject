package xiancheng.day01______Thread_____1.homework;

public class MyTest {
    public static void main(String[] args) {
      new MyThread().start();

//        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程运行的代码" + i);
        }
    }
}
