package xiancheng3.ThreadCommunication.TheadCommunication;

public class ConsumerThread extends Thread {
    private StorageHouse house;

    public ConsumerThread(StorageHouse house) {
        this.house = house;
    }

    @Override
    public void run() {
        while (true) {
            house.reduceProduct();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
