package jihe.mystack;

import java.util.LinkedList;

//此类的作用是实现一个栈(Stack)的数据结构
public class MyStack<T> {

    private LinkedList<T> list;

    public MyStack(){
        //伴随栈的对象的创建，创建一个LinkedList,用LinkedList管理元素的添加和删除
        list = new LinkedList<T>();
    }

    /*元素 ：张三 李四   王五
     *
     * 张三
     *
     * 李四  张三
     *
     * 王五   李四  张三
     */
    //往栈中添加元素的方法
    public boolean pull(T t){
        list.addFirst(t);
        return true;
    }

    //取栈中元素的方法
    public T pop(){//出栈操作室固定的：只能出栈顶的元素(出栈是把元素从栈中移除)
        T e = list.removeFirst();
        return e;
    }

    //重写MyStack的toString，方便识别栈中的元素
    @Override
    public String toString() {
        return list.toString();
    }

    //获取栈中元素的个数
    public int size(){
        return list.size();
    }
}
