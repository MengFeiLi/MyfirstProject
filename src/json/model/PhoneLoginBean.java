package json.model;

/**
 * 登录接口Model 类
 *
 * @author: ChrisLee
 * @time: 2019/1/7
 */

public class PhoneLoginBean extends BaseBean {
    /**
     * status : 200
     * time : 1540369026352
     * signature : null
     * data : {"id":"9f2114ddb99245a6bd15a5ff47d59fdb","mobile":"18551815425","openId":null,"nickname":"18551815425","sex":null,"password":null,"realEnable":"0","realDelete":"0","headImg":null,"createTime":[2018,10,24,16,17,6,341000000],"updateTime":[2018,10,24,16,17,6,341000000],"userLevel":null,"tollCode":null,"sfyUser":null,"currentTimeMillis":0,"token":"9f2114ddb99245a6bd15a5ff47d59fdb","key":null,"photoUrl":null}
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {

        /**
         * id : 9f2114ddb99245a6bd15a5ff47d59fdb
         * mobile : 18551815425
         * openId : null
         * nickname : 18551815425
         * sex : null
         * password : null
         * realEnable : 0
         * realDelete : 0
         * headImg : null
         * createTime : [2018,10,24,16,17,6,341000000]
         * updateTime : [2018,10,24,16,17,6,341000000]
         * userLevel : null
         * tollCode : null
         * sfyUser : null
         * currentTimeMillis : 0
         * token : 9f2114ddb99245a6bd15a5ff47d59fdb
         * key : null
         * photoUrl : null
         */

        private String id;//用户id
        private String mobile;//用户手机号
        private String openId;
        private String nickname;//用户昵称
        private String sex;//性别
        private String password;
        private String realEnable;
        private String realDelete;
        private String headImg;//用户头像
        private String userLevel;
        private String tollCode;
        private String sfyUser;
        private int currentTimeMillis;
        private String token;//token
        private String key;
        private String photoUrl;//用户头像
        private Object createTime;
        private Object updateTime;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getOpenId() {
            return openId;
        }

        public void setOpenId(String openId) {
            this.openId = openId;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getRealEnable() {
            return realEnable;
        }

        public void setRealEnable(String realEnable) {
            this.realEnable = realEnable;
        }

        public String getRealDelete() {
            return realDelete;
        }

        public void setRealDelete(String realDelete) {
            this.realDelete = realDelete;
        }

        public String getHeadImg() {
            return headImg;
        }

        public void setHeadImg(String headImg) {
            this.headImg = headImg;
        }

        public String getUserLevel() {
            return userLevel;
        }

        public void setUserLevel(String userLevel) {
            this.userLevel = userLevel;
        }

        public String getTollCode() {
            return tollCode;
        }

        public void setTollCode(String tollCode) {
            this.tollCode = tollCode;
        }

        public String getSfyUser() {
            return sfyUser;
        }

        public void setSfyUser(String sfyUser) {
            this.sfyUser = sfyUser;
        }

        public int getCurrentTimeMillis() {
            return currentTimeMillis;
        }

        public void setCurrentTimeMillis(int currentTimeMillis) {
            this.currentTimeMillis = currentTimeMillis;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getPhotoUrl() {
            return photoUrl;
        }

        public void setPhotoUrl(String photoUrl) {
            this.photoUrl = photoUrl;
        }

        public Object getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Object createTime) {
            this.createTime = createTime;
        }

        public Object getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Object updateTime) {
            this.updateTime = updateTime;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "id='" + id + '\'' +
                    ", mobile='" + mobile + '\'' +
                    ", openId='" + openId + '\'' +
                    ", nickname='" + nickname + '\'' +
                    ", sex='" + sex + '\'' +
                    ", password='" + password + '\'' +
                    ", realEnable='" + realEnable + '\'' +
                    ", realDelete='" + realDelete + '\'' +
                    ", headImg='" + headImg + '\'' +
                    ", userLevel='" + userLevel + '\'' +
                    ", tollCode='" + tollCode + '\'' +
                    ", sfyUser='" + sfyUser + '\'' +
                    ", currentTimeMillis=" + currentTimeMillis +
                    ", token='" + token + '\'' +
                    ", key='" + key + '\'' +
                    ", photoUrl='" + photoUrl + '\'' +
                    ", createTime=" + createTime +
                    ", updateTime=" + updateTime +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "PhoneLoginBean{" +
                "data=" + data +
                '}';
    }
}
