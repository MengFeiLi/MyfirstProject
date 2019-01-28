package jihe.test.generic;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //创建有不带泛型的集合
        ArrayList list = new ArrayList();


        //创建3种类型的对象
        File f = new File("E:/a.txt");
        String s = new String("abc");
        Scanner c = new Scanner(System.in);

        //把3中不同类型的对象都存入集合中（因为集合会把不同类型的元素统统转换成Object类型）
        list.add(f);
        list.add(s);
        list.add(c);

        //找到集合中的scanner
        for (int i=0;i<list.size();i++){
            Object object = list.get(i);
            if (object instanceof Scanner){
                //取没有泛型的集合中的元素的时候需要强制类型转换
                Scanner scan = (Scanner) object;
                String str = scan.next();
                System.out.println(str);
            }
        }
        //基于以上的代码分析，集合中的泛型可以对元素进行类型检查，除此之外存入带有泛型的集合中的元素统统不会丢失类型
        //在取泛型中的元素的时候也不需要进行强制类型转换

        //=============使用自定义的泛型类=============
//		Student<int> stu = new Student<int>();//泛型必须是引用数据类型
        //当创建泛型类的对象的时候，传入一个数据类型，这个数据类型就是泛型的类型
        Student<Integer> stu = new Student<Integer>();
        stu.setA(10);
        System.out.println("a = "+stu.getA());
        Student<String> stu1 = new Student<String>();
        stu1.setA("haha");
        System.out.println("stu1.a = " + stu1.getA());


    }
}
