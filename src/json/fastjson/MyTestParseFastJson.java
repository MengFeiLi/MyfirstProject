package json.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import json.day02__FastJsonParse.Student;
import json.model.DataBean;
import json.model.TAdMessageListBean;

import java.lang.reflect.Type;
import java.util.List;


/**
 * 用FastJson 解析8个接口
 *
 * @author: ChrisLee
 * @time: 2019/1/7
 */

public class MyTestParseFastJson {

    public static void main(String[] args) {
//        parseSendShortJson();
        parseTAdMessageList();
//        parseTAdMessageList11();
    }

    /**
     * 解析获取验证码接口：http://app.fxjchina.com/login/sendShort
     */
    private static void parseSendShortJson() {


    }

    /**
     * 解析登录接口：http://app.fxjchina.com/login/phoneLogin
     */
    private static void parsePhoneLoginJson() {

    }

    /**
     * 获取首页广告信息列表接口：http://app.fxjchina.com/tAdMessage/TAdMessageList
     */
    private static void parseTAdMessageList() {
        String json = "{\"status\":200,\"describe\":\"成功\",\"time\":1546824594922,\"signature\":null,\"data\":[{\"id\":\"d9ab08ca15d74402b7d84f9fb428aad4\",\"adMessageName\":\"南京车友交流群\",\"adMessageImgurl\":\"http://www.fangxiangjia.com/pics/44cf9b5712a943319453c63ec8414d06/44cf9b5712a943319453c63ec8414d06-2.png\",\"adMessageJump\":\"1\",\"adMessageAdurlAndroid\":\"http://app.fxjchina.com/tAdMessage/getTAdMessageDetail?id=d9ab08ca15d74402b7d84f9fb428aad4\",\"createTime\":\"2018-11-08 17:40:07\",\"updateTime\":\"2018-11-21 10:51:45\",\"classifyid\":\"afd3bd1eb5504e318ff5a241d08917c9\",\"isok\":\"0\",\"updateUser\":\"wanghao\",\"sort\":\"1\",\"createUser\":\"zhuwangyou\",\"effectiveTime\":null,\"expiryTime\":null,\"adMessageAdurlIos\":\"http://app.fxjchina.com/tAdMessage/getTAdMessageDetail?id=d9ab08ca15d74402b7d84f9fb428aad4\",\"detailText\":\"<p><img src=\\\"http://www.fangxiangjia.com/pics//file/ueditor/20181120181651-bcb0fe6c-d5b2-4685-b903-1ee27133624e.upfile\\\" title=\\\"upfile\\\" alt=\\\"upfile\\\"/></p>\"},{\"id\":\"73584714d3494703b9eb93d7c5c9d3bc\",\"adMessageName\":\"方向家是什么\",\"adMessageImgurl\":\"http://www.fangxiangjia.com/pics/622e420823ae44b4936e8f3fea49e2f0/622e420823ae44b4936e8f3fea49e2f0-2.png\",\"adMessageJump\":\"1\",\"adMessageAdurlAndroid\":\"http://app.fxjchina.com/tAdMessage/getTAdMessageDetail?id=73584714d3494703b9eb93d7c5c9d3bc\",\"createTime\":\"2018-11-08 17:43:56\",\"updateTime\":\"2018-11-21 10:52:44\",\"classifyid\":\"afd3bd1eb5504e318ff5a241d08917c9\",\"isok\":\"0\",\"updateUser\":\"wanghao\",\"sort\":\"2\",\"createUser\":\"zhuwangyou\",\"effectiveTime\":null,\"expiryTime\":null,\"adMessageAdurlIos\":\"http://app.fxjchina.com/tAdMessage/getTAdMessageDetail?id=73584714d3494703b9eb93d7c5c9d3bc\",\"detailText\":\"<p><img src=\\\"http://www.fangxiangjia.com/pics//file/ueditor/20181120181838-4d7ba218-4e96-4f44-8aaf-5104f96f6ba8.upfile\\\" title=\\\"upfile\\\" alt=\\\"upfile\\\"/></p>\"}]}";

        TAdMessageListBean tAdMessageListBean = JSON.parseObject(json, TAdMessageListBean.class);

        System.out.println("解析的获取验证Model：" + tAdMessageListBean);

    }

    private static void parseTAdMessageList11() {
        String json = "[{\"id\":\"d9ab08ca15d74402b7d84f9fb428aad4\",\"adMessageName\":\"南京车友交流群\",\"adMessageImgurl\":\"http://www.fangxiangjia.com/pics/44cf9b5712a943319453c63ec8414d06/44cf9b5712a943319453c63ec8414d06-2.png\",\"adMessageJump\":\"1\",\"adMessageAdurlAndroid\":\"http://app.fxjchina.com/tAdMessage/getTAdMessageDetail?id=d9ab08ca15d74402b7d84f9fb428aad4\",\"createTime\":\"2018-11-08 17:40:07\",\"updateTime\":\"2018-11-21 10:51:45\",\"classifyid\":\"afd3bd1eb5504e318ff5a241d08917c9\",\"isok\":\"0\",\"updateUser\":\"wanghao\",\"sort\":\"1\",\"createUser\":\"zhuwangyou\",\"effectiveTime\":null,\"expiryTime\":null,\"adMessageAdurlIos\":\"http://app.fxjchina.com/tAdMessage/getTAdMessageDetail?id=d9ab08ca15d74402b7d84f9fb428aad4\",\"detailText\":\"<p><img src=\\\"http://www.fangxiangjia.com/pics//file/ueditor/20181120181651-bcb0fe6c-d5b2-4685-b903-1ee27133624e.upfile\\\" title=\\\"upfile\\\" alt=\\\"upfile\\\"/></p>\"},{\"id\":\"73584714d3494703b9eb93d7c5c9d3bc\",\"adMessageName\":\"方向家是什么\",\"adMessageImgurl\":\"http://www.fangxiangjia.com/pics/622e420823ae44b4936e8f3fea49e2f0/622e420823ae44b4936e8f3fea49e2f0-2.png\",\"adMessageJump\":\"1\",\"adMessageAdurlAndroid\":\"http://app.fxjchina.com/tAdMessage/getTAdMessageDetail?id=73584714d3494703b9eb93d7c5c9d3bc\",\"createTime\":\"2018-11-08 17:43:56\",\"updateTime\":\"2018-11-21 10:52:44\",\"classifyid\":\"afd3bd1eb5504e318ff5a241d08917c9\",\"isok\":\"0\",\"updateUser\":\"wanghao\",\"sort\":\"2\",\"createUser\":\"zhuwangyou\",\"effectiveTime\":null,\"expiryTime\":null,\"adMessageAdurlIos\":\"http://app.fxjchina.com/tAdMessage/getTAdMessageDetail?id=73584714d3494703b9eb93d7c5c9d3bc\",\"detailText\":\"<p><img src=\\\"http://www.fangxiangjia.com/pics//file/ueditor/20181120181838-4d7ba218-4e96-4f44-8aaf-5104f96f6ba8.upfile\\\" title=\\\"upfile\\\" alt=\\\"upfile\\\"/></p>\"}]";
//       List<Student> allElement2 = JSON.parseArray(json, Student.class); //最难理解 特别重要（1）循环 new student对象 并设置成员变量的值 （2） 并把 所有student对象存到ArrayList中 ，然后返回List

//
       List<DataBean> dataBeans = JSON.parseArray(json, DataBean.class);
       System.out.println(dataBeans);
    }
}
