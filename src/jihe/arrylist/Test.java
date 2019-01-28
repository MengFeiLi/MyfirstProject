package jihe.arrylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        //调用构造方法创建集合对象(可以理解为创建了一个容器，这个容器的默认容量是10)
        //<>是泛型，这个泛型是用来指定集合存储的数据类型
        ArrayList<String> list = new ArrayList<String>();
//		list.add(new File("C:/a.txt"));//存入别的数据类型不可行
        //判断集合的长度(集合中的元素个数)
        int size = list.size();
        System.out.println("size = " + size);

        //往容器中存储字符串(往集合中存入一个元素)
        list.add("张三");
        list.add("李四");
//        添加完元素再次获取集合的长度
        int size2 = list.size();
        System.out.println("size2 = " + size2);

        //删除集合中的元素
        String e = list.remove(1);//根据元素在集合中的索引删除该元素，在删除的同时会把被删除的元素返回
        System.out.println("被删除的元素是：" + e);
        int size3 = list.size();
        System.out.println("size3 = " + size3);

        //获取集合中的元素
        String result = list.get(0);//根据索引获取对应的元素，参数表示索引。
        System.out.println("索引0对应的元素是: " + result);

        //修改集合索引位置的元素
        list.set(0, "王五");//参数一：索引位置     参数二：用于修改的元素
        String result2 = list.get(0);
        System.out.println("result2 = " + result2);


        //判断集合中是否包含参数所指定的元素
        boolean b = list.contains("王五");
        if(b){
            System.out.println("包含指定元素");
        }else{
            System.out.println("不包含指定元素");
        }


        //移除集合中的指定元素(返回值true -> 集合中有指定元素并且成功把元素删除    返回值false -> 集合中没有指定的元素)
        boolean b3 = list.remove("王五");
        if(b3){//true
            System.out.println("删除成功");
        }else{//false
            System.out.println("删除失败");
        }


        //判断集合是否为空(集合中是否有元素)
        boolean b2 = list.isEmpty();
        if(b2){//返回值是true
            System.out.println("集合中没有元素(集合是空的)");
        }else{//返回值是false
            System.out.println("集合中有元素(集合非空)");

        }



        //list集合是有序的可重复的
        list.add("马一");
        list.add("王二");
        list.add("张三");
        list.add("高四");
        //尝试往list集合中存储重复的元素
        list.add("高四");

        String e1 = list.get(0);//获取集合中第一个位置的元素
        String e2 = list.get(1);//获取集合中第二个位置的元素
        String e3 = list.get(2);//获取集合中第三个位置的元素
        String e4 = list.get(3);//获取集合中第四个位置的元素
        String e5 = list.get(4);//获取集合中第五个位置的元素
        //输出结果表明集合中元素存储顺序和往集合中添加元素的顺序是一样的(有序)
        System.out.println(e1 + " " + e2 + " " + e3 + " " + e4 + " " + e5);

//		forList(list);

//		System.out.println(list);//直接按照集合中的元素的存储顺序把集合中的元素打印出来

        //调用foreach遍历集合中的元素
//		foreach(list);

        //调用迭代器去遍历集合
        iteratorEach(list);
    }

    //通过for循环遍历集合
    public static void forList(ArrayList<String> list){

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }


    //通过foreach循环遍历集合
    public static void foreach(ArrayList<String> list){
        for(String s : list){
            System.out.println("s = " + s);
        }
    }


    //通过Iterator遍历集合
    public static void iteratorEach(ArrayList<String> arryList){
        //获取集合对应的游标(迭代器)
        Iterator<String> inter = arryList.iterator();//迭代器迭代的元素类型是String
        //用迭代器遍历集合
        while(inter.hasNext()){//判断游标当前位置的下一位是不是有元素
            //获取下一位的元素并且把游标移动到下一位
            //返回值是迭代出的游标下一位的元素
            String e = inter.next();
            System.out.println("e = " + e);
        }
    }



}
