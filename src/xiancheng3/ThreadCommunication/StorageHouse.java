package xiancheng3.ThreadCommunication;

//仓库类
public class StorageHouse {

    private int total = 10;//定义仓库的容量为10吨

    private int current;//定义当前仓库的库存

    //入库的方法(生产者)
    public synchronized void addProduct(){

        if(current < total){//判断当前的库存是否达到最大容量
            current++;//生产者生产商品
            System.out.println(Thread.currentThread().getName() + "生产了商品，目前库存：" + current);

            this.notify();//唤醒消费者消费商品
        }else{//当库存达到最大容量应该让生产者停止生产
            try {
                this.wait();//一定要是线程所用的对象锁的wait方法
                System.out.println("生产者停止生产");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    //出库的方法(消费者)
    public synchronized void reduceProduct(){

        if(current > 0){
            current--;//消费者消费商品
            System.out.println(Thread.currentThread().getName() + "消费了商品，目前库存：" + current);

            //当消费者消费完一次商品之后库存肯定就不满了，就可以唤醒生产者生产商品
            this.notify();
            System.out.println("唤醒了生产者");
        }else{//库存没有商品了，让消费者停止消费
            try {
                this.wait();//让消费者停止消费并且打开对象锁
                System.out.println("消费者停止消费");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
