package xiancheng3.ThreadCommunication;

public class ProductThread extends Thread {

    private StorageHouse house;//仓库

    public ProductThread(StorageHouse house){
        this.house = house;
    }

    @Override
    public void run() {
        //实现生产商品
        while(true){

            house.addProduct();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
