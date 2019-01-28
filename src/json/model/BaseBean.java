package json.model;

/**
 * 所有接口公共返回值
 */
public class BaseBean {
    private String describe;
    private String signature;
    /**
     * 200：成功
     * 300：服务器和数据库打交道出错
     * 500：系统错误
     * -1：参数出错---每个接口会有相应出错描述
     * 4000：获取key值时候，协议号（即版本号eg：version_1.0）不正确，无权访问
     * 4001：key值不匹配，需要重新获取
     * 4002：key值已失效，需要重新获取
     **/
    private String status;
    private String time;

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "  status="+status+"  describe="+describe+"  time="+time+"  signature="+signature;
    }
}
