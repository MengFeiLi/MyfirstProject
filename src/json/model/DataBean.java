package json.model;
public  class DataBean {
    /**
     * "id": "d9ab08ca15d74402b7d84f9fb428aad4",
     * "adMessageName": "南京车友交流群",
     * "adMessageImgurl": "http://www.fangxiangjia.com/pics/44cf9b5712a943319453c63ec8414d06/44cf9b5712a943319453c63ec8414d06-2.png",
     * "adMessageJump": "1",
     * "adMessageAdurlAndroid": "http://app.fxjchina.com/tAdMessage/getTAdMessageDetail?id=d9ab08ca15d74402b7d84f9fb428aad4",
     * "createTime": "2018-11-08 17:40:07",
     * "updateTime": "2018-11-21 10:51:45",
     * "classifyid": "afd3bd1eb5504e318ff5a241d08917c9",
     * "isok": "0",
     * "updateUser": "wanghao",
     * "sort": "1",
     * "createUser": "zhuwangyou",
     * "effectiveTime": null,
     * "expiryTime": null,
     * "adMessageAdurlIos": "http://app.fxjchina.com/tAdMessage/getTAdMessageDetail?id=d9ab08ca15d74402b7d84f9fb428aad4",
     * "detailText": "<p><img src=\"http://www.fangxiangjia.com/pics//file/ueditor/20181120181651-bcb0fe6c-d5b2-4685-b903-1ee27133624e.upfile\" title=\"upfile\" alt=\"upfile\"/></p>"
     */
    private String id;
    private String adMessageName;
    private String adMessageImgurl;
    private String adMessageJump;
    private String adMessageAdurlAndroid;
    private String createTime;
    private String updateTime;
    private String classifyid;
    private String isok;
    private String updateUser;
    private String sort;
    private String createUser;
    private String effectiveTime;
    private String expiryTime;
    private String adMessageAdurlIos;
    private String detailText;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdMessageName() {
        return adMessageName;
    }

    public void setAdMessageName(String adMessageName) {
        this.adMessageName = adMessageName;
    }

    public String getAdMessageImgurl() {
        return adMessageImgurl;
    }

    public void setAdMessageImgurl(String adMessageImgurl) {
        this.adMessageImgurl = adMessageImgurl;
    }

    public String getAdMessageJump() {
        return adMessageJump;
    }

    public void setAdMessageJump(String adMessageJump) {
        this.adMessageJump = adMessageJump;
    }

    public String getAdMessageAdurlAndroid() {
        return adMessageAdurlAndroid;
    }

    public void setAdMessageAdurlAndroid(String adMessageAdurlAndroid) {
        this.adMessageAdurlAndroid = adMessageAdurlAndroid;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getClassifyid() {
        return classifyid;
    }

    public void setClassifyid(String classifyid) {
        this.classifyid = classifyid;
    }

    public String getIsok() {
        return isok;
    }

    public void setIsok(String isok) {
        this.isok = isok;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
    }

    public String getAdMessageAdurlIos() {
        return adMessageAdurlIos;
    }

    public void setAdMessageAdurlIos(String adMessageAdurlIos) {
        this.adMessageAdurlIos = adMessageAdurlIos;
    }

    public String getDetailText() {
        return detailText;
    }

    public void setDetailText(String detailText) {
        this.detailText = detailText;
    }

    @Override
    public String toString() {
        return "DataBean{"  +
                "  id=" + id +
                "  adMessageName=" + adMessageName +
                "  adMessageImgurl=" + adMessageImgurl +
                "  adMessageJump=" + adMessageJump +
                "  adMessageAdurlAndroid=" + adMessageAdurlAndroid +
                "  createTime=" + createTime +
                "  updateTime=" + updateTime +
                "  classifyid=" + classifyid +
                "  isok=" + isok +
                "  updateUser=" + updateUser +
                "  sort=" + sort +
                "  createUser=" + createUser +
                "  effectiveTime=" + effectiveTime +
                "  expiryTime=" + expiryTime +
                "  adMessageAdurlIos=" + adMessageAdurlIos +
                "  detailText=" + detailText +
                "}";
    }
}