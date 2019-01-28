package jihehomework.collection;
import java.util.ArrayList;

import static jihehomework.collection.CollectionDemo.sop;


public class Test {
    //创建一个集合容器，使用Coll接口的子类，ArrayList
    public static void main(String[] args) {

        //5.取交集，只保留两组元素中相同的元素
        ArrayList al1 = new ArrayList();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);
        ArrayList al2 = new ArrayList();
        al2.add(2);
        al2.add(3);
        al2.add(5);
        al2.add(6);
        al1.retainAll(al2);
        sop(al2);
        sop(al1);





       ArrayList al = new ArrayList();
        //1.添加元素
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        //打印元集合集合
        sop(al);
        //3.删除元素
        al.remove(2);
        sop(al);
        //4.清空元素
//        al.clear();
//        sop(al);
        //5.判断元素
        sop("3是否存在:"+al.contains(3));
        sop("集合是否为空?"+al.isEmpty());
        //2.获取个数，集合长度
        sop("size" + al.size());
    }
}
