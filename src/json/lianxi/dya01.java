package json.lianxi;

import org.json.JSONException;
import org.json.JSONObject;


public class dya01 {
    public static void main(String[] args) {
        d1();
    }

    public static void d1() {
        String json = "{\"status\":200,\"describe\":\"发送成功\",\"time\":1546825199488,\"signature\":null,\"data\":null}";
        try {
            JSONObject object = new JSONObject(json);
            String status = object.getString("status");
            String describe = object.getString("describe");
            String signature = object.getString("signature");
            String signature1 = object.getString("signature");
            String data = object.getString("data");

            System.out.println(status + " " + describe + " " + signature + " " + signature1 + " " + data);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
