package json.model;

import java.util.List;
import java.util.Set;

public class App_Vehicles_Under_NameBean {
    private String msg;
    private String code;
    private String desc;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    //JSONObject里的owner
    private OwnerBean owner;

    public OwnerBean getOwner() {
        return owner;
    }

    public void setOwner(OwnerBean owner) {
        this.owner = owner;
    }

    public static class OwnerBean{
        private String residential_address;
        private String owner_name;
        private String address;
        private String identification_no;
        private String create_time;
        private String nation;
        private String sex;
        private String identification_type;
        private String birth;
        private String date_expire;
        private String pic;
        private String source;
        private String visa_authority_admin;
        private String mailing_address;
        private String date_start;
        private String update_time;
        private String phone;
        private String tel;
        private String id;

        public String getResidential_address() {
            return residential_address;
        }

        public void setResidential_address(String residential_address) {
            this.residential_address = residential_address;
        }

        public String getOwner_name() {
            return owner_name;
        }

        public void setOwner_name(String owner_name) {
            this.owner_name = owner_name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getIdentification_no() {
            return identification_no;
        }

        public void setIdentification_no(String identification_no) {
            this.identification_no = identification_no;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getNation() {
            return nation;
        }

        public void setNation(String nation) {
            this.nation = nation;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getIdentification_type() {
            return identification_type;
        }

        public void setIdentification_type(String identification_type) {
            this.identification_type = identification_type;
        }

        public String getBirth() {
            return birth;
        }

        public void setBirth(String birth) {
            this.birth = birth;
        }

        public String getDate_expire() {
            return date_expire;
        }

        public void setDate_expire(String date_expire) {
            this.date_expire = date_expire;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getVisa_authority_admin() {
            return visa_authority_admin;
        }

        public void setVisa_authority_admin(String visa_authority_admin) {
            this.visa_authority_admin = visa_authority_admin;
        }

        public String getMailing_address() {
            return mailing_address;
        }

        public void setMailing_address(String mailing_address) {
            this.mailing_address = mailing_address;
        }

        public String getDate_start() {
            return date_start;
        }

        public void setDate_start(String date_start) {
            this.date_start = date_start;
        }

        public String getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "{"+"---residential_address="+residential_address+
                    "--owner_name="+owner_name+
                    "--address="+address+
                    "--identification_no="+identification_no+
                    "--create_time="+create_time+
                    "--nation="+nation+
                    "--sex="+sex+
                    "--identification_type="+identification_type+
                    "--birth="+birth+
                    "--date_expire="+date_expire+
                    "--pic="+pic+
                    "--source="+source+
                    "--visa_authority_admin="+visa_authority_admin+
                    "--mailing_address="+mailing_address+
                    "--date_start="+date_start+
                    "--update_time="+update_time+
                    "--phone="+phone+
                    "--id="+id+
                    "--id="+id+"}";
        }
    }




    //JSONObject里的data
    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean{
        private String plate_no;
        private String state;

        public String getPlate_no() {
            return plate_no;
        }

        public void setPlate_no(String plate_no) {
            this.plate_no = plate_no;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        @Override
        public String toString() {
            return "{"+"---plate_no="+plate_no+"---state="+state+"}";
        }
    }


    @Override
    public String toString() {
        return "{"+"---owner="+owner+"---msg="+msg+"---code="+code+"---data="+data+"---desc="+desc+"}";
    }
}
