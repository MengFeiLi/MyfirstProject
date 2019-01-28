package json.model;

/**
 * 获取验证码Model 类
 * @author: ChrisLee
 * @time: 2019/1/7
 */

public class SendShortBean {
    private String status;
    private String describe;
    private String time;
    private String signature;
    private String data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SendShortBean{" +
                "status='" + status + '\'' +
                ", describe='" + describe + '\'' +
                ", time='" + time + '\'' +
                ", signature='" + signature + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
