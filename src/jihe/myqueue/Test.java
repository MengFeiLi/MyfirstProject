package jihe.myqueue;

public class Test {

    public static void main(String[] args) {

        //验证自定义的队列结构能不能满足规则(先进先出)

        //创建管理整数的队列对象
        MyQueue<Integer> queue = new MyQueue<Integer>();

        //往队列中入队元素
        queue.inQueue(1);
        queue.inQueue(2);
        queue.inQueue(3);
        queue.inQueue(4);

        //检查入队的情况(队列中元素存储的先后顺序)
        System.out.println("队列中的状态：" + queue);

        //检查出队的情况(先出的元素是不是先入的元素)
        int size = queue.size();
        for(int i = 0; i < size; i++){
            int a = queue.outQueue();
            System.out.println("第" + (i + 1) + "次出队的元素：" + a);
        }

        //重新获取元素都出队之后，队列中元素的个数
        int size2 = queue.size();
        System.out.println("元素都出队之后，队列的长度为: " + size2);

    }

}
