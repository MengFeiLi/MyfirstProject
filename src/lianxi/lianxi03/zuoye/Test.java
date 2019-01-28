package lianxi.lianxi03.zuoye;

public class Test {
    public static void main(String[] args) {
        /*对象的创建*/
        //创建了一个名字为"张三"身份证号为"1234567"的旅游者
        TravelCompany travelCompany = new TravelCompany("春秋旅游");
        //创建旅游公司
        Tourist tourist = new Tourist("张三", "170221321332133213");
        //创建一个飞机
        Airplane airplane = new Airplane("BL1702");
        /*对象的使用*/
        //1、让旅游者工作
        System.out.print(tourist.getName());
        tourist.fly();
        //2、让旅行社去工作
        System.out.print(travelCompany.name);
        travelCompany.bookAriplane();
        //3、飞机工作
        System.out.print(airplane.age);
        airplane.fly();
    }
}
