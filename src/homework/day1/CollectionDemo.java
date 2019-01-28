package homework.day1;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
//        //创建一个集合容器，只用Collection接口的子类，ArrayList
//        ArrayList al = new ArrayList();
//        //1.添加元素
//        al.add("java01");
//        al.add("java02");
//        al.add("java03");
//        al.add("java04");
//        ArrayList ar = new ArrayList();
//        ar.add("java02");
//        ar.add("java04");
//        ar.add("java00");
//        ar.add("java08");
////        al.retainAll(ar);//去交集
//        al.removeAll(ar);
//        sop(al);
//        sop(ar);

//        //打印原集合
//        sop("原集合"+al);
//
//        //2.获取个数。集合长度
//        sop("size:"+al.size());
//
//        //判断元素
//        sop("java03是否存在:"+al.contains("java03"));
//
//        //3.删除元素
//        al.remove("java02");
//        //打印改变后的集合
////        sop("改变后的集合"+arrayList);
//        al.clear();//清空集合
//        //2.获取个数。集合长度
//        sop("刪除后的size:"+al.size());
//        //判断元素
//        sop("java03是否存在:"+al.contains("java03"));
        ArrayList al = new ArrayList();
        //1.添加元素
        al.add("java01");
        al.add("java02");
        al.add("java03");
        al.add("java04");
        Iterator it = al.iterator();
        while (it.hasNext()){
            it.next();

        }
sop();
    }
    public static void sop(){

    }
}
