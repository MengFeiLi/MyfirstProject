package json.model;

/**
 *更换手机号Model类
 */

public class Update_MobileBean extends BaseBean {

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "Update_MobileBean{"+super.toString()+"  data="+data+"}";
    }

}
