package json.day03__FastJsonParse2;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class Test {

    public static void main(String[] args) {

        try {
            //把json数据读取到程序中
            FileInputStream fis = new FileInputStream("C:/json2.txt");
            //创建内存流
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            while((len = fis.read(buffer)) != -1){
                bos.write(buffer, 0, len);
            }
            byte[] data = bos.toByteArray();//从内存中把数据重新取出
            String json = new String(data);//在程序中获得了json字符串
//			System.out.println(json);

            //解析json(fastjson解析)
            JSONObject jsonObj = JSON.parseObject(json);
            JSONArray jsonArray = jsonObj.getJSONArray("l");
            List<Show> allShow = JSON.parseArray(jsonArray.toJSONString(), Show.class);


            //获取第四个数据
            Show show = allShow.get(3);
            String name = show.getN();
            String price = show.getPriceName();
            String time = show.getT();
            String city = show.getCityName();
//			System.out.println(name);
//			System.out.println(price);
//			System.out.println(time);
//			System.out.println(city);

            //写for循环遍历allShow中的所有的数据

            //通过toString的方法全部遍历
            System.out.println(allShow);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
