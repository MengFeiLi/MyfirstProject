package xiancheng3.ThreadCommunication.TheadCommunication;

public class Test {
    public static void main(String[] args) {
        StorageHouse storageHouse = new StorageHouse();

        ProductThread thread1 = new ProductThread(storageHouse);
        ConsumerThread thread2 = new ConsumerThread(storageHouse);

        thread1.start();
        thread2.start();
    }
}
