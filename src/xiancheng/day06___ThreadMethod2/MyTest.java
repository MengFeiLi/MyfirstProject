package xiancheng.day06___ThreadMethod2;

public class MyTest {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        for(int i = 0; i < 10; i++){

            System.out.println(Thread.currentThread().getName() + " -> " + i);

            if( i == 4){
                //让当前(主)线程让出cpu的执行权，以便别的线程有机会获得CPU的执行权
                Thread.yield();
            }

            if(i == 5){
                //让子线程加入到主线程的执行流程中
                //加入成功之后会导致主线程被阻塞，直到子线程执行完，主线程才能接着运行
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            //让当前的线程休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
