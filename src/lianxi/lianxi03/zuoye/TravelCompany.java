package lianxi.lianxi03.zuoye;
/*
 * 表示旅行社的类
 */
public class TravelCompany {
    public String name;
    public TravelCompany(String nameArg){
        this.name=nameArg;
    }
    public void bookAriplane(){
        System.out.println("旅行社预定了航班");
    }
}
