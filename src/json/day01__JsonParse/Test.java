package json.day01__JsonParse;

import java.util.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Test {

    public static void main(String[] args) {

        //定义json对象格式的字符串
        String json = "{\"name\":\"张三\",\"age\":\"16\",\"height\":\"180\"}";

        //键值对应的value值为null
        String json2 = "{\"name\":\"张三\",\"age\":\"null\"}";
        //解析json字符串获取其中的名字数据

        //使用json官方提供的解析方式
        try {
            //创建JSONObject对象用于操作json对象格式的字符串
            JSONObject jsonObj = new JSONObject(json);
            String s = jsonObj.optString("mm", "空");
            System.out.println(s);
            //获取json对象格式的字符串中的数据
//			String nameValue = jsonObj.getString("name");//根据key值获取对应的value值
//			System.out.println(nameValue);

            String nameValue = (String) jsonObj.get("name");
            System.out.println(nameValue);

            //当key值对应的value值是null的是，获取的数据并不是空对象，而是直接把null作为对象的值
            String age = jsonObj.getString("age");
            int len = age.length();
            System.out.println("len = " + len +  " age = " + age);

//			int age2 = jsonObj.getInt("age");
//			System.out.println(age2);


            //当获取json字符串中key不存在的时候，程序会因为找不到该key而报错
//			String height = jsonObj.getString("height");
//			System.out.println("height = " + height);

            //此方法的作用是当指定的key值在json字符串中不存在的时候，以后面的默认值返回一个数据
            //当key存在的时候，此方法就正常的把该key对应的value值返回
            int height = jsonObj.optInt("height",-1);
            System.out.println("height = " + height);

            String height2 = jsonObj.optString("height","a");
            int len2 = height2.length();
            System.out.println("len2 = " + len2 + " , height2 = " + height2);

            //把程序中的数据转换成json格式的字符串
            HashMap<String, String> map = new HashMap<String,String>();
            map.put("name", "张三");
            map.put("age", "18");
            map.put("height", "180");
            JSONObject jsonObj3 = new JSONObject(map);
            String jsonStr = jsonObj3.toString();
            System.out.println("jsonStr = " + jsonStr);


            //==============JSONArray=================
            String arrayStr1 = "[18,29,39,78]";//json数组格式的字符串


            //创建JSONArray类的对象用于表示上面的数组格式的json字符串
            JSONArray jsonArray = new JSONArray(arrayStr1);
            //根据数组中元素的索引获取元素的值
//			int element3 = jsonArray.getInt(2);
//			System.out.println("element3 = " + element3);
//
//			String element1 = jsonArray.getString(0);
//			System.out.println("element1 = " + element1);

            //遍历数组格式的json字符串中的所有元素
            int lenOfArray = jsonArray.length();//获取数组格式的json字符串中的元素的个数
            System.out.println("数组格式的json的元素的个数：" + lenOfArray);
            for(int i = 0; i < lenOfArray; i++){
                //统一按照字符串的格式获取数组中的每一个元素
                String element = jsonArray.getString(i);
                System.out.print(element + " \t");
            }



            //以json对象作为json数组的元素
            String arrayStr2 = "[{\"name\":\"张三\",\"age\":\"18\"},{\"name\":\"李四\",\"age\":\"19\"},{\"name\":\"王五\",\"age\":\"17\"}]";
            JSONArray jsonArray2 = new JSONArray(arrayStr2);
            for(int i = 0; i < jsonArray2.length(); i++){
                //获取当前的元素(一个学生对象)
                JSONObject jsonObjElement = jsonArray2.getJSONObject(i);
                //获取该元素中的数据(获取该学生的姓名和年龄)
                String nameElement = jsonObjElement.getString("name");
                String ageElement = jsonObjElement.getString("age");

                System.out.println(nameElement + " " + ageElement);
                System.out.println();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }



        //把程序中的数据转换成json数组字符串
        //使用场景：服务端给客户端发送的数据的时候
        //服务端给客户端传递字符串比较方便，所以在服务端可以把要发送的数据转换成字符串
        //客户端获得该字符串之后，在按照json的解析方式解析该字符串就额可以获得服务端发送的数据
        ArrayList<String> dataList = new ArrayList<String>();
        for(int i = 0; i < 5; i++){
            dataList.add("item" + i);
        }
        //把程序中的数据传入JSONArray类的构造中
        JSONArray jsonArray = new JSONArray(dataList);
        String jsonArrStr = jsonArray.toString();//把jsonArray对象所封装的数据转换成json字符串
        System.out.println(jsonArrStr);


    }

}
