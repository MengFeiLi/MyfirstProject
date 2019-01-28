package json.model;

public class GetUserDetailBean extends BaseBean{

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean{//data  jsonObject
        private UserDataBean userData;

        public UserDataBean getUserData() {
            return userData;
        }

        public void setUserData(UserDataBean userData) {
            this.userData = userData;
        }

        public static class UserDataBean{//data--->>>>userData jsonObject
             private String id;
             private String mobile;
             private String openId;
             private String nickname;
             private String sex;
             private String password;
             private String realEnable;
             private String realDelete;
             private String headImg;
             private String userLevel;
             private String tollCode;
             private String sfyUser;
             private String registrationId;




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

            public String getRegistrationId() {
                return registrationId;
            }

            public void setRegistrationId(String registrationId) {
                this.registrationId = registrationId;
            }

        }
    }
}
