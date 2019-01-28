package lee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        //创建一个HashMap存储自定义的元素类型
        HashMap<String, Student> map = new HashMap<String, Student>();


        //创建第一个学生对象，并且存储到Map集合中
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(19);
        map.put("stu1", stu1);

        //创建第二个学生对象，并且存储到Map集合中
        Student stu2 = new Student();
        stu2.setName("张三");
        stu2.setAge(19);
        map.put("stu2", stu2);

        //创建第三个学生对象，并且存储到Map集合中
        Student stu3 = new Student();
        stu3.setName("张三");
        stu3.setAge(19);
        map.put("stu3", stu3);

        System.out.println(map);
        //观察map集合中的状态，value值是可以重复的


        //==================================


        //用自定义的类型做为Map的键值
        HashMap<Student, String> map2 = new HashMap<Student, String>();

        //创建第一个学生对象，并且把学生对象作为Map集合的键值
        Student keyStu1 = new Student();
        keyStu1.setName("张三");
        keyStu1.setAge(19);
        map2.put(keyStu1, "学生1");

        //创建第二个学生对象，并且把学生对象作为Map集合的键值
        Student keyStu2 = new Student();
        keyStu2.setName("张三");
        keyStu2.setAge(19);
        map2.put(keyStu2, "学生2");

        //创建第三个学生对象，并且把学生对象作为Map集合的键值
        Student keyStu3 = new Student();
        keyStu3.setName("张三");
        keyStu3.setAge(18);
        map2.put(keyStu3, "学生3");

        System.out.println(map2);
        /*
         * 当用自定义类型作为HashMap的键值的时候，必须保证键值在HashMap中不可重复
         * 因为键值是在HashSet中存储，所以要保证键值不重复，就可以按照保证HashSet中的元素不重复的方式来实现
         */



        //============================

        /*
         * 有3个班，每个班5个人，统计这3个班的学生的平均年龄，分别统计每个班的学生的平均年龄
         * (用集合实现)
         */

        //用一个Map对象存储一个班的对象
        //用一个List集合存储所有的班级


		/*
		ArrayList<HashMap<String, Student>> allClassList = new ArrayList<HashMap<String, Student>>();

		Scanner input = new Scanner(System.in);
		System.out.print("请输入班级数：");
		int classNum = input.nextInt();//班级的数量
		//通过for循环创建classNum个班级
		for(int i = 0; i < classNum; i++){
			//创建表示当前班级的Map对象
			HashMap<String, Student> classMap = new HashMap<String, Student>();
			System.out.println("请输入第" + (i + 1) + "个班级的人数");
			int stuNum = input.nextInt();//该班级中的学生的个数
			//通过for循环创建本班的stuNum个学生对象
			for(int j = 0; j < stuNum; j++){

				//创建本班的第j+1个学生
				Student stu = new Student();
				System.out.println("请输入第" + (i + 1) + "个班级的第" + (j + 1) + "个学生的姓名：");
				stu.setName(input.next());
				System.out.println("请输入第" + (i + 1) + "个班级的第" + (j + 1) + "个学生的年龄：");
				stu.setAge(input.nextInt());
				//把本班的该学生存入本班中
				classMap.put((j + 1) + "", stu);

			}
			//把创建好学生的当前班级存入到List集合中方便管理
			allClassList.add(classMap);
		}



		//根据班号求平均值
		System.out.println("请输入要求的班级的班级号：0 - " + (classNum - 1));
		int numOfClass = input.nextInt();
		//取该班级号的班级
		HashMap<String, Student> oneClass = allClassList.get(numOfClass);
		//求该班级的平均值
		int sum = 0;//存储该班学生的年龄和
		for(int i = 0; i < oneClass.size(); i++){
			//取第i个学生
			Student stu = oneClass.get((i + 1) + "");
			sum += stu.getAge();
		}
		//求平均值
		int average = sum / oneClass.size();
		System.out.println("第" + numOfClass + "个班级的学生的平均值是：" + average);




		//求所有班级的平均值
		int totalAge = 0;//所有班级的学生的总年龄
		int totalStudentCount = 0;//所有班级的学生的总个数
		for(int i = 0; i < allClassList.size(); i++){
			//获取当前班级
			HashMap<String, Student> aClass = allClassList.get(i);
			//遍历该班级中的所有学生
			for(int j = 0; j < aClass.size(); j++){
				//获取该班的某一个学生
				Student stu = aClass.get((j + 1) + "");
				totalAge += stu.getAge();//对该班的所有学生的年龄进行累加
				totalStudentCount++;//计算所有班级的学生总个数
			}

		}
		//求平均值
		int totalAverage = totalAge / totalStudentCount;
		System.out.println("所有班级的学生的平均年龄是：" + totalAverage);

		*/



        //============通过Entry遍历Map中的元素===========
        HashMap<String, String> myMap = new HashMap<String, String>();
        myMap.put("a", "jim");
        myMap.put("b", "tom");
        myMap.put("c", "lucy");
//		myMap.keySet();//可以通过此种方式遍历map
        //使用Entry遍历Map中的元素
        Set<Entry<String, String>> allEntry = myMap.entrySet();
        Iterator<Entry<String, String>> inter = allEntry.iterator();
        while(inter.hasNext()){
            //map集合中的一个键值对
            Entry<String, String> entry = inter.next();
            //获取键值对中的键值
            String key = entry.getKey();
            //获取键值对中的value值
            String value = entry.getValue();
            System.out.println("key = " + key + " , value = " + value);
        }


    }
}
