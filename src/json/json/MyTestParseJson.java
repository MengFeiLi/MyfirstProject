package json.json;

import json.model.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


/**
 * 用官方json 解析8个接口
 *
 * @author: ChrisLee
 * @time: 2019/1/7
 */

public class MyTestParseJson {

    public static void main(String[] args) {
//        parseSendShortJson();//解析获取验证码接口
//        parsePhoneLoginJson();//解析登录接口
//        parseUpadte_MobileJson();//解析更换手机号
//        parseTAdMessageListJson();//解析获取首页广告信息列表接口
//        parseGetUserDetail();//解析获取个人信息接口
//        parseApp_Vehicles_Under_Name();
        parseCreartShare();

    }

    /**
     * 解析获取验证码接口：http://app.fxjchina.com/login/sendShort
     */
    private static void parseSendShortJson() {
        String json = "{\"status\":200,\"describe\":\"发送成功\",\"time\":1546825199488,\"signature\":null,\"data\":null}";
        try {
            //解析数据

            JSONObject jsonObject = new JSONObject(json);
            String status = jsonObject.optString("status", "200");
            String describe = jsonObject.optString("describe", "成功");
            String time = jsonObject.getString("time");
            String signature = jsonObject.getString("signature");
            String data = jsonObject.getString("data");

            //给Model类设置数据
            SendShortBean sendShortBean = new SendShortBean();
            sendShortBean.setData(data);
            sendShortBean.setDescribe(describe);
            sendShortBean.setSignature(signature);
            sendShortBean.setStatus(status);
            sendShortBean.setTime(time);

            //打印数据
            System.out.println("解析的获取验证Model：" + sendShortBean);

        } catch (JSONException e) {
            e.printStackTrace();
        }


    }

    /**
     * 解析登录接口：http://app.fxjchina.com/login/phoneLogin
     */
    private static void parsePhoneLoginJson() {
        String json = "{\"status\":200,\"describe\":\"登录成功\",\"time\":1546825619095,\"signature\":null,\"data\":{\"id\":\"74d58b46940541a4a303f95d5714bdc8\",\"mobile\":\"17314860501\",\"openId\":null,\"nickname\":\"17314860501\",\"sex\":null,\"password\":null,\"realEnable\":\"0\",\"realDelete\":\"0\",\"headImg\":null,\"createTime\":[2018,11,2,10,15,34],\"updateTime\":[2018,11,2,10,15,34],\"userLevel\":\"0\",\"tollCode\":null,\"sfyUser\":null,\"registrationId\":null,\"currentTimeMillis\":0,\"token\":\"74d58b46940541a4a303f95d5714bdc8\",\"key\":null,\"photoUrl\":null}}";
        try {
            //-----------------------解析数据-----------------
            JSONObject jsonObject = new JSONObject(json);
            String status = jsonObject.optString("status", "200");
            String describe = jsonObject.optString("describe", "成功");
            String time = jsonObject.getString("time");
            String signature = jsonObject.getString("signature");
            //----1、获取data的jsonObject
            JSONObject dataObj = jsonObject.getJSONObject("data");
            String id = dataObj.getString("id");
            String mobile = dataObj.getString("mobile");
            String openId = dataObj.getString("openId");


            //-------------------------------给Model类设置数据--------
            PhoneLoginBean bean = new PhoneLoginBean();
            bean.setDescribe(describe);
            bean.setSignature(signature);
            bean.setStatus(status);
            bean.setTime(time);
            //1、设置PhoneLoginBean的 内部类 DataBean的值
            PhoneLoginBean.DataBean dataBean = new PhoneLoginBean.DataBean();
            dataBean.setId(id);
            dataBean.setMobile(mobile);
            dataBean.setOpenId(openId);
            bean.setData(dataBean);//注意不要忘记设置
            //...........其他数据自己设置.........
            //打印数据
            System.out.println("解析的获取验证Model：" + bean);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    /**
     * 解析更换手机号：http://app.fxjchina.com/user/update_mobile
     */
    private static void parseUpadte_MobileJson() {
        String json = "{\"status\":300,\"describe\":\"手机号已存在\",\"time\":1546825737752,\"signature\":null,\"data\":null}";
        try {
            JSONObject object = new JSONObject(json);
            String status = object.optString("status", "300");
            String describe = object.optString("describe", "手机号已存在");
            String time = object.optString("time", "1546825737752");
            String signature = object.optString("signature", "null");
            String data = object.optString("data", "null");

            Update_MobileBean update_mobileBean = new Update_MobileBean();
            update_mobileBean.setStatus(status);
            update_mobileBean.setDescribe(describe);
            update_mobileBean.setTime(time);
            update_mobileBean.setSignature(signature);
            update_mobileBean.setData(data);

            System.out.println("解析的获取验证Model：" + update_mobileBean);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /**
     * 解析获取首页广告信息列表接口：http://app.fxjchina.com/tAdMessage/TAdMessageList
     */
    private static void parseTAdMessageListJson() {
        String json = "{\"status\":200,\"describe\":\"成功\",\"time\":1546824594922,\"signature\":null,\"data\":[{\"id\":\"d9ab08ca15d74402b7d84f9fb428aad4\",\"adMessageName\":\"南京车友交流群\",\"adMessageImgurl\":\"http://www.fangxiangjia.com/pics/44cf9b5712a943319453c63ec8414d06/44cf9b5712a943319453c63ec8414d06-2.png\",\"adMessageJump\":\"1\",\"adMessageAdurlAndroid\":\"http://app.fxjchina.com/tAdMessage/getTAdMessageDetail?id=d9ab08ca15d74402b7d84f9fb428aad4\",\"createTime\":\"2018-11-08 17:40:07\",\"updateTime\":\"2018-11-21 10:51:45\",\"classifyid\":\"afd3bd1eb5504e318ff5a241d08917c9\",\"isok\":\"0\",\"updateUser\":\"wanghao\",\"sort\":\"1\",\"createUser\":\"zhuwangyou\",\"effectiveTime\":null,\"expiryTime\":null,\"adMessageAdurlIos\":\"http://app.fxjchina.com/tAdMessage/getTAdMessageDetail?id=d9ab08ca15d74402b7d84f9fb428aad4\",\"detailText\":\"<p><img src=\\\"http://www.fangxiangjia.com/pics//file/ueditor/20181120181651-bcb0fe6c-d5b2-4685-b903-1ee27133624e.upfile\\\" title=\\\"upfile\\\" alt=\\\"upfile\\\"/></p>\"},{\"id\":\"73584714d3494703b9eb93d7c5c9d3bc\",\"adMessageName\":\"方向家是什么\",\"adMessageImgurl\":\"http://www.fangxiangjia.com/pics/622e420823ae44b4936e8f3fea49e2f0/622e420823ae44b4936e8f3fea49e2f0-2.png\",\"adMessageJump\":\"1\",\"adMessageAdurlAndroid\":\"http://app.fxjchina.com/tAdMessage/getTAdMessageDetail?id=73584714d3494703b9eb93d7c5c9d3bc\",\"createTime\":\"2018-11-08 17:43:56\",\"updateTime\":\"2018-11-21 10:52:44\",\"classifyid\":\"afd3bd1eb5504e318ff5a241d08917c9\",\"isok\":\"0\",\"updateUser\":\"wanghao\",\"sort\":\"2\",\"createUser\":\"zhuwangyou\",\"effectiveTime\":null,\"expiryTime\":null,\"adMessageAdurlIos\":\"http://app.fxjchina.com/tAdMessage/getTAdMessageDetail?id=73584714d3494703b9eb93d7c5c9d3bc\",\"detailText\":\"<p><img src=\\\"http://www.fangxiangjia.com/pics//file/ueditor/20181120181838-4d7ba218-4e96-4f44-8aaf-5104f96f6ba8.upfile\\\" title=\\\"upfile\\\" alt=\\\"upfile\\\"/></p>\"}]}";

        try {
            JSONObject object = new JSONObject(json);
            String status = object.optString("status", "200");
            String describe = object.optString("describe", "成功");
            String time = object.optString("time", "1546824594922");
            String signature = object.optString("signature", "null");
            //获取JSONobject
            TAdMessageListBean tAdMessageListBean = new TAdMessageListBean();
            tAdMessageListBean.setSignature(status);
            tAdMessageListBean.setDescribe(describe);
            tAdMessageListBean.setTime(time);
            tAdMessageListBean.setSignature(signature);

            //获取data里的
            JSONArray data = object.getJSONArray("data");
            ArrayList<TAdMessageListBean.DataBean> dataBeans = new ArrayList<>();
            for (int i = 0; i < data.length(); i++) {
                JSONObject jsonObject = data.getJSONObject(i);

                String id = jsonObject.optString("id");
                String adMessageName = jsonObject.getString("adMessageName");
                String adMessageImgurl = jsonObject.getString("adMessageImgurl");
                String adMessageJump = jsonObject.getString("adMessageJump");
                String adMessageAdurlAndroid = jsonObject.getString("adMessageAdurlAndroid");
                String createTime = jsonObject.getString("createTime");
                String updateTime = jsonObject.getString("updateTime");
                String classifyid = jsonObject.getString("classifyid");
                String isok = jsonObject.getString("isok");
                String updateUser = jsonObject.getString("updateUser");
                String sort = jsonObject.getString("sort");
                String createUser = jsonObject.getString("createUser");
                String effectiveTime = jsonObject.getString("effectiveTime");
                String expiryTime = jsonObject.getString("expiryTime");
                String adMessageAdurlIos = jsonObject.getString("adMessageAdurlIos");
                String detailText = jsonObject.getString("detailText");

                TAdMessageListBean.DataBean dataBean = new TAdMessageListBean.DataBean();
                dataBean.setId(id);
                dataBean.setAdMessageName(adMessageName);
                dataBean.setAdMessageImgurl(adMessageImgurl);
                dataBean.setAdMessageJump(adMessageJump);
                dataBean.setAdMessageAdurlAndroid(adMessageAdurlAndroid);
                dataBean.setCreateTime(createTime);
                dataBean.setUpdateTime(updateTime);
                dataBean.setClassifyid(classifyid);
                dataBean.setIsok(isok);
                dataBean.setUpdateUser(updateUser);
                dataBean.setSort(sort);
                dataBean.setCreateUser(createUser);
                dataBean.setEffectiveTime(effectiveTime);
                dataBean.setExpiryTime(expiryTime);
                dataBean.setAdMessageAdurlIos(adMessageAdurlIos);
                dataBean.setDetailText(detailText);
                dataBeans.add(dataBean);
            }
            tAdMessageListBean.setData(dataBeans);
            System.out.println("获取首页广告信息列表是：" + tAdMessageListBean);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    /**
     * 解析获取个人信息接口：http://app.fxjchina.com/user/getUserDetail?token=74d58b46940541a4a303f95d5714bdc8
     */
    private static void parseGetUserDetail() {
        String json = "{\"status\":200,\"describe\":\"查询成功\",\"time\":1546825094445,\"signature\":null,\"data\":{\"userData\":{\"id\":\"74d58b46940541a4a303f95d5714bdc8\",\"mobile\":\"17314860501\",\"openId\":null,\"nickname\":\"17314860501\",\"sex\":null,\"password\":null,\"realEnable\":\"0\",\"realDelete\":\"0\",\"headImg\":null,\"createTime\":[2018,11,2,10,15,34],\"updateTime\":[2018,11,2,10,15,34],\"userLevel\":\"0\",\"tollCode\":null,\"sfyUser\":null,\"registrationId\":null}}}";

        try {
            JSONObject object = new JSONObject(json);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /**
     * 解析电动车接口http://36.152.39.170:8066/api/app_vehicles_under_name
     */
    private static void parseApp_Vehicles_Under_Name() {
        String json = "{\"owner\":{\"id\":0,\"identification_type\":\"居民身份证\",\"identification_no\":\"32108219800410391X\",\"owner_name\":\"季君\",\"address\":\"南京市江宁区秣陵街道胜太路22号\",\"mailing_address\":null,\"residential_address\":null,\"birth\":null,\"nation\":null,\"visa_authority_admin\":null,\"date_start\":null,\"date_expire\":null,\"tel\":\"13675169244\",\"phone\":null,\"pic\":null,\"create_time\":\"0001-01-01T00:00:00\",\"update_time\":\"0001-01-01T00:00:00\",\"source\":0,\"sex\":null},\"data\":[{\"plate_no\":\"AA00199\",\"state\":\"正常\"},{\"plate_no\":\"AA00167\",\"state\":\"正常\"},{\"plate_no\":\"AA00165\",\"state\":\"正常\"},{\"plate_no\":\"AA00161\",\"state\":\"暂扣，事故逃逸，注销，查封\"}],\"code\":200,\"msg\":\"success\",\"desc\":\"获取成功\"}";
        try {
            JSONObject jsonObject = new JSONObject(json);
            String msg = jsonObject.getString("msg");
            String code = jsonObject.getString("code");
            String desc = jsonObject.getString("desc");
            //解析的JSONObject
            App_Vehicles_Under_NameBean app_vehicles_under_nameBean = new App_Vehicles_Under_NameBean();
            app_vehicles_under_nameBean.setMsg(msg);
            app_vehicles_under_nameBean.setCode(code);
            app_vehicles_under_nameBean.setDesc(desc);


            //解析data
            JSONObject owner = jsonObject.getJSONObject("owner");
            String residential_address = owner.getString("residential_address");
            String owner_name = owner.getString("owner_name");
            String address = owner.getString("address");
            String identification_no = owner.getString("identification_no");
            String create_time = owner.getString("create_time");
            String nation = owner.getString("nation");
            String sex = owner.getString("sex");
            String identification_type = owner.getString("identification_type");
            String birth = owner.getString("birth");
            String date_expire = owner.getString("date_expire");
            String pic = owner.getString("pic");
            String source = owner.getString("source");
            String visa_authority_admin = owner.getString("visa_authority_admin");
            String mailing_address = owner.getString("mailing_address");
            String date_start = owner.getString("date_start");
            String update_time = owner.getString("update_time");
            String phone = owner.getString("phone");
            String tel = owner.getString("tel");
            String id = owner.getString("id");
            App_Vehicles_Under_NameBean.OwnerBean ownerBean = new App_Vehicles_Under_NameBean.OwnerBean();
            ownerBean.setResidential_address(residential_address);
            ownerBean.setOwner_name(owner_name);
            ownerBean.setAddress(address);
            ownerBean.setIdentification_no(identification_no);
            ownerBean.setCreate_time(create_time);
            ownerBean.setNation(nation);
            ownerBean.setSex(sex);
            ownerBean.setIdentification_type(identification_type);
            ownerBean.setBirth(birth);
            ownerBean.setDate_expire(date_expire);
            ownerBean.setPic(pic);
            ownerBean.setSource(source);
            ownerBean.setVisa_authority_admin(visa_authority_admin);
            ownerBean.setMailing_address(mailing_address);
            ownerBean.setDate_start(date_start);
            ownerBean.setUpdate_time(update_time);
            ownerBean.setPhone(phone);
            ownerBean.setTel(tel);
            ownerBean.setId(id);

            app_vehicles_under_nameBean.setOwner(ownerBean);


            JSONArray data = jsonObject.getJSONArray("data");
            ArrayList<App_Vehicles_Under_NameBean.DataBean> dataBeans = new ArrayList<>();
            for (int i = 0; i < data.length(); i++) {
                JSONObject jsonObject1 = data.getJSONObject(i);
                String plate_no = jsonObject1.getString("plate_no");
                String state = jsonObject1.getString("state");
                App_Vehicles_Under_NameBean.DataBean dataBean = new App_Vehicles_Under_NameBean.DataBean();
                dataBean.setPlate_no(plate_no);
                dataBean.setState(state);
                dataBeans.add(dataBean);
                app_vehicles_under_nameBean.setData(dataBeans);
            }


            System.out.println(app_vehicles_under_nameBean);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    /**
     * 分享好友接口：http://app.fxjchina.com/share/creartShare?view=HaoYou
     */
    private static void parseCreartShare(){
        String json = "{\"data\":{\"img\":\"http://app.fxjchina.com:80/web-resources/img/shop_buy_gray@1x.png\",\"text\":\"掌握方向，服务如家\",\"title\":\"一款覆盖全南京道路停车位的APP\",\"url\":\"http://app.fxjchina.com:80/share/showShare?view=HaoYou\"},\"describe\":\"成功\",\"status\":200}";

        try {
            JSONObject jsonObject = new JSONObject(json);
            String describe = jsonObject.getString("describe");
            String status = jsonObject.getString("status");

            CreartShareBean creartShareBean = new CreartShareBean();
            creartShareBean.setDescribe(describe);
            creartShareBean.setStatus(status);

            JSONObject jsonObject1 = jsonObject.getJSONObject("data");
            String img = jsonObject1.optString("img","aaa");
            String text = jsonObject1.optString("text","掌握方向，服务如家");
            String title = jsonObject1.optString("title","一款覆盖全南京道路停车位的APP");
            String url = jsonObject1.optString("url","http://app.fxjchina.com:80/share/showShare?view=HaoYou");
            CreartShareBean.DataBean dataBean = new CreartShareBean.DataBean();
            dataBean.setImg(img);
            dataBean.setText(text);
            dataBean.setTitle(title);
            dataBean.setUrl(url);
            creartShareBean.setData(dataBean);

            System.out.println(creartShareBean);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
