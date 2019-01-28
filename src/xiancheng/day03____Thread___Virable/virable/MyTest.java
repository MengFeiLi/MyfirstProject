package xiancheng.day03____Thread___Virable.virable;

public class MyTest{

    public static void main(String[] args) {
        MyThread thread1 = new MyThread("窗口一------------");
        MyThread thread2 = new MyThread("窗口二-----");
        MyThread thread3 = new MyThread("窗口三-------");


        thread1.start();
        thread2.start();
        thread3.start();
    }
}