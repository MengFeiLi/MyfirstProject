package json.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 用官方json 封装8个接口的数据
 *
 * @author: ChrisLee
 * @time: 2019/1/7
 */

public class MyTestPackJson {
    public static void main(String[] args) {

//        parseTAdMessageListJson();//封装获取首页广告信息列表接口
//        parseGetUserDetail();//封装获取个人信息接口
//        parseCreartShare();//封装分享好友接口
        patseApp_Vehicles_Under_Name();//封装电动车接口
    }

    /**
     * 封装获取首页广告信息列表接口：http://app.fxjchina.com/tAdMessage/TAdMessageList
     */
    private static void parseTAdMessageListJson() {
        HashMap<String, Object> hashMap = new HashMap<>();//1.new 一个JSONObject

        //2.添加JSONObject里层的
        hashMap.put("status", "200");
        hashMap.put("describe", "成功");
        hashMap.put("time", "1546824594922");
        hashMap.put("signature", "null");


        ArrayList<Object> arrayList = new ArrayList<Object>();

        //3.data层的
        HashMap<String, String> hashMap1 = new HashMap<>();
        hashMap1.put("id", "d9ab08ca15d74402b7d84f9fb428aad4");
        hashMap1.put("adMessageName", "南京车友交流群");
        hashMap1.put("adMessageImgurl", "http://www.fangxiangjia.com/pics/44cf9b5712a943319453c63ec8414d06/44cf9b5712a943319453c63ec8414d06-2.png");
        hashMap1.put("adMessageJump", "1");
        hashMap1.put("adMessageAdurlAndroid", "http://app.fxjchina.com/tAdMessage/getTAdMessageDetail?id=d9ab08ca15d74402b7d84f9fb428aad4");
        hashMap1.put("createTime", "2018-11-08 17:40:07");
        hashMap1.put("updateTime", "2018-11-21 10:51:45");
        hashMap1.put("classifyid", "afd3bd1eb5504e318ff5a241d08917c9");
        hashMap1.put("isok", "0");
        hashMap1.put("updateUser", "wanghao");
        hashMap1.put("sort", "1");
        hashMap1.put("createUser", "zhuwangyou");
        hashMap1.put("effectiveTime", null);
        hashMap1.put("expiryTime", null);
        hashMap1.put("adMessageAdurlIos", "http://app.fxjchina.com/tAdMessage/getTAdMessageDetail?id=d9ab08ca15d74402b7d84f9fb428aad4");
        hashMap1.put("detailText", "<p><img src=\"http://www.fangxiangjia.com/pics//file/ueditor/20181120181651-bcb0fe6c-d5b2-4685-b903-1ee27133624e.upfile\" title=\"upfile\" alt=\"upfile\"/></p>");
        arrayList.add(hashMap1);
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("id", "73584714d3494703b9eb93d7c5c9d3bc");
        hashMap2.put("adMessageName", "方向家是什么");
        hashMap2.put("adMessageImgurl", "http://www.fangxiangjia.com/pics/622e420823ae44b4936e8f3fea49e2f0/622e420823ae44b4936e8f3fea49e2f0-2.png");
        hashMap2.put("adMessageJump", "1");
        hashMap2.put("adMessageAdurlAndroid", "http://app.fxjchina.com/tAdMessage/getTAdMessageDetail?id=73584714d3494703b9eb93d7c5c9d3bc");
        hashMap2.put("createTime", "2018-11-08 17:43:56");
        hashMap2.put("updateTime", "2018-11-21 10:52:44");
        hashMap2.put("classifyid", "afd3bd1eb5504e318ff5a241d08917c9");
        hashMap2.put("isok", "0");
        hashMap2.put("updateUser", "wanghao");
        hashMap2.put("sort", "2");
        hashMap2.put("createUser", "zhuwangyou");
        hashMap2.put("effectiveTime", null);
        hashMap2.put("expiryTime", null);
        hashMap2.put("adMessageAdurlIos", "http://app.fxjchina.com/tAdMessage/getTAdMessageDetail?id=73584714d3494703b9eb93d7c5c9d3bc");
        hashMap2.put("detailText", "<p><img src=\\\"http://www.fangxiangjia.com/pics//file/ueditor/20181120181838-4d7ba218-4e96-4f44-8aaf-5104f96f6ba8.upfile\\\" title=\\\"upfile\\\" alt=\\\"upfile\\\"/></p>");

        //添加2层里的JsonArray
        arrayList.add(hashMap2);

        //2.JSONObject里层的
        hashMap.put("data", arrayList);
        JSONObject map = new JSONObject(hashMap);
        String s = map.toString();
        System.out.println(s);
    }

    /**
     * 封装获取个人信息接口：http://app.fxjchina.com/user/getUserDetail?token=74d58b46940541a4a303f95d5714bdc8
     */
    private static void parseGetUserDetail() {

        HashMap<String, Object> hashMap = new HashMap<>();

        hashMap.put("status", "200");
        hashMap.put("describe", "查询成功");
        hashMap.put("time", "1546825094445");
        hashMap.put("signature", "null");

        HashMap<String, Object> hashMap1 = new HashMap<>();
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("id", "74d58b46940541a4a303f95d5714bdc8");
        hashMap2.put("mobile", "17314860501");
        hashMap2.put("openId", null);
        hashMap2.put("nickname", "17314860501");
        hashMap2.put("sex", null);
        hashMap2.put("password", null);
        hashMap2.put("realEnable", "0");
        hashMap2.put("realDelete", "0");
        hashMap2.put("headImg", null);
        hashMap2.put("createTime", "2018-11-2-10-15-34");
        hashMap2.put("updateTime", "2018-11-2-10-15-34");
        hashMap2.put("userLevel", "0");
        hashMap2.put("tollCode", null);
        hashMap2.put("sfyUser", null);
        hashMap2.put("registrationId", null);
        hashMap1.put("userData", hashMap2);


        hashMap.put("data", hashMap1);

        JSONObject jsonObject = new JSONObject(hashMap);
        String s = jsonObject.toString();
        System.out.println(s);


    }

    /**
     * 封装分享好友接口：http://app.fxjchina.com/share/creartShare?view=HaoYou
     */
    private static void parseCreartShare() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("describe", "成功");
        hashMap.put("status", "200");


        HashMap<String, Object> hashMap1 = new HashMap<>();
        hashMap1.put("img", "http://app.fxjchina.com:80/web-resources/img/shop_buy_gray@1x.png");
        hashMap1.put("text", "掌握方向，服务如家");
        hashMap1.put("title", "一款覆盖全南京道路停车位的APP");
        hashMap1.put("url", "http://app.fxjchina.com:80/share/showShare?view=HaoYou");
        hashMap.put("data", hashMap1);


        JSONObject jsonObject = new JSONObject(hashMap);
        String s = jsonObject.toString();
        System.out.println(s);
    }

    /**
     * 封装电动车接口：http://36.152.39.170:8066/api/app_vehicles_under_name
     */
    private static void patseApp_Vehicles_Under_Name() {
        HashMap<String, Object> hashMap = new HashMap<>();

        HashMap<String, Object> hashMap1 = new HashMap<>();
        hashMap1.put("id", "0");
        hashMap1.put("identification_type", "居民身份证");
        hashMap1.put("identification_no", "32108219800410391X");
        hashMap1.put("owner_name", "季君");
        hashMap1.put("address", "南京市江宁区秣陵街道胜太路22号");
        hashMap1.put("mailing_address", null);
        hashMap1.put("residential_address", null);
        hashMap1.put("birth", null);
        hashMap1.put("nation", null);
        hashMap1.put("visa_authority_admin", null);
        hashMap1.put("date_start", null);
        hashMap1.put("date_expire", null);
        hashMap1.put("tel", "13675169244");
        hashMap1.put("phone", null);
        hashMap1.put("pic", null);
        hashMap1.put("create_time", "0001-01-01T00:00:00");
        hashMap1.put("update_time", "0001-01-01T00:00:00");
        hashMap1.put("source", "0");
        hashMap1.put("sex", null);
        hashMap.put("owner", hashMap1);

        hashMap.put("code", "200");
        hashMap.put("msg", "success");
        hashMap.put("desc", "获取成功");


        ArrayList<Object> arrayList = new ArrayList<>();
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("plate_no", "AA00199");
        map1.put("state", "正常");
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("plate_no", "AA00167");
        map2.put("state", "正常");
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("plate_no", "AA00165");
        map3.put("state", "正常");
        HashMap<String, String> map4 = new HashMap<>();
        map4.put("plate_no", "AA00161");
        map4.put("state", "暂扣，事故逃逸，注销，查封");

        arrayList.add(map1);
        arrayList.add(map2);
        arrayList.add(map3);
        arrayList.add(map4);

        hashMap.put("data", arrayList);


        JSONObject jsonObject = new JSONObject(hashMap);
        String s = jsonObject.toString();
        System.out.println(s);
    }
}
