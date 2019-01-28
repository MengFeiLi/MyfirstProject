package xiancheng.day06___ThreadMethod2;

public class MyThread extends Thread {

    @Override
    public void run() {

        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + " -> " + i);

            //让当前的线程休眠1秒
            try {
                Thread.sleep(1000);//参数的含义：让线程休眠的时长
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
