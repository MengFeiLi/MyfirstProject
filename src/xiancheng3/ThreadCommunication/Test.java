package xiancheng3.ThreadCommunication;

public class Test {

      public static void main(String[] args) {

        //创建仓库
        StorageHouse house = new StorageHouse();

        //创建生产者线程
        ProductThread product = new ProductThread(house);

        //创建消费者线程
        ConsumerThread consumer = new ConsumerThread(house);

        product.start();//启动生产者线程，让生产者工作
        consumer.start();//启动消费者线程，让消费者工作
    }

}
