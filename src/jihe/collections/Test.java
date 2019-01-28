package jihe.collections;

import java.util.*;

/*
 * 演示Collections工具类的使用
 */
public class Test {

    public static void main(String[] args) {

        //创建集合对象
        List<String> list = new ArrayList<String>();
        list.add("ad");
        list.add("ab");
        list.add("abc");
        list.add("cm");
        System.out.println("list = " + list);


        //对集合进行排序(对集合进行升序排列)
        Collections.sort(list);//参数：表示被排序的集合
        System.out.println("排序的结果：" + list);

        //把集合重新打乱
        Collections.shuffle(list);//参数：表示的是被操作的集合
        System.out.println("打乱顺序的集合： " + list);

        //交换集合中的元素
        Collections.swap(list, 1, 3);//参数一：被操作的集合    参数二和三：交换的位置
        System.out.println("交换元素之后的结果： " + list);


        //求集合中的最大元素
        String maxElement = Collections.max(list);//参数：被查找的集合
        System.out.println("集合中的最大元素：" + maxElement);

        //求集合中的最小元素
        String minElement = Collections.min(list);//参数：被查找的集合
        System.out.println("集合中的最小元素： " + minElement);

        //集合拷贝
        ArrayList<String> destList = new ArrayList<String>();//创建用于存储拷贝出的元素的集合
        //保证集合的长度和源集合的长度是一样的或者大于源集合
        destList.add("1");
        destList.add("2");
        destList.add("3");
        destList.add("4");
        destList.add("5");
        destList.add("6");
        //实现拷贝
        Collections.copy(destList, list);
        System.out.println("拷贝完成之后目标集合: " + destList);
        System.out.println("拷贝完成之后源集合: " + list);


        //反转集合中的元素顺序
        Collections.reverse(destList);//参数：被操作的集合
        System.out.println("反转后的结果：" + destList);

    }

}
