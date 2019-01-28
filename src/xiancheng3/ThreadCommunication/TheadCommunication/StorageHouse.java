package xiancheng3.ThreadCommunication.TheadCommunication;

/**
 * 仓库类
 */
public class StorageHouse {

    private int total = 10;//仓库的容量

    private int cut;

    public synchronized void addProduct() {
        if (cut < total) {
            cut++;
            System.out.println(Thread.currentThread().getName() + "生产者生产"+"库存:"+cut);
            this.notify();
        } else {//仓库满了
            try {
                this.wait();//
                System.out.println("生产者停止生产");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void reduceProduct() {
        if (cut > 0) {
            cut--;
            System.out.println(Thread.currentThread().getName() + "消费者消费"+"库存:"+cut);
            this.notify();
        } else {//仓库库存为0
            try {
                System.out.println("消费者停止消费");
                this.wait();//
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}
