package jihe.arrylist.arrylist;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //调用构造方法创建集合对象(可以理解为创建了一个容器，这个容器的默认容量是10)
        //<>是泛型，这个泛型是用来指定集合存储的数据类型
        ArrayList<String> arrayList = new ArrayList<String>();
        //判断集合的长度(集合中的元素个数)
        //往容器中存储字符串(往集合中存入一个元素)
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王二");
        arrayList.add("刘一");
        //判断集合的长度(集合中的元素个数)
        int size = arrayList.size();
        System.out.println("集合中的元素个数:" + size);
        //添加完元素再次获取集合的长度
        int size1 = arrayList.size();
        System.out.println("元素:" + size1);
        //删除集合中的元素
        String e = arrayList.remove(1);//根据元素在集合中的索引删除该元素，在删除的同时会把被删除的元素返回
        System.out.println("被删除的元素是：" + e);
        int size3 = arrayList.size();
        System.out.println("删除元素后集合的长度: = " + size3);
        //获取集合中的元素
        String relut = arrayList.get(1);
        System.out.println(relut);
        //修改集合索引位置的元素
        arrayList.set(2, "天王");
        String relut1 = arrayList.get(2);
        System.out.println("修改集合索引位置的元素:" + relut1);
        //判断集合中是否包含参数所指定的元素
        boolean b = arrayList.contains("刘一");
        if(b){
            System.out.println("包含指定元素");
        }else{
            System.out.println("不包含指定元素");
        }
        //移除集合中的指定元素(返回值true -> 集合中有指定元素并且成功把元素删除    返回值false -> 集合中没有指定的元素)
        boolean b2 = arrayList.remove("王");
        if(b2){//true
            System.out.println("删除成功");
        }else{//false
            System.out.println("删除失败");
        }
        //判断集合是否为空(集合中是否有元素)

    }
}
