package xiancheng.day07___StopThread.StopThread;

public class MyThread extends Thread {

    private boolean flag =true;
    @Override
    public void run() {
        for (int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+i);

            if (!flag){
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void setFlag(boolean b){
         flag = b;
    }
}
