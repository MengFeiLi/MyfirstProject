package json.day01__JsonParse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class MyTest {
    public static void main(String[] args) {
//        parseJsonObj();
//        parseJsonArray();

        packJsonObj();
//        packJsonArray();


    }

    private static void packJsonArray() {

        HashMap<String,Object> hashMap = new HashMap<String, Object>();//objrc
        HashMap<String, String> ownerMap = new HashMap<>();//ower
        ownerMap.put("owner_name","季君");
        ownerMap.put("identification_no","32108219800410391X");
        ownerMap.put("address","南京市江宁区秣陵街道胜太路");
        hashMap.put("owner",ownerMap);

        ArrayList<Object> arrayList = new ArrayList<Object>();//

            HashMap<String,String> datemap = new HashMap<String, String>();
            datemap.put("plate_no","AA00199");
            datemap.put("state","正常");
            HashMap<String,String> datemap1 = new HashMap<String, String>();
            datemap1.put("plate_no","AA00167");
            datemap1.put("state","正常");
            HashMap<String,String> datemap2 = new HashMap<String, String>();
            datemap2.put("plate_no","AA00165");
            datemap2.put("state","正常");
            HashMap<String,String> datemap3 = new HashMap<String, String>();
            datemap3.put("plate_no","AA00161");
            datemap3.put("state","暂扣，事故逃逸，注销，查封");
            arrayList.add(datemap);
            arrayList.add(datemap1);
            arrayList.add(datemap2);
            arrayList.add(datemap3);
            hashMap.put("data",arrayList);

        hashMap.put("code","200");
        hashMap.put("msg","success");
        hashMap.put("desc","获取成功");
        JSONObject object = new JSONObject(hashMap);



        String s = object.toString();
        System.out.println(s);

    }


    /**
     * 封装jsonObject
     */
    private static void packJsonObj() {
        TreeMap<String,Object> hashMap = new TreeMap<String,Object>();
        HashMap<String, String> dataMap = new HashMap<>();
        dataMap.put("user_id","85");
        dataMap.put("login_name","gt02");
        dataMap.put("name","操作员");
        dataMap.put("tel","null");
        hashMap.put("data",dataMap);


        hashMap.put("code","200");
        hashMap.put("msg","success");
        hashMap.put("desc","登录成功");
        JSONObject object = new JSONObject(hashMap);
        String s = object.toString();
        System.out.println(s);
    }

    private static void packJsonObj1() {
        HashMap<String,Object> hashMap = new HashMap<String,Object>();
         //第一层
         hashMap.put("code","200");
        hashMap.put("msg","success");
        hashMap.put("desc","登录成功");
        //第2层
        HashMap<String,String> dataMap = new HashMap<String,String>();
        dataMap.put("name","操作员");
        dataMap.put("login_name","gt02");
        dataMap.put("company_no","3201010001");




        hashMap.put("data",dataMap);//将dataMap添加到hashMap中
        //打印。
        JSONObject object = new JSONObject(hashMap);
        String s = object.toString();
        System.out.println(s);
    }
    /**
     * 解析JsonArray
     */
    private static void parseJsonArray() {

        String json ="[{\"plate_no\":\"AA00199\",\"state\":\"正常\"},{\"plate_no\":\"AA00167\",\"state\":\"正常\"},{\"plate_no\":\"AA00165\",\"state\":\"正常\"},{\"plate_no\":\"AA00161\",\"state\":\"暂扣，事故逃逸，注销，查封\"}]";
        try {
            JSONArray jsonrray = new JSONArray(json);

            for (int i=0;i<jsonrray.length();i++) {
                JSONObject jsonObject = jsonrray.getJSONObject(i);
                String plate_no = jsonObject.getString("plate_no");
                String state = jsonObject.getString("state");
                System.out.println(i+"=="+plate_no+"---"+state);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /**
     * 解析JsonObject
     */
    private static void parseJsonObj() {
        String json = "{\"data\":{\"user_id\":85,\"login_name\":\"gt02\",\"name\":\"操作员\",\"tel\":null,\"address\":null,\"company_no\":\"3201010001\",\"province\":\"320000\",\"city\":\"320100\",\"area\":\"320102\",\"is_lock\":0},\"code\":200,\"msg\":\"success\",\"desc\":\"登录成功\"}";

        try {
            JSONObject object = new JSONObject(json);
            JSONObject data = object.getJSONObject("data");
            String user_id = data.getString("user_id");
            String login_name = data.getString("login_name");
            String name = data.getString("name");
            String tel = data.getString("tel");
            String address = data.getString("address");
            String company_no = data.getString("company_no");
            String province = data.getString("province");
            String city = data.getString("city");
            String area = data.getString("area");
            String is_lock = data.getString("is_lock");
            System.out.println(user_id);
            System.out.println(login_name);
            System.out.println(name);
            System.out.println(tel);
            System.out.println(address);
            System.out.println(company_no);
            System.out.println(province);
            System.out.println(city);
            System.out.println(area);
            System.out.println(is_lock);


            String code = object.getString("code");

            String msg = object.getString("msg");
            String desc = object.getString("desc");
            System.out.println(code + "\t" + msg + "\t" + desc);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
