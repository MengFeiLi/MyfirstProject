package xiancheng.day04____Runnable___Virable;

public class MyRunnable implements Runnable {

    private int i = 10;//票的数量

    //定义线程的功能是卖票
    @Override
    public void run() {
        for(; i > 0; i--){
            System.out.println("卖出的票号：" + i);
        }
    }

}
