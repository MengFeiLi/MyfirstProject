package lianxi.lianxi03.zuoye;
/*
 * 表示飞机类
 */
public class Airplane {
    public String age;

    public Airplane(String ageArg) {
        this.age = ageArg;
    }
    public void fly(){
        System.out.println("号航班带游客到目的地");
    }
}
