package jihehomework.day05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args){
        User user = null;
        ArrayList arr = new ArrayList();

        for(int i = 0; i<10 ; i++){
            user = new User();
            user.name=new Integer(i).toString();
            user.password=new Integer(i).toString();
            arr.add(user);
        }
        //获取集合对应的游标(迭代器)
        Iterator<User> inter = arr.iterator();//迭代器迭代的元素类型是String
        //用迭代器遍历集合
        while(inter.hasNext()){//判断游标当前位置的下一位是不是有元素
            //获取下一位的元素并且把游标移动到下一位
            //返回值是迭代出的游标下一位的元素
            User e = inter.next();
            System.out.println("e = " + e);
        }
    }
}

