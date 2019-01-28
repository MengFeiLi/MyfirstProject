package lianxi.lianxi04;

import java.util.ArrayList;
import java.util.Iterator;

//去除ArrayList集合中的重复元素
public class ArrayListTest {
    public static void sop(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("java01");
        al.add("java02");
        al.add("java01");
        al.add("java02");
        al.add("java03");
        sop(al);
        singleElement(al);
        sop(al);

    }

//    Iterator it = al.iterator();
//        while (it.hasNext()) {
//        Object obj = it.next();
//        if (!newAl.contains(obj)) {
//            newAl.add(obj);
//        }
//        return newAl;
//    }
    public static void singleElement(ArrayList al) {
        //定义一个临时容器
        ArrayList newAl = new ArrayList();
        for (Iterator it = al.iterator();it.hasNext();){
            Object obj = it.next();
            if (!newAl.contains(obj)){
                newAl.add(obj);
            }
            return ;
        }
    }
}
