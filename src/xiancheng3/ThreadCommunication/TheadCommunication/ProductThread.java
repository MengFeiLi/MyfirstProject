package xiancheng3.ThreadCommunication.TheadCommunication;

public class ProductThread extends Thread {
    private StorageHouse house;

    public ProductThread(StorageHouse house) {
        this.house = house;
    }

    @Override
    public void run() {
        while (true) {
            house.addProduct();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
