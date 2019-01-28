package jihe.linkedlist;

import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {

        //创建存储String的链式集合
        LinkedList<String> linkList = new LinkedList<String>();
        //往集合中存储数据
        linkList.add("张三");
        linkList.add("李四");
        linkList.add("王五");
        linkList.add("赵六");
        //尝试往LinkedList中添加重复元素
        linkList.add("张三");
        linkList.add("王五");
        //获取集合中的元素的个数(集合长度)
        int size = linkList.size();
        System.out.println("size = " + size);
        //用迭代器遍历集合中的元素
        //linkList.iterator();

        //用foreach循环遍历集合

        //把集合中的元素用元素的字符串表示形式输出
        System.out.println("linkList = " + linkList);


        //把集合中的元素全部清空
        linkList.clear();
        System.out.println("清空之后集合的长度：" + linkList.size() + " linkList = " + linkList);

        //调用往头部添加元素的方法往集合的头部添加元素
        linkList.addFirst("张三");
        linkList.addFirst("李四");
        linkList.addFirst("王五");
        linkList.addFirst("赵六");


        //输出往头部添加元素之后集合中的状态
        System.out.println("first linkList = " + linkList);

        //获取集合的头部元素
        String firstElement = linkList.getFirst();
        System.out.println("获取集合头部元素是：" + firstElement);

        //移除集合的头部元素
        String removeElement = linkList.removeFirst();//返回值表示被移除的元素
        System.out.println("被移除的头部元素是：" + removeElement);
        linkList.removeFirst();
        System.out.println("移除头部之后集合的状态：" + linkList);


    }

}
