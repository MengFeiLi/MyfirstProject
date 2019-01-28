package xiancheng.day03____Thread___Virable.virable;

public class MyThread extends Thread {

    private int num = 10;

    private String k;

    public MyThread(String k){
        this.k = k;
    }
    @Override
    public void run() {
        for (int i=1;i<=num;i++){
            System.out.println(k+"卖出票号:"+i);
        }
    }
}