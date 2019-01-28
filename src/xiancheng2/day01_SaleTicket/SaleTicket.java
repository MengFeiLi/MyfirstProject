package xiancheng2.day01_SaleTicket;

import java.io.File;

public class SaleTicket implements Runnable {

    private int total = 10;//表示10张票

    private int i = 1;//变量i表示当前卖出的票号

//	private File f = new File("");

//	String s = "m";

    @Override
    public void run() {
//		File f = new File("");

        for(; i <= total;){//变量i表示当前卖出的票号

            //要保证线程同步的时候数据的访问是安全的
            //则以下的两行代码必须保证在一个线程中先后依次执行，中间不能有的别的线程插入执行
            synchronized(this){
                    //加判断：当线程1已经进入for循环，线程2把票已经买到10号了，并且把票号修改到11打开对象锁
                    //线程1此时就不用进行for循环的判断，直接进入到同步代码块中输出票号11
                    if(i <= total ){
                        System.out.println(Thread.currentThread().getName() + " -> " + i);
                        i++;

                        //让当前的窗口卖出一张票之后，等待1秒在打开锁
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
