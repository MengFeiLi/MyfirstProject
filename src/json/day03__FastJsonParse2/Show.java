package json.day03__FastJsonParse2;

public class Show {

    private String n;//json字符串中的演唱会名

    private String priceName;//票价

    private String t;//日期

    private String CityName;//地点

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getPriceName() {
        return priceName;
    }

    public void setPriceName(String priceName) {
        this.priceName = priceName;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    @Override
    public String toString() {
        String str = n + "\n" + priceName + "\n" + t + "\n" + CityName + "\n" + "\n" + "\n";
        return str;
    }

}
