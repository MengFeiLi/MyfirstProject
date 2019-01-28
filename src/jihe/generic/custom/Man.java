package jihe.generic.custom;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Man extends Person {

    public static void main(String[] args) {


        //创建以String作为key值，以String作为value值的一个映射
        HashMap<String, String> map = new HashMap<String, String>();
        //往映射中存储数据(格式：键值对)
        map.put("name1", "张三");
        map.put("name2", "李四");
        map.put("name3", "王五");
        map.put("name4", "马六");
        map.put("name5", null);
        map.put(null, "a");

        //输出映射中的状态，看下结果
        //(map中的key值不可重复，添加顺序和存储的顺序不一定一样，原因：key会在HashSet中存储)
        //map中的key值可以为null，value值也可以为null
        System.out.println(map);


        //取Map中的元素(key-value对)
        String result = map.get(null);//根据键值取value值
        System.out.println("null键值对应的value值是：" + result);
        String result2 = map.get("name3");//根据键值取value值
        System.out.println("name3键值对应的value值是：" + result2);


        //删除Map中的元素(一个键值对)
        String removedValue = map.remove(null);//根据键值删除该键值对应的键值对
        System.out.println("被删除的元素是：" + removedValue);
        //输出map集合的状态，查看删除后的结果
        System.out.println(map);


        //判断映射中是否包含某一个键值
        boolean b = map.containsKey("name3");//映射中是否包含name3键值
        if(b){
            System.out.println("映射中包含该key值");
        }else{
            System.out.println("map集合中不包含该key值");
        }


        //判断映射中是否包含某一个value值
        boolean b2 = map.containsValue("小七");//返回值true -> 有     false -> 无
        if(b2){
            System.out.println("映射中有该人名");
        }else{
            System.out.println("映射中没有该人名");
        }


        //判断映射是不是空集合(有没有元素)
        boolean b3 = map.isEmpty();
        if(b3){
            System.out.println("集合中没有元素");
        }else{
            System.out.println("集合中有元素");
        }

        //获取映射中键值对的个数
        int size = map.size();
        System.out.println("映射中的键值对的个数：" + size);

        //获取映射中的key值的集合
        Set<String> keySet = map.keySet();
        System.out.println("输出Map集合中的所有的键值：" + keySet);
        Iterator<String> iter = keySet.iterator();
        while(iter.hasNext()){//判断迭代器当前位置是否有下一位元素
            String key = iter.next();//取迭代器的下一位元素(key值)并且把迭代器往下移一位
            String value = map.get(key);//根据遍历到的key值取value值
            System.out.print(key + "->" + value + "  ");
        }


        System.out.println();
        //获取映射中的value值的集合
        Collection<String> valueList = map.values();
        Iterator<String> inter = valueList.iterator();
        while(inter.hasNext()){
            String value = inter.next();
            System.out.print("value = " + value + " ");

        }


        System.out.println();
        //清空映射中的所有元素
        map.clear();
        //观察清空后的结果
        System.out.println("清空后map中的元素状态：" + map);
        System.out.println("清空之后map中的元素的个数：" + map.size());

    }
}
