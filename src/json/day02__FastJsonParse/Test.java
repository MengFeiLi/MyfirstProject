package json.day02__FastJsonParse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/*
 * fastjson对于json解析的代码实现
 */
public class Test {

    public static void main(String[] args) {



        //创建有两个键值对的json对象格式的字符串
        String jsonObjStr = "{\"name\":\"张三\",\"age\":\"17\"}";

        //使用fastjson实现对上述json字符串的解析

        //基于json对象字符串创建JSONObject对象用于表示该字符串
        JSONObject jsonObj = JSON.parseObject(jsonObjStr);//（1）相当于官方json库中  JSONObject object = new JSONObject(json);

        String name = jsonObj.getString("name");//获取name值
        String age = jsonObj.getString("age");//获取年龄值
        System.out.println(name + "   " + age);

        //在fastjson类库中没有提供opt版本的方法
//		jsonObj.opt** 没有


        //尝试获取key值不存在的value值
        //如果是按照引用类型的方式获取数据，则该方法返回的是引用数据类型的默认值 -> null (空对象)
        //如果是按照基本数据类的方式获取数据，则该方法返回的是基本数据类型的默认值 -> 0
        //即：fastjson的get方法会对官方的解析库中的get和opt方法进行合成 //（2）重要
		/*
		String sex = jsonObj.getString("sex");
//		sex.length();
		System.out.println(sex);

		Integer sex2 = jsonObj.getInteger("sex");
		System.out.println(sex2);

		int sex3 = jsonObj.getIntValue("sex");
		System.out.println(sex3);
		*/




        //把json字符串中的数据直接封装到一个对象
        //此方法执行完毕之后会创建一个学生对象，并且该学生对象中会存储json字符串中的name和age对应的值
        Student stu = JSON.parseObject(jsonObjStr, Student.class);
        //特别重要（3）0、解析jsonObjStr 1、new 学生实例对象stu 2、并把jsonObjStr里面的name的值张三赋值给了stu的name值，age同理


        String a = stu.getName();
        String b = stu.getAge();
        System.out.println("---> " + a + "  " + b);





        //定义数组格式的json字符串
        String jsonArrayStr = "[\"春\",\"夏\",\"秋\"]";
        //根据json字符串的格式创建JSONArray的对象
        JSONArray jsonArray = JSON.parseArray(jsonArrayStr);//相当于官方json的   JSONArray jsonrray = new JSONArray(json);
        //获取json数组中的元素
        String element = jsonArray.getString(2);//根据索引获取对应的元素
        System.out.println(element);

        int len = jsonArray.size();//获取数组中元素的个数 //相当于官方json的  jsonrray.length()
        System.out.println("json数组中的元素的个数：" + len);

        //通过for循环遍历数组中的每一个元素
        System.out.println("遍历出的json数组中的元素：");
        for(int i = 0; i < len; i++){
            String elementA = jsonArray.getString(i);
            System.out.print(elementA + "\t");
        }






        //解析数组中的元素存入一个集合中
        //参数一：被解析的json字符串    参数二：每一个元素的类型
        //该方法的执行：解析出来一个元素，会针对该元素创建一个参数二的对象用来存储该元素
        //           当该方法运行完之后，就会创建出来和元素个数相同多的参数二的对象
        //           最后在把所有的对象存储在一个集合中返回
        List<String> allElement = JSON.parseArray(jsonArrayStr, String.class);//特别重要（3）将jsonArrayStr解析过后的每一个字符串元素添加到list里面 然后 返回list集合
        //遍历集合中存储的所有的元素
        for(String s : allElement){
            System.out.println("s = " + s);
        }




        //把程序中数据转换成json对象的字符串
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("name", "张三");
        map.put("age", "19");
        map.put("height", "180");

        //创建JSONObject对象，封装map中的数据
        JSONObject jsonObjMap = new JSONObject(map);
        //把JSONObject类的对象转换成json字符串
        String jsonStr = jsonObjMap.toJSONString(); //相当于官方json的 jSONObject.toString();
        System.out.println("jsonStr = " + jsonStr);






        //把程序中的数据转换成json数组的字符串
        List<Object> dataList = new ArrayList<Object>();
        dataList.add("苹果");
        dataList.add("葡萄");
        dataList.add("橘子");

        //基于以上的集合创建了JSONArray的对象(用JSONArray封装集合中的数据)
        JSONArray jsonArrayList = new JSONArray(dataList);
        //把封装有数据的JSONArray类的对象jsonArrayList转换成字符串形式
        String arrayStr = jsonArrayList.toJSONString();
        System.out.println("arrayStr = " + arrayStr);






        //使用fastjson解析json对象和json数组的嵌套
        String complex = "[{\"name\":\"张三\",\"age\":\"17\",\"height\":\"180\"},"
                + "{\"name\":\"李四\",\"age\":\"18\",\"height\":\"178\"},"
                + "{\"name\":\"王五\",\"age\":\"16\",\"height\":\"181\"},"
                + "{\"name\":\"赵六\",\"age\":\"17\",\"height\":\"170\"}]";

        //通过该放方法调用就可以把一个json字符串中的数据统统封装到一个集合中
        //集合中的每一个学生对象对应着json数组中的一个元素
        List<Student> allElement2 = JSON.parseArray(complex, Student.class); //最难理解 特别重要（1）循环 new student对象 并设置成员变量的值 （2） 并把 所有student对象存到ArrayList中 ，然后返回List
        //取解析出来的数据(取json字符串中的第一个元素的值)
        Student stu2 = allElement2.get(3);
        //从存放有json数据的stu对象中取出json字符串中的该元素的每一个字段的值
        String elementName = stu2.getName();//获取json字符串对应位置的元素的name值
        String elementAge = stu2.getAge();//获取json字符串对应位置的元素的age值
        System.out.println(elementName + "  " + elementAge);

        //遍历出所有的数据
        System.out.println("解析到的数据为：");
        for(Student stu3 : allElement2){
            String ename = stu3.getName();
            String eage = stu3.getAge();
            String height = stu3.getHeight();
            System.out.println(ename + "  " + eage+"   "+height);
        }



    }
}
