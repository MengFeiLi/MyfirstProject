package xiancheng.day04____Runnable___Virable.virble;

public class MyRunnable implements Runnable {

    private int num = 10;

    private String k;

    public MyRunnable(String k){
        this.k = k;
    }
    public MyRunnable(){

    }

    @Override
    public void run() {
        for (int i=1;i<=num;i++){
            System.out.println(k+"卖出票号:"+i);
        }
    }
}