package jihe.myqueue;

import java.util.LinkedList;
/*
 * 队列：先进先出
 */
public class MyQueue<Q> {

    private LinkedList<Q> list;

    //为创建的队列对象创建一个LinkedList集合用于实现对于元素的管理
    public MyQueue(){

        list = new LinkedList<Q>();
    }

    //定义入队的方法(把元素添加到队列中) -> 添加到队尾
    public void inQueue(Q e){
        list.addLast(e);
    }

    //定义出队的方法(把元素从队列中移除) -> 移除队头
    public Q outQueue(){
        Q e = list.removeFirst();
        return e;
    }


    //重写toString
    @Override
    public String toString() {
        String str = list.toString();
        return str;
    }

    //定义返回队列长度的方法
    public int size(){
        int size = list.size();
        return size;
    }
}
