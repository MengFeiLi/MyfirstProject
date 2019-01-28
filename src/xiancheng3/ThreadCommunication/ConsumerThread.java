package xiancheng3.ThreadCommunication;

public class ConsumerThread extends Thread {

    private StorageHouse house;

    public ConsumerThread(StorageHouse house){
        this.house = house;
    }

    @Override
    public void run() {
        //实现消费商品
        while(true){
            house.reduceProduct();

            try {
                Thread.sleep(1*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
