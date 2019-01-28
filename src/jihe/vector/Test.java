package jihe.vector;

import java.util.Enumeration;
import java.util.Vector;

public class Test {

    public static void main(String[] args) {

        //创建老版ArrayList
        Vector<String> vector = new Vector<String>();

        //往向量集合中添加元素
        vector.add("张三");
        vector.add("李四");
        vector.add("王五");
        vector.add("马六");

        //往集合中添加重复元素
        vector.add("李四");


        //根据元素的索引获取元素
        String str = vector.get(3);
        System.out.println("str = " + str);


        //通过枚举接口罗列向量集合中的元素
        Enumeration<String> enumer = vector.elements();
        while(enumer.hasMoreElements()){//判断有没有下一个元素
            //此方法的返回值返回的是向量集合中的元素
            String s = enumer.nextElement();//获取下一个元素并且移动到下一位
            System.out.println("s = " + s);
        }

    }

}
