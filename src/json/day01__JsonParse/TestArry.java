package json.day01__JsonParse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TestArry {
    public static void main(String[] args) {
        String json="{\"owner\":{\"id\":0,\"identification_type\":\"居民身份证\",\"identification_no\":\"32108219800410391X\",\"owner_name\":\"季君\",\"address\":\"南京市江宁区秣陵街道胜太路22号\",\"mailing_address\":null,\"residential_address\":null,\"birth\":null,\"nation\":null,\"visa_authority_admin\":null,\"date_start\":null,\"date_expire\":null,\"tel\":\"13675169244\",\"phone\":null,\"pic\":null,\"create_time\":\"0001-01-01T00:00:00\",\"update_time\":\"0001-01-01T00:00:00\",\"source\":0,\"sex\":null},\"data\":[{\"plate_no\":\"AA00199\",\"state\":\"正常\"},{\"plate_no\":\"AA00167\",\"state\":\"正常\"},{\"plate_no\":\"AA00165\",\"state\":\"正常\"},{\"plate_no\":\"AA00161\",\"state\":\"暂扣，事故逃逸，注销，查封\"}],\"code\":200,\"msg\":\"success\",\"desc\":\"获取成功\"}";

        try {
            JSONObject object = new JSONObject(json);

            JSONObject owner = object.getJSONObject("owner");
            String address = owner.getString("address");
            System.out.println("地址:"+address);

            JSONArray dataArray = object.getJSONArray("data");
            for (int i=0;i<dataArray.length();i++){
                JSONObject jsonObject = dataArray.getJSONObject(i);
                String plate_no = jsonObject.getString("plate_no");
                String state = jsonObject.getString("state");
                System.out.println(i+"====="+plate_no+"-----"+state);
            }

            String code = object.getString("code");
            System.out.println(code);


        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}
