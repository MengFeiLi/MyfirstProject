package lianxi.lianxi02;


public class Test {
    public static void main(String[] args) {

        /*对象的创建*/

        //创建了一个名字为"张三"身份证号为"1234567"的旅游者
        Tourist tourist = new Tourist("张三","1234567");
        //创建旅游公司
        TravelCompany company = new TravelCompany("春秋旅游");
        //创建一个飞机
        Airplane airplane = new Airplane("BJ1308");



        /*对象的使用*/
        //1、让旅游者工作
//		System.out.print(tourist.name);//调用对象的属性
        System.out.print(tourist.getName());//调用对象的公有方法访问私有属性
        tourist.book();//调用对象的方法

        //2、让旅行社去工作
        System.out.print(company.name);
        company.bookAirplane();

        //3、飞机工作
        System.out.print(airplane.num);
        airplane.fly();

    }
}
