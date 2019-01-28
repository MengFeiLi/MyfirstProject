package xiancheng.day03____Thread___Virable;

public class MyThread extends Thread {
    private int b = 10;//票的个数

    //构造方法的特性：1.方法名与类名相同2.无返回值
    private  String k;
    public  MyThread(String k) {
        this.k = k;

    }

    //定义线程的功能是卖票

 public void run() {
        for (int i = 0; i < b; i++) {
            System.out.println(k+"卖出票号:" + i);
        }
    }
}
